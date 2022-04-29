package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    public Register(String strName, String strLastName, String strEmail, String strBMonth, String strBDay, String strBYear,
                    String strCity, String strZip, String strCountry, String strDevice, String strModel, String strOS, String strPass) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBMonth = strBMonth;
        this.strBDay = strBDay;
        this.strBYear = strBYear;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strDevice = strDevice;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strPass = strPass;
    }

    private String strName, strLastName, strEmail, strBMonth, strBDay, strBYear,
            strCity, strZip, strCountry, strDevice, strModel, strOS, strPass;

    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    public static Register onThePage(String strName, String strLastName, String strEmail, String strBMonth, String strBDay, String strBYear,
                                     String strCity, String strZip, String strCountry, String strDevice, String strModel, String strOS, String strPass) {
        return Tasks.instrumented(Register.class, strName, strLastName, strEmail, strBMonth, strBDay,
                strBYear, strCity, strZip, strCountry, strDevice, strModel, strOS, strPass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage.JOINUS_BUTTON),
                Enter.theValue(strName).into(UTestRegisterPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UTestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UTestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBMonth).from(UTestRegisterPage.DDL_BIRTHMONTH),
                SelectFromOptions.byVisibleText(strBDay).from(UTestRegisterPage.DDL_BIRTHDAY),
                SelectFromOptions.byVisibleText(strBYear).from(UTestRegisterPage.DDL_BIRTHYEAR),
                Click.on(UTestRegisterPage.NEXT_BUTTON),

                //Enter.theValue(strCity).into(UTestRegisterPage.INPUT_CITY),
                Enter.theValue(strZip).into(UTestRegisterPage.INPUT_ZIP),
                Click.on(UTestRegisterPage.SELECT_COUNTRY),
                Enter.theValue(strCountry).into(UTestRegisterPage.INPUT_COUNTRY),
                Click.on(UTestRegisterPage.SEARCHED_COUNTRY),
                Click.on(UTestRegisterPage.NEXT2_BUTTON),

                Click.on(UTestRegisterPage.SELECT_DEVICE),
                Enter.theValue(strDevice).into(UTestRegisterPage.INPUT_DEVICE),
                Click.on(UTestRegisterPage.SEARCHED_DEVICE),
                Click.on(UTestRegisterPage.SELECT_MODEL),
                Enter.theValue(strModel).into(UTestRegisterPage.INPUT_MODEL),
                Click.on(UTestRegisterPage.SEARCHED_MODEL),
                Click.on(UTestRegisterPage.SELECT_OS),
                Enter.theValue(strOS).into(UTestRegisterPage.INPUT_OS),
                Click.on(UTestRegisterPage.SEARCHED_OS),
                Click.on(UTestRegisterPage.NEXT3_BUTTON),

                Enter.theValue(strPass).into(UTestRegisterPage.INPUT_PASS),
                Enter.theValue(strPass).into(UTestRegisterPage.INPUT_CONFIRMPASS),
                Click.on(UTestRegisterPage.CHECK_TERMS),
                Click.on(UTestRegisterPage.CHECK_POLICY),
                Click.on(UTestRegisterPage.FINISH_BUTTON)
        );
    }
}



