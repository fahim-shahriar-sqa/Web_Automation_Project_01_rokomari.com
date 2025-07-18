package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String url = "https://www.rokomari.com/";
    public String urlAfterLogin = "https://www.rokomari.com/book";
    public By close_btn = By.cssSelector("svg[width='16']");
    public By sign_in = By.xpath("//a[normalize-space()='Sign In']");


}
