package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddedProduct {
    public static final Target Add_Product =Target.the("Buy").locatedBy("//a[@onclick=\"addToCart(1)\" or text()='Add to cart']");
    public static final Target Home_Product =Target.the("Return").locatedBy("//a[contains(text(),'Home')]");
    public static final Target Serch_Product2 =Target.the("Select Monitors").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target Select_Product2 =Target.the("Select Apple").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target Cart =Target.the("Select Cart").locatedBy("//a[@href='cart.html' and text()='Cart']");
    public static final Target Order =Target.the("Select Cart").locatedBy("//button[@class='btn btn-success' and @data-toggle='modal' and @data-target='#orderModal']");
    public static final Target NameField =Target.the("Write Name").locatedBy("//input[@id='name']");
    public static final Target CountryField =Target.the("Write Country").locatedBy("//input[@id='country']");
    public static final Target CityField =Target.the("Write City").locatedBy("//input[@id='city']");
    public static final Target CreditField =Target.the("Write Credit").locatedBy("//input[@id='card']");
    public static final Target MonthField =Target.the("Write Month").locatedBy("//input[@id='month']");
    public static final Target YearField =Target.the("Write Year").locatedBy("//input[@id='year']");
    public static final Target SubmitData =Target.the("Confirm Purchase").locatedBy("//button[@onclick='purchaseOrder()']");
    public static final Target ConfirmData =Target.the("Purchase is ok").locatedBy("//button[contains(@class, 'btn btn-lg btn-primary') and text()='OK']");
}
