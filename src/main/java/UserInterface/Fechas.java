package UserInterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com")
public class Fechas extends PageObject
{

    public static final Target BUTTON_ELEMENTS =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));


    public static final Target BUTTON_WIDGETS =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]/div[1]"));

    public static final Target BUTTON_DATEPICKER =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//span[contains(text(),'Date Picker')]"));

    public static final Target BUTTON_SELECTDATE =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//*[@id='datePickerMonthYearInput']"));

    public static final Target BUTTON_SELECTDATEANDHOUR =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("//input[@id='dateAndTimePickerInput']"));

    public static final Target BUTTON_RESULTADO =Target.the("SELECCIONAR ELEMENTS").located(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));








}
