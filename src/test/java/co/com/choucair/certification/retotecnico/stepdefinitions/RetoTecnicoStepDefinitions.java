package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.Login;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.Register;
import co.com.choucair.certification.retotecnico.userinterface.UTestLoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class RetoTecnicoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than ricardo wants to register on utest$")
    public void thanRicardoWantsToRegisterOnUtest() throws Exception{
        OnStage.theActorCalled("Ricardo").wasAbleTo(
                OpenUp.thePage()
        );
    }

    @When("^he introduces his information$")
    public void heIntroducesHisInformation(List<RetoTecnicoData> retoTecnicoData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
            Register.onThePage(
                retoTecnicoData.get(0).getStrName(),
                retoTecnicoData.get(0).getStrLastName(),
                retoTecnicoData.get(0).getStrEmail(),
                retoTecnicoData.get(0).getStrBMonth(),
                retoTecnicoData.get(0).getStrBDay(),
                retoTecnicoData.get(0).getStrBYear(),
                retoTecnicoData.get(0).getStrCity(),
                retoTecnicoData.get(0).getStrZip(),
                retoTecnicoData.get(0).getStrCountry(),
                retoTecnicoData.get(0).getStrDevice(),
                retoTecnicoData.get(0).getStrModel(),
                retoTecnicoData.get(0).getStrOS(),
                retoTecnicoData.get(0).getStrPass()
            ),
            Login.inThePage(
                retoTecnicoData.get(0).getStrEmail(),
                retoTecnicoData.get(0).getStrPass()
            )
        );

        /*OnStage.theActorInTheSpotlight().attemptsTo(
                Login.inThePage(
                        retoTecnicoData.get(0).getStrEmail(),
                        retoTecnicoData.get(0).getStrPass()
                )
        );*/
    }

    @Then("^he can register on utest$")
    public void heCanRegisterOnUtest(List <RetoTecnicoData> retoTecnicoData) throws Exception{
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        Answer.toThe(
                                retoTecnicoData.get(0).getStrEmail()
                        )
                )
        );
    }
}
