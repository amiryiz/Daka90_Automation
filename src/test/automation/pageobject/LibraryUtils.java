package test.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibraryUtils {

    /**
     * @param driver
     * @param webElement
     * @param seconds
     * @throws InterruptedException
     * @Description wait till the element be visible ( for: text-boxes)
     */
    public static WebElement waitForElementToBeVisible (WebDriver driver, WebElement webElement, int seconds)
    {
        WebDriverWait wait= new WebDriverWait(driver, seconds);
        WebElement element =wait.until(ExpectedConditions.visibilityOf(webElement));
        return element;
    }

    /**
     * @param driver
     * @param webElement
     * @param seconds
     * @throws InterruptedException
     * @Description wait till the element be visible ( for: check-boxes, buttons )
     */
    public static WebElement waitForElementToBeclickable (WebDriver driver, WebElement webElement, int seconds)
    {
        WebDriverWait wait= new WebDriverWait(driver, seconds);
        WebElement element =wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return element;
    }
}
