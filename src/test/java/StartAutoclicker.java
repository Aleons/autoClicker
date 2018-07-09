import org.testng.annotations.Test;
import page.AddBrowserPage;
import page.LogInPage;

public class StartAutoclicker {

    @Test
    void mailAutoclick() throws InterruptedException {
        LogInPage logInPage = new LogInPage();
        logInPage.openSite().sendLogin(System.getProperty("LOGIN")).sendPassword(System.getProperty("PASS")).clickEnterBtn()
                .useLeftMenu()
                .clickTaskMail()
                .clickMail();
    }

    @Test
    void addBrowser(){
        AddBrowserPage addBrowserPage = new AddBrowserPage();
        addBrowserPage.addBrowser();
    }

}