package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.component.LeftMenu;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {



    public LeftMenu useLeftMenu(){
        return page(LeftMenu.class);
    }
}
