package co.com.choucair.certification.proyectobase.stepdefinitions.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassPage extends PageObject {



    public static final Target MESSAGE= Target.the("get the message that confirm the sign up").
            located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
