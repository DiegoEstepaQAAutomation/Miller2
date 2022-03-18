package Task;

import Interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static UserInterface.AddUsuary.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ElementsUsuary implements Task
{

    private String nombre;
    private String apellido;
    private String email;
    private String Age;
    private String Salary;
    private String Department;


    public ElementsUsuary(String nombre,String apellido,String email,String Age,String Salary,String Department)
    {


        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Age = Age;
        this.Salary = Salary;
        this.Department = Department;


    }




    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(


                TiempoEspera.unMomento(3),
                Click.on(BUTTON_ELEMENTS),
         Click.on(BUTTON_WEBTABLES),
         Click.on(BUTTON_ADD),

                Enter.theValue(nombre).into(BUTTON_FIRST_NAME),
                Enter.theValue(apellido).into(BUTTON_LAST_NAME),
                Enter.theValue(email).into(BUTTON_EMAIL),
                Enter.theValue(Age).into(TXT_AGE),
                Enter.theValue(Salary).into(TXT_SALARY),
                Enter.theValue(Department).into(TXT_DEPARTMENT),
                Click.on(BTN_SUBMIT),
                Click.on(DELETE));


    }


    public static ElementsUsuary  nuevo (String nombre,String apellido,String email,String Age,String Salary,String Department)
    {

        return instrumented(ElementsUsuary.class,nombre,apellido,email,Age,Salary,Department);


    }
}
