package pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{
    public String url = "https://www.rokomari.com/login";
    public By google_btn = By.xpath("//button[normalize-space()='Google']");
    public By email_btn = By.cssSelector(".yAlK0b");
    public String email = "fahim@yopmail.com";
    public By email_box = By.xpath("//input[@placeholder='Email or phone']");
    public By next_btn = By.xpath("//button[@id='js--btn-next']");
    public By login_btn = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");
}
