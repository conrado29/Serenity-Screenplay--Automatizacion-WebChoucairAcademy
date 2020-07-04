package co.com.choucair.certification.ejemplo.tasks;

import co.com.choucair.certification.ejemplo.userinterface.choucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import org.openqa.selenium.By;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(choucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("ciglesiasg").into(choucairLoginPage.INPUT_USER),
                Enter.theValue("64C86YJDxt").into(choucairLoginPage.INPUT_PASSWORD),
                Click.on(choucairLoginPage.ENTER_BUTTON)
                );
    }
}
