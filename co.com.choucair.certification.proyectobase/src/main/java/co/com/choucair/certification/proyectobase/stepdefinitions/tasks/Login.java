package co.com.choucair.certification.proyectobase.stepdefinitions.tasks;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strDateOfBirth;
    private String strDay;
    private String strYear;
    private String strCity;
    private String strZipCode;
    private String strCountry;
    private String strPassword;
    private String strPasswordConfirm;


    public Login(String strFirstName, String strLastName, String strEmailAddress, String strDateOfBirth,String strDay, String strYear, String strCity, String strZipCode, String strCountry, String strPassword, String strPasswordConfirm) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strDateOfBirth = strDateOfBirth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
        this.strPassword = strPassword;
        this.strPasswordConfirm = strPasswordConfirm;
    }

    public static Login onThePage(String strFirstName, String strLastName, String strEmailAddress, String strDateOfBirth, String strDay, String strYear, String strCity, String strZipCode,  String strPassword, String strPasswordConfirm) {
        return Tasks.instrumented(Login.class,strFirstName,strLastName,strEmailAddress,strDateOfBirth,strDay,strYear,strCity,strZipCode,strPassword,strPasswordConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGGING_BUTTON),
            Enter.theValue(strFirstName).into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue(strLastName).into(ChoucairLoginPage.INPUT_USERL),
            Enter.theValue(strEmailAddress).into(ChoucairLoginPage.INPUT_USERE),
            Enter.theValue(strDateOfBirth).into(ChoucairLoginPage.INPUT_USERD),
            Enter.theValue(strDateOfBirth).into(ChoucairLoginPage.INPUT_USERDAY),
            Enter.theValue(strDateOfBirth).into(ChoucairLoginPage.INPUT_USERYEAR),

            Click.on(ChoucairLoginPage.LOCATION_BUTTON),
            Enter.theValue(strCity).into(ChoucairLoginPage.INPUT_CITY),
            Enter.theValue(strZipCode).into(ChoucairLoginPage.INPUT_CODE),
            //Enter.theValue(strCountry).into(ChoucairLoginPage.INPUT_COUNTRY),
            Click.on(ChoucairLoginPage.DEVICES_BUTTON),
            Click.on(ChoucairLoginPage.LAST_BUTTON),
            Enter.theValue((strPassword)).into(ChoucairLoginPage.INPUT_PASSWORD),
                    Enter.theValue((strPassword)).into(ChoucairLoginPage.INPUT_PASSWORDCONFIRM),
            Click.on(ChoucairLoginPage.SETUP_BUTTON));
    }

   }

