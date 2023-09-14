package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.AddedProduct.*;

public class SeeProducts implements Task {
    public static Performable seeProductsCart() {
        return instrumented(SeeProducts.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(Cart, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Cart),
                WaitUntil.the(Order, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(Order)


        );

    }
}
