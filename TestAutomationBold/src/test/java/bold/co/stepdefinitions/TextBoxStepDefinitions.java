package bold.co.stepdefinitions;

import bold.co.models.InformationData;
import bold.co.questions.TheMessage;
import bold.co.tasks.TaskElementTextBox;
import bold.co.tasks.TaskFillingOutTextBoxField;
import bold.co.tasks.TaskInitiationWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static bold.co.userinterface.InformationPage.*;
import static bold.co.util.Utilities.getInformationData;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class TextBoxStepDefinitions {

  @Given("that the user navigates on the {string} page to the {string} item")
  public void thatTheUserNavigatesOnThePageToTheItem(String option, String option2) {

    theActorCalled("actor")
        .attemptsTo(TaskInitiationWeb.url(), TaskElementTextBox.interaction(option, option2));
  }

  @When("filling out the text box")
  public void fillingOutTheTextBox(List<Map<String, String>> data) {
    InformationData informationData = getInformationData(data);
    theActorInTheSpotlight().remember("informationData", informationData);

    theActorInTheSpotlight().attemptsTo(TaskFillingOutTextBoxField.fillingOut(informationData));
  }

  @Then("the information gets validated")
  public void theInformationGetsValidated() {
    InformationData informationData = theActorInTheSpotlight().recall("informationData");

    theActorInTheSpotlight()
        .should(
            seeThat(
                "the label name",
                TheMessage.ofElement(NAME_LABEL),
                equalTo(informationData.getFullName())),
            seeThat(
                "the label email",
                TheMessage.ofElement(EMAIL_LABEL),
                equalTo(informationData.getEmail())),
            seeThat(
                "the label current Address",
                TheMessage.ofElement(CURRENT_ADDRESS_LABEL),
                equalTo(informationData.getCurrentAddress())),
            seeThat(
                "the label permanent Address",
                TheMessage.ofElement(PERMANENT_ADDRESS_LABEL),
                equalTo(informationData.getPermanentAddress())));
  }
}
