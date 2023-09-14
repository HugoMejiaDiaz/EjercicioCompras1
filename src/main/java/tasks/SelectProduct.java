package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.AddedProduct.*;
import static userinterfaces.PrincipalPage.*;
public class SelectProduct implements Task {
    private String Category_P;
    private String Galaxy;
    private String Category_M;
    private String Mac_A;
    private WebDriver driver;
    private Alert alert;

    public SelectProduct(String Category_P, String Galaxy, String Category_M, String Mac_A){

        this.Category_P=Category_P;
        this.Galaxy=Galaxy;
        this.Category_M=Category_M;
        this.Mac_A=Mac_A;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(Serch_Product.of(Category_P), isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Serch_Product.of(Category_P)),
                WaitUntil.the(Select_Product.of(Galaxy), isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Select_Product.of(Galaxy)),
                WaitUntil.the(Add_Product, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Add_Product)
        );
        actor.attemptsTo(AcceptAlert.accept());
        actor.attemptsTo(
                WaitUntil.the(Home_Product, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Home_Product),
                WaitUntil.the(Serch_Product2.of(Category_M), isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Serch_Product2.of(Category_M)),
                WaitUntil.the(Select_Product2.of(Mac_A), isVisible()).forNoMoreThan(15).seconds(),
                Click.on(Select_Product2.of(Mac_A)),
                WaitUntil.the(Add_Product, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Add_Product)
        );
        actor.attemptsTo(AcceptAlert.accept());
        actor.attemptsTo(
                WaitUntil.the(Home_Product, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Home_Product)
        );
    }
    public static SelectProduct Description(String Category_P, String Galaxy, String Category_M, String Mac_A) {
        return instrumented(SelectProduct.class, Category_P, Galaxy, Category_M, Mac_A );
    }
}