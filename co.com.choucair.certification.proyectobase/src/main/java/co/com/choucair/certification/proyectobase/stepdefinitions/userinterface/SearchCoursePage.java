package co.com.choucair.certification.proyectobase.stepdefinitions.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    //no tengo acceso a esa instancia del sitio web así que modifico la busqueda
    //usaré certificaciones porque si puedo ver su contenido
    public static final Target BUTTON_UC = Target.the("select the courses").
            located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("search the course").
            located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("click to find the course").
            located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));

//aqui debo capturar el valor de a porque el resultado va a ser diferente dado el cambio en la busqueda
    public static final Target SELECT_COURSE = Target.the("click to select the course").
            located(By.xpath("//a[contains(text(),'Foundation Express')]"));

    public static final Target NAME_COURSE = Target.the("get the course name").
            located(By.xpath("//a[contains(text(),'Foundation Express')]"));
}
