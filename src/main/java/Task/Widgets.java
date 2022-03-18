package Task;

import Interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static UserInterface.AddUsuary.BUTTON_FIRST_NAME;
import static UserInterface.Fechas.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Widgets implements Task
{

    private String fechaInicial;
    private String fechaHora;


    public Widgets(String fechaInicial,String fechaHora)
    {


        this.fechaInicial = fechaInicial;
        this.fechaHora = fechaHora;

    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(
                TiempoEspera.unMomento(10),
                Click.on(BUTTON_ELEMENTS),
                Click.on(BUTTON_ELEMENTS),
                Click.on(BUTTON_WIDGETS),
                Click.on(BUTTON_DATEPICKER),
                Click.on(BUTTON_SELECTDATE),
                Hit.the(Keys.SHIFT,Keys.HOME).into(BUTTON_SELECTDATE),
                Hit.the(Keys.BACK_SPACE).into(BUTTON_SELECTDATE),
                TiempoEspera.unMomento(10),
                Enter.theValue(fechaInicial).into(BUTTON_SELECTDATE),
                Enter.keyValues(Keys.ENTER).into(BUTTON_SELECTDATE),
                TiempoEspera.unMomento(5),
                Hit.the(Keys.SHIFT,Keys.HOME).into(BUTTON_SELECTDATEANDHOUR),
                Hit.the(Keys.BACK_SPACE).into(BUTTON_SELECTDATEANDHOUR),
                TiempoEspera.unMomento(2),
                Enter.theValue(fechaHora).into(BUTTON_SELECTDATEANDHOUR),
                TiempoEspera.unMomento(2));

    }



    public static Widgets  nuevafecha (String fechaInicial,String fechaHora)
    {

        return instrumented(Widgets.class,fechaInicial,fechaHora);


    }
}
