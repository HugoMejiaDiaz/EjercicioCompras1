package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptAlert implements Task {
    public static AcceptAlert accept() {
        return instrumented(AcceptAlert.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
        Duration tiempoDeEspera = Duration.ofSeconds(10); // Cambia 10 al valor que necesites
        WebDriverWait wait = new WebDriverWait(driver, tiempoDeEspera);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}