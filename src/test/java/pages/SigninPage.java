package pages;

import org.openqa.selenium.By;

public class SigninPage extends BasePage{
    public String url = "https://www.rokomari.com/login";
    public By google_btn = By.xpath("//button[normalize-space()='Google']");
    public By email_btn = By.cssSelector(".yAlK0b");
    public String email = "test.fahim54@gmail.com";

}
