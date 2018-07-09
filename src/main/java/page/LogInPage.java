package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LogInPage {

    SelenideElement login = $(By.xpath("//*[@name=\"ulogin\"]"));
    SelenideElement password = $(By.xpath("//*[@name=\"pass\"]"));
    SelenideElement enterBtn = $(By.xpath("//*[@name=\"//*[@id=\"login\"]/table/tbody/tr[1]/td[3]/input\"]"));

    public LogInPage openSite(){
        open("http://www.wmmail.ru");
        return this;
    }

    public LogInPage sendLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LogInPage sendPassword(String password){
        this.password.sendKeys(password);
        return this;
    }

    public MainPage clickEnterBtn(){
        password.pressEnter();
        return page(MainPage.class);
    }
    public void addBrowser(){

    }

}
