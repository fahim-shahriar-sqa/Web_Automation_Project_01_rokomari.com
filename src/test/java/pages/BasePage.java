package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilites.DriverSetup.getDriver;

public class BasePage {

    //  Browser/Navigation Methods

    public void loadUrl(String url) { getDriver().get(url); }
    public String getPageTitle() { return getDriver().getTitle(); }
    public String getCurrentUrl() { return getDriver().getCurrentUrl(); }
    public void refreshPage() { getDriver().navigate().refresh(); }
    public void navigateBack() { getDriver().navigate().back(); }
    public void navigateForward() { getDriver().navigate().forward(); }
    public void maximizeWindow() { getDriver().manage().window().maximize(); }
    public void minimizeWindow() { getDriver().manage().window().minimize(); }
    public void fullscreenWindow() { getDriver().manage().window().fullscreen(); }

    //  Tab/Window Handling

    public void openNewTab() { getDriver().switchTo().newWindow(WindowType.TAB); }
    public void openNewWindow() { getDriver().switchTo().newWindow(WindowType.WINDOW); }
    public String getCurrentWindowHandle() { return getDriver().getWindowHandle(); }
    //public Set<String> getAllWindowHandles() { return getDriver().getWindowHandles(); }

    public void switchToWindow(String windowHandle) {
        getDriver().switchTo().window(windowHandle);
    }

    //  Element Handling

    public WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

//    public List<WebElement> getElements(By locator) {
//        return getDriver().findElements(locator);
//    }

    public void click(By locator) {
        getElement(locator).click();
    }

    public void type(By locator, String text) {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By locator) {
        return getElement(locator).getText();
    }

    public String getAttribute(By locator, String attribute) {
        return getElement(locator).getAttribute(attribute);
    }

    public boolean isDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public boolean isEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public boolean isSelected(By locator) {
        return getElement(locator).isSelected();
    }

    // Waits (Explicit & Fluent)

    public WebElement waitForVisibility(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public boolean waitForUrlContains(String partialUrl, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.urlContains(partialUrl));
    }

    public boolean waitForTitleContains(String partialTitle, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.titleContains(partialTitle));
    }

//    Dropdown Handling
//
//    public void selectByVisibleText(By locator, String text) {
//        Select select = new Select(getElement(locator));
//        select.selectByVisibleText(text);
//    }
//
//    public void selectByValue(By locator, String value) {
//        Select select = new Select(getElement(locator));
//        select.selectByValue(value);
//    }
//
//    public void selectByIndex(By locator, int index) {
//        Select select = new Select(getElement(locator));
//        select.selectByIndex(index);
//    }

    // Checkbox/Radio Handling

    public void checkCheckbox(By locator) {
        WebElement checkbox = getElement(locator);
        if (!checkbox.isSelected()) checkbox.click();
    }

    public void uncheckCheckbox(By locator) {
        WebElement checkbox = getElement(locator);
        if (checkbox.isSelected()) checkbox.click();
    }

    public void selectRadio(By locator) {
        getElement(locator).click();
    }

    //  Mouse & Keyboard Actions

    public void hoverOver(By locator) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getElement(locator)).perform();
    }

    public void doubleClick(By locator) {
        Actions actions = new Actions(getDriver());
        actions.doubleClick(getElement(locator)).perform();
    }

    public void rightClick(By locator) {
        Actions actions = new Actions(getDriver());
        actions.contextClick(getElement(locator)).perform();
    }

    public void dragAndDrop(By source, By target) {
        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(getElement(source), getElement(target)).perform();
    }

    //  Alert Handling

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public String getAlertText() {
        return getDriver().switchTo().alert().getText();
    }

    public void sendTextToAlert(String text) {
        getDriver().switchTo().alert().sendKeys(text);
    }


    //

}
