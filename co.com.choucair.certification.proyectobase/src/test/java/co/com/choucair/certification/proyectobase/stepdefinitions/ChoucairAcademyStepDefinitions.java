package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.stepdefinitions.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.stepdefinitions.questions.Answer;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.Login;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.Search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import cucumber.api.java.en_old.Ac;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to sign up on utest$")
    public void thanJuanWantsToSignUpOnUtest(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrFirstName(),
                        academyChoucairData.get(0).getStrLastName(),
                        academyChoucairData.get(0).getStrEmailAddress(),
                        academyChoucairData.get(0).getStrDateOfBirth(),
                        academyChoucairData.get(0).getStrDay(),
                        academyChoucairData.get(0).getStrYear(),
                        academyChoucairData.get(0).getStrCity(),
                        academyChoucairData.get(0).getStrZipCode(),

                        academyChoucairData.get(0).getStrPassword(),
                        academyChoucairData.get(0).getStrPasswordConfirm()));

    }


    @When("^he get a welcome message$")
    public void heGetAWelcomeMessage(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrpased()));


    }

    @Then("^he get access$")
    public void heGetAccess(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrpased())));


    }
}
