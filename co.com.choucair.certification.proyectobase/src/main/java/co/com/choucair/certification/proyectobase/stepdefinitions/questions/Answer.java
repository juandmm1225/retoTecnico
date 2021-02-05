package co.com.choucair.certification.proyectobase.stepdefinitions.questions;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.PassPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }


    public static Answer toThe(String question) {
            return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String message= Text.of(PassPage.MESSAGE).viewedBy(actor).asString();
        if(question.equals(message)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
