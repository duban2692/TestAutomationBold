package bold.co.util;

import bold.co.models.InformationData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class Utilities {

  public static String getBrowser() {
    String[] drivers = {"chrome"}; // "firefox", "edge"
    int value = Faker.instance().random().nextInt(drivers.length);
    return drivers[value];
  }

  public static WebDriver getWebDriver(String browser) {
    WebDriver webDriver;

    switch (browser) {
      case "chrome":
        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        break;
      case "firefox":
        webDriver = new FirefoxDriver();
        break;
      case "edge":
        webDriver = new EdgeDriver();
        break;
      default:
        log.error("The browser is invalid");
        return null;
    }

    webDriver.manage().window().maximize();
    return webDriver;
  }

  public static InformationData getInformationData(List<Map<String, String>> data) {
    return new ObjectMapper().convertValue(data.getFirst(), InformationData.class);
  }
}
