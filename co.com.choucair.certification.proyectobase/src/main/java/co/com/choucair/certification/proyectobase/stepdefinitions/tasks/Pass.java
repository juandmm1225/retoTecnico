package co.com.choucair.certification.proyectobase.stepdefinitions.tasks;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.PassPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

//to validate that all process was succesfull
public class Pass implements Task {

    private String strPased;

    public Pass(String strPased) {
        this.strPased = strPased;
    }



    public static Pass the(String pased) {

        return Tasks.instrumented(Pass.class,pased);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
