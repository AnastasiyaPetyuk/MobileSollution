package pages;

import browser.Browser;
import org.openqa.selenium.By;

public class BaseElement {
    protected By locator;
    public BaseElement(By locator) {
        this.locator = locator;
    }

    public void click() {
        Browser.getDriver().findElement(locator).click();
    }
    public String getText() {
        return Browser.getDriver().findElement(locator).getText();
    }
    public void sendKeys(String string) {
        Browser.getDriver().findElement(locator).sendKeys(string);
    }
    public boolean isDisplayed() {
        return Browser.getDriver().findElement(locator).isDisplayed();
    }
}
