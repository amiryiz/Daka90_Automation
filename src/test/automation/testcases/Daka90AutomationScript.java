package test.automation.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.automation.pageobject.Daka90AutomationPage;
import test.automation.pageobject.LibraryUtils;


public class Daka90AutomationScript {

	private static WebDriver driver = null;

	@BeforeTest
	public void setBaseURL() {
		//Chrome Browser Location
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(3000,1));
		//Browser open with maximize screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Open Daka90 URL
		driver.get("https://www.daka90.co.il");
	}

	@Test
	public void TestScript() throws InterruptedException {
		//Start execution -------------//
		//Click on tab
		Daka90AutomationPage.clickOnCategoryButton(driver);
		//Select from location
		Daka90AutomationPage.fromLocation(driver);
		//Select to location
		Daka90AutomationPage.toLocatin(driver);
		//Select from date
		Daka90AutomationPage.selectFromDate(driver);
		//Select to date
		Daka90AutomationPage.selectToDate(driver);
		//Add person count
		Daka90AutomationPage.selectPersonCount(driver);
		//Click on submit button 
		Daka90AutomationPage.clickOnSubmitButton(driver);
		//switch to new tab
		Daka90AutomationPage.changeToNewTab(driver);
		//Close JS pop-up
		Daka90AutomationPage.closeJSPopup(driver);
		//Click on added ticket 
		Daka90AutomationPage.clickOnResult(driver);
		//click on rooms
		Daka90AutomationPage.clickOnHotelRoom(driver);
		//switch to new tab
		Daka90AutomationPage.changeToNewTab(driver);
		//This method select car
		Daka90AutomationPage.selectCar(driver);
		//Click on ok order
		Daka90AutomationPage.clickOnOkOrder(driver);
		//Add details
		Daka90AutomationPage.addDetails(driver,"Test","Test","Test2.Test2@gmail.com","0123456");
		//Verify order
		Daka90AutomationPage.verifyOrderAdded(driver);
	}

	@AfterTest
	public void closeBrowser() {
		//Close Browsers ===============//
		//driver.close();
	}
}