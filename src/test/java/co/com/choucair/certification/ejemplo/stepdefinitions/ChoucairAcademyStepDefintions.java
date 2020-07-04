package co.com.choucair.certification.ejemplo.stepdefinitions;

import co.com.choucair.certification.ejemplo.questions.Answer;
import co.com.choucair.certification.ejemplo.tasks.Login;
import co.com.choucair.certification.ejemplo.tasks.OpenUp;
import co.com.choucair.certification.ejemplo.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage ()
        {
            OnStage.setTheStage(new OnlineCast());
        }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
        public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair()
        {
            OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
        }

    @When("^he search for de course (.*) on the choucair academy plataform$")
        public void heSearchForDeCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(String course)
        {
            OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
        }

    @Then("^he finds the course called resources (.*)$")
        public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question)
        {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        }

}

