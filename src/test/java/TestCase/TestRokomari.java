package TestCase;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SigninPage;
import utilites.DriverSetup;

public class TestRokomari extends DriverSetup {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();

    @Test
    public void TestHomePage() throws InterruptedException {
        homePage.loadAPage(homePage.url);
        //homePage.waitForSeconds(5);
        homePage.setWindowToMaximize();
        homePage.clickOnElement(homePage.close_btn);
        homePage.clickOnElement(homePage.sign_in);
        signinPage.clickOnElement(signinPage.google_btn);

        homePage.waitForSeconds(10);
    }
}
