package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import tasks.FormData;
import tasks.Purchase;
import tasks.SeeProducts;
import tasks.SelectProduct;
import userinterfaces.PrincipalPage;
public class compraStep {
    @Managed(driver= "chrome")
    private WebDriver browser;
    private Actor actor = Actor.named("Global");
    private PrincipalPage principalPage = new PrincipalPage();
    @Given("User on product page")
    public void user_on_product_page() {
        actor.can(BrowseTheWeb.with(browser));
        actor.wasAbleTo(Open.browserOn(principalPage));
    }
    @When("^Select product (.*) brand (.*) other product (.*) brand (.*)")
    public void select_product_brand_other_product_brand(String Category_P, String Galaxy, String Category_M, String Mac_A) {
        actor.wasAbleTo(
                SelectProduct.Description(Category_P, Galaxy, Category_M, Mac_A)
        );
    }
    @Then("See cart")
    public void see_cart() {
        actor.wasAbleTo(
                SeeProducts.seeProductsCart());
    }
    @Then("Checkout")
    public void checkout() {
    }
    @When("^Data entry (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void data_entry(String Name, String Country, String City, String Credit_card, String Month, String Year) {
        actor.wasAbleTo(
                FormData.DescriptionForm(Name, Country, City, Credit_card, Month, Year)
        );
    }
    @Then("I finalize purchase")
    public void i_finalize_purchase() {
        actor.wasAbleTo(
                Purchase.confirmPurchase());
    }
}
