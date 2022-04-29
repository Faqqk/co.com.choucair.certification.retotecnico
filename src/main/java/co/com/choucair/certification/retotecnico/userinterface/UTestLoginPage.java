package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("Login button to enter")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a"));
    public static final Target INPUT_EMAIL = Target.the("Place to write the email")
            .located(By.id("username"));
    public static final Target INPUT_PASS = Target.the("Place to write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Login button to enter")
            .located(By.id("kc-login"));
    public static final Target EMAIL_DISPLAYED = Target.the("Take the email")
            .located(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/section/div[1]/span"));
}
