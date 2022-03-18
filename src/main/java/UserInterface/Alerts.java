package UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com")
public class Alerts extends PageObject
{

    public static final Target BUTTON_INI =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
    ////body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]
    public static final Target BUTTON_ALERTS_FRAME =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]"));

    public static final Target BUTTON_ALERTS =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//span[contains(text(),'Alerts')]"));

    public static final Target BUTTON_ALERT1 =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='alertButton']"));

    public static final Target BUTTON_ALERT2 =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='timerAlertButton']"));

    public static final Target BUTTON_ALERT3 =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='confirmButton']"));

    public static final Target BUTTON_ALERT4 =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//button[@id='promtButton']"));

    public static final Target RESULTADO =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));










}
