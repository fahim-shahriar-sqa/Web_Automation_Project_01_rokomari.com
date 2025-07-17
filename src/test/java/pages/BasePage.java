package pages;

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
}
