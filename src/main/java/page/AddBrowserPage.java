package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddBrowserPage {
    LogInPage logInPage = new LogInPage();

    SelenideElement key = $(By.xpath("//*[@name=\"pass1\"]"));

    public void addBrowser() throws InterruptedException {
        logInPage.openSite().sendLogin(System.getProperty("LOGIN")).sendPassword(System.getProperty("PASS")).clickEnterBtn();
        key.sendKeys(System.getProperty("KEY"));
        key.pressEnter();
        Thread.sleep(2000);
        $(By.xpath("/html/body/div[2]/div/table/tbody/tr/td/table[3]/tbody/tr/td[3]/nobr/a[2]")).pressEnter();
    }
}
