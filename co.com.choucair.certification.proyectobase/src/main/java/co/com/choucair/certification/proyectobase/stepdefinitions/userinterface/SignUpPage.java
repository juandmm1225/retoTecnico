package co.com.choucair.certification.proyectobase.stepdefinitions.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage extends PageObject {
    public static final Target INIT_BUTTON = Target.the("button that shows us the form to sign up").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]"));

    public static final Target INPUT_USER = Target.the("where do write the name").
            located(By.id("firstName"));

    public static final Target INPUT_USERL = Target.the("where do write the lastname").
            located(By.id("lastName"));

    public static final Target INPUT_USERE = Target.the("where do write the email").
            located(By.id("email"));

    public static final Target INPUT_USERD = Target.the("where do write the date of birth").
            located(By.id("birthMonth"));

    public static final Target INPUT_USERDAY = Target.the("where do write the date of birth").
            located(By.id("birthDay"));

    public static final Target INPUT_USERYEAR = Target.the("where do write the date of birth").
            located(By.id("birthYear"));

    public static final Target LOCATION_BUTTON = Target.the("button to continue ahead").
            located(By.xpath("//button[contains(@class,'btn btn-blue')]"));

    public static final Target INPUT_CITY = Target.the("where do write the city").
            located(By.id("city"));

    public static final Target INPUT_CODE = Target.the("where do write the zipcode").
            located(By.id("zip"));

    public static final Target DEVICES_BUTTON = Target.the("button to continue ahead").
            located(By.xpath("//button[contains(@class,'btn btn-blue pull-rigth')]"));

    public static final Target LAST_BUTTON = Target.the("button to continue ahead").
            located(By.xpath("//button[contains(@class,'btn btn-blue pull-rigth')]"));

    public static final Target INPUT_PASSWORD = Target.the("where do write the password").
            located(By.id("password"));

    public static final Target INPUT_PASSWORDCONFIRM = Target.the("where do write the password confirm").
            located(By.id("confirmPassword"));

    public static final Target SETUP_BUTTON = Target.the("button to confirm the login").
            located(By.xpath("//button[contains(@class,'btn btn-blue')]"));

}
