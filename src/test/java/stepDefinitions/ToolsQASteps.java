package stepDefinitions;

import Task.Alerts;
import Task.ElementsUsuary;
import Task.Widgets;
import UserInterface.AddUsuary;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static UserInterface.AddUsuary.BUTTON_WEBTABLES;
import static UserInterface.Alerts.BUTTON_ALERTS_FRAME;
import static UserInterface.Fechas.BUTTON_WIDGETS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ToolsQASteps

{
@Managed(driver = "chrome")

private WebDriver driver;
private Actor actor =Actor.named("Global");

private AddUsuary usuary = new AddUsuary();


@Dado("que un usuario accede a la web de toolsqa")
public void queunusuarioaccedealawebdetoolsqayhacewidgets()
{

    actor.can(BrowseTheWeb.with(driver));

    driver.manage().window().maximize();

    actor.wasAbleTo(Open.browserOn(usuary));

}

@Cuando("^el agrega (.*),(.*),(.*),(.*),(.*),(.*)de usuario$")
public void elagregaunusuarionuevoyeliminaunoviejo(String nombre,String apellido,String email,String Age,String Salary,String Department)
{
actor.wasAbleTo(ElementsUsuary.nuevo(nombre, apellido, email, Age, Salary, Department));

}
@Entonces("^el ve el menu de web tables$")
public void elveelmenudewebtables()
{
    actor.should(seeThat(the(BUTTON_WEBTABLES),isPresent()));
}

@Cuando("^el agrega (.*),(.*) en Widgets")
public void queunusuarioaccedealawebdetoolsqayhacewidgets(String fechainicial, String fechaHora)
{
    actor.wasAbleTo(Widgets.nuevafecha(fechainicial,fechaHora));
}



@Cuando("^el agrega (.*) en alerts")
public void elusuarionavegaporlasalertas(String valorfinal)
{
    actor.wasAbleTo(Alerts.alertas(valorfinal));


}

    @Entonces("^el ve el menu de Widgets$")
    public void elveelmenudeWidgets()
    {
        actor.should(seeThat(the(BUTTON_WIDGETS),isPresent()));
    }

    @Entonces("^el ve el titulo toolsqa$")
    public void elveeltitulotoolsqa()
    {
        actor.should(seeThat(the(BUTTON_ALERTS_FRAME),isPresent()));
    }



}
