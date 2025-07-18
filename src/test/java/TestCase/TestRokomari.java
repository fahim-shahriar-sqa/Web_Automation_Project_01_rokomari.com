package TestCase;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.WriterPage;
import pages.SigninPage;
import utilites.DriverSetup;

public class TestRokomari extends DriverSetup {

    HomePage homePage = new HomePage();
    SigninPage signinPage = new SigninPage();
    WriterPage writerPage = new WriterPage();

    @Test
    public void TestSignUp() throws InterruptedException {
        homePage.loadUrl(homePage.url);
        homePage.maximizeWindow();
        homePage.click(homePage.close_btn);
        homePage.click(homePage.sign_in);
        signinPage.sendKeys(signinPage.email_box, signinPage.email);
        signinPage.click(signinPage.next_btn);
        Thread.sleep(10000);
        signinPage.click(signinPage.login_btn);
    }

    @Test
    public void TestSelectWriter() throws InterruptedException {
        homePage.loadUrl(homePage.urlAfterLogin);
        Thread.sleep(3000);
        writerPage.hoverOver(writerPage.writer);
        Thread.sleep(3000);
        writerPage.click(writerPage.writer_name);
        Thread.sleep(3000);
        writerPage.checkCheckbox(writerPage.radio_1);
        Thread.sleep(3000);
    }
}
