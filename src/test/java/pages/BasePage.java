package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilites.DriverSetup.getDriver;

public class BasePage {

    public void loadAPage(String url) {
        getDriver().get(url);
    }

    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    public String getPageTitle() {
        return getDriver().getTitle();
    }

    public void setWindowToFullscreen() {
        getDriver().manage().window().fullscreen();
    }

    public void setWindowToMinimize() {
        getDriver().manage().window().minimize();
    }

    public void setWindowToMaximize() {
        getDriver().manage().window().maximize();
    }

    public void refresh(){
        getDriver().navigate().refresh();
    }

    public void goBack(){
        getDriver().navigate().back();
    }

    public void goForward(){
        getDriver().navigate().forward();
    }

    public void switchToNewTab(){
        getDriver().switchTo().newWindow(WindowType.TAB);
    }

    public void switchToNewWindow(){
        getDriver().switchTo().newWindow(WindowType.WINDOW);
    }

    public void windowHandle(){
        getDriver().getWindowHandle();
    }

    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    public void writeOnElement(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public boolean visibleState(By locator){
        return getElement(locator).isDisplayed();
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public WebElement waitForElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
