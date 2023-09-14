package userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


@DefaultUrl("https://www.demoblaze.com")

public class PrincipalPage extends PageObject
{
    public static final Target Serch_Product =Target.the("Select Phones").locatedBy("//a[contains(text(),'{0}')]");
    public static final Target Select_Product =Target.the("Select s6").locatedBy("//a[contains(text(),'{0}')]");



}
