package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com")
public class AddUsuary extends PageObject
{
    public static final Target BUTTON_ELEMENTS =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));

    public static final Target BUTTON_WEBTABLES =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//span[contains(text(),'Web Tables')]"));


    public static final Target BUTTON_ADD =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='addNewRecordButton']"));

    public static final Target BUTTON_FIRST_NAME =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='firstName']"));

    public static final Target BUTTON_LAST_NAME =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='lastName']"));

    public static final Target BUTTON_EMAIL =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='userEmail']"));

    public static final Target TXT_AGE =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='age']"));

    public static final Target TXT_SALARY =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='salary']"));

    public static final Target TXT_DEPARTMENT =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='department']"));

    public static final Target BTN_SUBMIT =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='submit']"));

    public static final Target RESULTADO =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));

    public static final Target DELETE  =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//span[@id='delete-record-2']"));



    ////*[name()='path' and contains(@d,'M16 132h41')]


}
