package bold.co.userinterface;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserInterfaceTexBox {

  public static final Target ELEMENTS =
      Target.the("List de elementos")
          .locatedBy(("//div[@class='card-body']//h5[contains(text(),'{0}')]"));

  public static final Target TEXT_BOX =
      Target.the("Funcionalidad Text Box")
          .locatedBy(("//span[contains(text(),'{0}')]")); // 'Text Box')]

  public static final Target INPUT_FULL_NAME =
      Target.the("Input nombre de usuario").located(By.xpath("//input[@id='userName']"));

  public static final Target INPUT_EMAIL =
      Target.the("Input email de usuario").located(By.xpath("//input[@id='userEmail']"));

  public static final Target INPUT_CURRENT_ADDRESS =
      Target.the("Input dirección actual del usuario")
          .located(By.xpath("//textarea[@id='currentAddress']"));

  public static final Target INPUT_PERMANENT_ADDRESS =
      Target.the("Input dirección permanente del usuario")
          .located(By.xpath("//textarea[@id='permanentAddress']"));

  public static final Target BUTTON_SUBMIT =
      Target.the("Botón de enviar").located(By.xpath("//button[@id='submit']"));

  public static final Target TEXT_BOX_VALIDATION =
      Target.the("Validación caja de texto").located(By.xpath("//p[@id='name']"));
}
