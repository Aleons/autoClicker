package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddBrowserPage {
    LogInPage logInPage = new LogInPage();

    SelenideElement key = $(By.xpath("//*[@name=\"pass1\"]"));

    public void addBrowser(){
        logInPage.openSite().sendLogin(System.getProperty("LOGIN")).sendPassword(System.getProperty("PASS")).clickEnterBtn();
        key.sendKeys(System.getProperty("PASS"));
        key.pressEnter();
    }
}