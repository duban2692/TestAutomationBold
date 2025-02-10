package bold.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class TaskInitiationWeb implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Open.url("https://demoqa.com/"));
  }

  public static Performable url() {
    return Tasks.instrumented(TaskInitiationWeb.class);
  }
}
