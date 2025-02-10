package bold.co.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

@AllArgsConstructor
public class TheMessage implements Question<String> {

  private final Target target;

  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(WaitUntil.the(target, isVisible()).forNoMoreThan(10).seconds());
    return target.resolveFor(actor).getText().split(":")[1];
  }

  public static TheMessage ofElement(Target target) {
    return new TheMessage(target);
  }
}
