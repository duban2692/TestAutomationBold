package bold.co.stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static bold.co.util.Utilities.getBrowser;
import static bold.co.util.Utilities.getWebDriver;


public class Hook {

    @Before
    public void beforeScenario() {
        String browser = getBrowser();
        WebDriverManager.getInstance(browser).setup();//Seteo del navegador
        OnStage.setTheStage(// se le pasa el navegador
                Cast.whereEveryoneCan(BrowseTheWeb.with(getWebDriver(browser)))
        );
    }
}
