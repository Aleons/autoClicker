package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class TaskMailPage {

    ElementsCollection allMail = $$(By.xpath("//*[@class=\"tbl\"]//tr"));
    int numberElement;

    public void clickMail() throws InterruptedException {
        int c = allMail.size();
        for( int i =1; i <= c;i=i++){
            allMail.get(1).$(By.xpath("./td[2]/a")).click();
            Thread.sleep(3000);
            $(By.xpath("//*[@class=\"tbl_stat\"]//tr[4]//a")).click();
            Thread.sleep(65000);
            open("http://www.wmmail.ru/index.php?cf=mail-viewpmail");
            Thread.sleep(5000);
        }
    }



}
