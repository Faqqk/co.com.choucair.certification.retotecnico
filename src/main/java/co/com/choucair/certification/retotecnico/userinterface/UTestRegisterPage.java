package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage {
    public static final Target JOINUS_BUTTON = Target.the("Join us button to register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME = Target.the("Place to write the name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Place to write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Place to write the email")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[3]/input"));
    public static final Target DDL_BIRTHMONTH = Target.the("Select birth month")
            .located(By.id("birthMonth"));
    public static final Target DDL_BIRTHDAY = Target.the("Select birth day")
            .located(By.id("birthDay"));
    public static final Target DDL_BIRTHYEAR = Target.the("Select birth year")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Next location page button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target INPUT_CITY = Target.the("Place to write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Place to write the zip code")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Select to be able to write the country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target INPUT_COUNTRY = Target.the("Place to write the country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SEARCHED_COUNTRY = Target.the("searched country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/ul"));
    public static final Target NEXT2_BUTTON = Target.the("Next devices page button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SELECT_DEVICE = Target.the("Select to be able to write the device")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div"));
    public static final Target INPUT_DEVICE = Target.the("Place to write the device")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SEARCHED_DEVICE = Target.the("searched device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul"));
    public static final Target SELECT_MODEL = Target.the("Select to be able to write the model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div"));
    public static final Target INPUT_MODEL = Target.the("Place to write the model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SEARCHED_MODEL = Target.the("Searched model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul"));
    public static final Target SELECT_OS = Target.the("Select to be able to write the os")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]"));
    public static final Target INPUT_OS = Target.the("Place to write the os")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target SEARCHED_OS = Target.the("Searched os")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul"));
    public static final Target NEXT3_BUTTON = Target.the("Next devices page button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target INPUT_PASS = Target.the("Place to write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS = Target.the("Place to write password again")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("Next devices page button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_POLICY = Target.the("Next devices page button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target FINISH_BUTTON = Target.the("Next devices page button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}



