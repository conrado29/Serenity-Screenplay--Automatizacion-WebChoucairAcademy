package co.com.choucair.certification.ejemplo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {

    public static final Target NAME_COURSE = Target.the("nombre del curso ").located(By.xpath("//*[@id=\'page-header\']/div/div/div[2]/div[1]/div/a/div/div/h1"));

    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair").located(By.xpath("//*[@id=\'universidad\']/a"));

    public static final Target INPUT_COURSE = Target.the("selecciona la universidad choucair").located(By.xpath("//*[@id=\'coursesearchbox\']"));

    public static final Target BUTTON_GO = Target.the("selecciona la universidad choucair").located(By.xpath("//*[@id=\'coursesearch\']/fieldset/button"));

    public static final Target SELECT_COURSE = Target.the("selecciona la universidad choucair").located(By.xpath("//*[@id=\'category-course-list\']/div/div[2]/div/div/div/div/a/div[2]"));
}
