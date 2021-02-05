package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.stepdefinitions.model.UtestData;
import co.com.choucair.certification.proyectobase.stepdefinitions.questions.Answer;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.SignUp;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.Pass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to sign up on utest$")
    public void thanJuanWantsToSignUpOnUtest(List<UtestData> utestData) throws Exception{
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(),
                SignUp.onThePage(utestData.get(0).getStrFirstName(),
                        utestData.get(0).getStrLastName(),
                        utestData.get(0).getStrEmailAddress(),
                        utestData.get(0).getStrDateOfBirth(),
                        utestData.get(0).getStrDay(),
                        utestData.get(0).getStrYear(),
                        utestData.get(0).getStrCity(),
                        utestData.get(0).getStrZipCode(),

                        utestData.get(0).getStrPassword(),
                        utestData.get(0).getStrPasswordConfirm()));

    }


    @When("^he get a welcome message$")
    public void heGetAWelcomeMessage(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Pass.the(utestData.get(0).getStrpased()));


    }

    @Then("^he get access$")
    public void heGetAccess(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrpased())));


    }
}
