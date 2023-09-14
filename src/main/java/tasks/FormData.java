package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.AddedProduct.*;
public class FormData implements Task {
    private String Name;
    private String Country;
    private String City;
    private String Credit_card;
    private String Month;
    private String Year;
    public FormData(String Name, String Country, String City, String Credit_card, String Month, String Year){

        this.Name=Name;
        this.Country=Country;
        this.City=City;
        this.Credit_card=Credit_card;
        this.Month=Month;
        this.Year=Year;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NameField, isVisible()),
                Enter.theValue(Name).into(NameField),
                WaitUntil.the(CountryField, isVisible()),
                Enter.theValue(Country).into(CountryField),
                WaitUntil.the(CityField, isVisible()),
                Enter.theValue(City).into(CityField),
                WaitUntil.the(CreditField, isVisible()),
                Enter.theValue(Credit_card).into(CreditField),
                WaitUntil.the(MonthField, isVisible()),
                Enter.theValue(Month).into(MonthField),
                WaitUntil.the(YearField, isVisible()),
                Enter.theValue(Year).into(YearField)
        );

    }

    public static FormData DescriptionForm(String Name, String Country, String City, String Credit_card, String Month, String Year) {
        return instrumented(FormData.class, Name, Country, City, Credit_card, Month, Year );
    }
}
