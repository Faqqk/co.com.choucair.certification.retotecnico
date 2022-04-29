package co.com.choucair.certification.retotecnico.tasks;


import co.com.choucair.certification.retotecnico.userinterface.UTestLoginPage;
import co.com.choucair.certification.retotecnico.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;

public class Login implements Task {


    public Login(String strEmail, String strPass) {
        this.strEmail = strEmail;
        this.strPass = strPass;
    }
    private String strEmail, strPass;


    public static Login inThePage() {
        return Tasks.instrumented(Login.class);
    }

    public static Login inThePage(String strEmail, String strPass){
        return Tasks.instrumented(Login.class, strEmail, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strEmail).into(UTestLoginPage.INPUT_EMAIL),
                Enter.theValue(strPass).into(UTestLoginPage.INPUT_PASS),
                Click.on(UTestLoginPage.ENTER_BUTTON));
    }
}
