package bold.co.tasks;

import bold.co.models.InformationData;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static bold.co.userinterface.UserInterfaceTexBox.*;

@AllArgsConstructor
public class TaskFillingOutTextBoxField implements Task {

  private InformationData data;

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Scroll.to(INPUT_FULL_NAME),
        Enter.theValue(data.getFullName()).into(INPUT_FULL_NAME),
        Enter.theValue(data.getEmail()).into(INPUT_EMAIL),
        Enter.theValue(data.getCurrentAddress()).into(INPUT_CURRENT_ADDRESS),
        Enter.theValue(data.getPermanentAddress()).into(INPUT_PERMANENT_ADDRESS),
        Click.on(BUTTON_SUBMIT));
  }

  public static Performable fillingOut(InformationData data) {
    return Tasks.instrumented(TaskFillingOutTextBoxField.class, data);
  }
}
