package page.component;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.TaskMailPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LeftMenu {

    SelenideElement taskMail = $(By.xpath("//*[@class=\"bmenu\"]//div[2]/a[1]"));

    public TaskMailPage clickTaskMail(){
        taskMail.click();
        return page(TaskMailPage.class);
    }

}
