package bold.co.userinterface;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InformationPage {
  public static final Target NAME_LABEL = Target.the("label name").located(By.id("name"));
  public static final Target EMAIL_LABEL = Target.the("label email").located(By.id("email"));
  public static final Target CURRENT_ADDRESS_LABEL =
      Target.the("label current Address")
          .located(By.xpath("//div[@id='output']//p[@id='currentAddress']"));
  public static final Target PERMANENT_ADDRESS_LABEL =
      Target.the("label permanent Address")
          .located(By.xpath("//div[@id='output']//p[@id='permanentAddress']"));
}
