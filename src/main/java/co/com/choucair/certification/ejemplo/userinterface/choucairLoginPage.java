package co.com.choucair.certification.ejemplo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class choucairLoginPage extends PageObject
{
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("button that shows us the form to login").located(By.xpath("//*[@id=\'username\']"));

    public static final Target INPUT_PASSWORD = Target.the("button that shows us the form to login").located(By.xpath("//*[@id=\'password\']"));

    public static final Target ENTER_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"));
}
