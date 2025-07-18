package pages;

import org.openqa.selenium.By;

public class WriterPage extends BasePage{


    public By book = By.cssSelector("a[class='menu_menuLink___xE7K menu_active__a9KcZ text-[18px]'] span");
    public By writer = By.xpath("//span[contains(text(),'লেখক')]");
    public By writer_name = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
    public By publishers = By.xpath("//input[@data-search-target='#js--publisherIds']");
    public By radio_1 = By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");

}
