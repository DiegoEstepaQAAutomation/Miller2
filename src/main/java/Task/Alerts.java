package Task;

import Interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.SwitchToWindowTitle;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

import static UserInterface.Alerts.*;
import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.bouncycastle.crypto.tls.ContentType.alert;

public class Alerts implements Task
{
    private String valorfinal;
    //private WebDriver driver;



    public Alerts(String valorfinal)
    {
        this.valorfinal = valorfinal;



    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(



                TiempoEspera.unMomento(2),
                Click.on(BUTTON_INI),
                Click.on(BUTTON_INI),
                TiempoEspera.unMomento(10),
                Click.on(BUTTON_ALERTS_FRAME),
                Click.on(BUTTON_ALERTS),
                TiempoEspera.unMomento(6),
                Click.on(BUTTON_ALERT1),
                TiempoEspera.unMomento(10));

                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
                actor.attemptsTo(TiempoEspera.unMomento(10));

                actor.attemptsTo(
                        TiempoEspera.unMomento(6),
                        Click.on(BUTTON_ALERT2),
                        TiempoEspera.unMomento(10));
                        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

                actor.attemptsTo(
                        Click.on(BUTTON_ALERT3),
                        TiempoEspera.unMomento(5));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                actor.attemptsTo(
                        Click.on(BUTTON_ALERT3),
                        TiempoEspera.unMomento(5));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

                actor.attemptsTo(
                        Click.on(BUTTON_ALERT4),
                        TiempoEspera.unMomento(5));

                Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
                TiempoEspera.unMomento(5);
                alert.sendKeys(valorfinal);

                TiempoEspera.unMomento(20);

                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

                actor.attemptsTo(TiempoEspera.unMomento(20));







    }



    public static Alerts  alertas (String valorfinal)
    {

        return instrumented(Alerts.class,valorfinal);


    }
}
