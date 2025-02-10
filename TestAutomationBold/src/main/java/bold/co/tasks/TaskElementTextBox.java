package bold.co.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static bold.co.userinterface.UserInterfaceTexBox.*;

@AllArgsConstructor
public class TaskElementTextBox implements Task {

  String option;
  String option2;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(ELEMENTS.of(option)),
        Click.on(ELEMENTS.of(option)),
        Click.on(TEXT_BOX.of(option2)));
  }

  public static Performable interaction(String option, String option2) {
    return Tasks.instrumented(TaskElementTextBox.class, option, option2);
  }
}
