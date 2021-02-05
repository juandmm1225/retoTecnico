package co.com.choucair.certification.proyectobase.stepdefinitions.tasks;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUp implements Task {

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


    public SignUp(String strFirstName, String strLastName, String strEmailAddress, String strDateOfBirth, String strDay, String strYear, String strCity, String strZipCode, String strPassword, String strPasswordConfirm) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strDateOfBirth = strDateOfBirth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        //this.strCountry = strCountry;
        this.strPassword = strPassword;
        this.strPasswordConfirm = strPasswordConfirm;
    }

    public static SignUp onThePage(String strFirstName, String strLastName, String strEmailAddress, String strDateOfBirth, String strDay, String strYear, String strCity, String strZipCode, String strPassword, String strPasswordConfirm) {
        return Tasks.instrumented(SignUp.class,strFirstName,strLastName,strEmailAddress,strDateOfBirth,strDay,strYear,strCity,strZipCode,strPassword,strPasswordConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(SignUpPage.INIT_BUTTON),
            Enter.theValue(strFirstName).into(SignUpPage.INPUT_USER),
            Enter.theValue(strLastName).into(SignUpPage.INPUT_USERL),
            Enter.theValue(strEmailAddress).into(SignUpPage.INPUT_USERE),
            Enter.theValue(strDateOfBirth).into(SignUpPage.INPUT_USERD),
            Enter.theValue(strDay).into(SignUpPage.INPUT_USERDAY),
            Enter.theValue(strYear).into(SignUpPage.INPUT_USERYEAR),

            Click.on(SignUpPage.LOCATION_BUTTON),
            Enter.theValue(strCity).into(SignUpPage.INPUT_CITY),
            Enter.theValue(strZipCode).into(SignUpPage.INPUT_CODE),
            //Enter.theValue(strCountry).into(SignUpPage.INPUT_COUNTRY),
            Click.on(SignUpPage.DEVICES_BUTTON),
            Click.on(SignUpPage.LAST_BUTTON),
            Enter.theValue((strPassword)).into(SignUpPage.INPUT_PASSWORD),
                    Enter.theValue((strPassword)).into(SignUpPage.INPUT_PASSWORDCONFIRM),
            Click.on(SignUpPage.SETUP_BUTTON));
    }

   }

