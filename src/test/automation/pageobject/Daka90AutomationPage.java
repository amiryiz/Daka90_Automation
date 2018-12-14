package test.automation.pageobject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class Daka90AutomationPage {

	/**
	 * @param driver
	 * @throws InterruptedException 
	 * @Description Thismethod click on active tab
	 */
	public static void clickOnCategoryButton(WebDriver driver) throws InterruptedException {
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='buttontab5']")).click();

		WebElement categoryButtonElement = driver.findElement(By.xpath("//*[@id='buttontab5']"));
		LibraryUtils.waitForElementToBeclickable(driver,categoryButtonElement,10).click();
	}

	public static void fromLocation(WebDriver driver) throws InterruptedException {
		//driver.findElement(By.xpath("//input[@id='fromLocation']")).click();
		//Thread.sleep(2000);

		WebElement fromLocationElement =driver.findElement(By.xpath("//input[@id='fromLocation']"));
		LibraryUtils.waitForElementToBeclickable(driver,fromLocationElement,10).click();
		Thread.sleep(500);
		LibraryUtils.waitForElementToBeVisible(driver,fromLocationElement,10).sendKeys("תל אביב, ישראל");
		Thread.sleep(500);


		//driver.findElement(By.xpath("//input[@id='fromLocation']")).sendKeys("ישראל");
		//Thread.sleep(3000);
	}

	/**
	 * @param driver
	 * @throws InterruptedException 
	 * @Description This method select Location
	 */
	public static void toLocatin(WebDriver driver) throws InterruptedException{
		//Thread.sleep(100);
		//driver.findElement(By.xpath("//input[@id='toLocation']")).click();

		WebElement toLocationElement = driver.findElement(By.xpath("//input[@id='toLocation']"));
		LibraryUtils.waitForElementToBeclickable(driver,toLocationElement,10).click();
		Thread.sleep(500);
		LibraryUtils.waitForElementToBeVisible(driver,toLocationElement,10).sendKeys("אמסטרדם, הולנד - AMS");
		Thread.sleep(500);

		//Thread.sleep(500);
		//driver.findElement(By.xpath("//input[@id='toLocation']")).sendKeys("אמסטרדם");
		//Thread.sleep(500);
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException 
	 * @Description This methos select to date
	 */
	public static void selectFromDate(WebDriver driver) throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='from2']")).click();
		//stores all webelements of the days in List (35 objects) and click on 27th
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table//td"));

		int total_node=dates.size();

		for(int i=0;i<total_node;i++)
		{
			String date=dates.get(i).getText();
			if(date.equals("27"))
			{
				dates.get(i).click();
				break;
			}
		}
		Thread.sleep(1000);
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 * Description This method select from date
	 */
	public static void selectToDate(WebDriver driver) throws InterruptedException{
		Thread.sleep(100);
		driver.findElement(By.xpath(".//*[@id='to2']")).click();
		List<WebElement>dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table//td"));
		int total_node=dates.size();

		for(int i=0;i<total_node;i++)
		{
			String date=dates.get(i).getText();
			if(date.equals("8"))
			{
				dates.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[4]/a")).click();
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 * @Description This method add person count
	 */
	public static void selectPersonCount(WebDriver driver) throws InterruptedException{
		Thread.sleep(10);
		driver.findElement(By.xpath(".//*[@id='personsCount']")).click();
		driver.findElement(By.xpath(".//*[@id='plusBaby']")).click();
		driver.findElement(By.xpath("//*[@id='personsOk']")).click();
	}

	/**
	 * @param driver
	 * @throws InterruptedException
	 * @Description This method click on submit button
	 */
	public static void clickOnSubmitButton(WebDriver driver) throws InterruptedException{
		Thread.sleep(10);
		driver.findElement(By.xpath(".//*[@id='submitSearch']")).click();
		//Actions action= new Actions(driver);
		//action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException 
	 * @Description This method click on result
	 */
	public static void clickOnResult(WebDriver driver) throws InterruptedException{

		Thread.sleep(4000);
		List<WebElement> orders = driver.findElements(By.xpath("//div[@class='orderRow']/a"));

		
		int total_node=orders.size();
		System.out.println(total_node);
		orders.get(4).click();

	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 * @Description This method click on hotel room
	 */
	public static void clickOnHotelRoom(WebDriver driver)throws InterruptedException{
		Thread.sleep(8000);

		List<WebElement> hotels = driver.findElements(By.xpath("//div[@class='orderRow']/a"));

		int total_node=hotels.size();
		System.out.println(total_node);
		hotels.get(2).click();


		// action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();

	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 * @Description This method select car
	 */
	public static void selectCar(WebDriver driver) throws InterruptedException{
		Thread.sleep(6000);

		List<WebElement> cars = driver.findElements(By.xpath("//div[@class='lineChoose']"));

		int total_node=cars.size();
		System.out.println(total_node);
		cars.get(2).click();

		//driver.findElement(By.xpath("//*[@id='mainResultContainer']/div/div[15]/div/div[5]/div[2]/div[5]/div[4]")).click();
	}
	
	/**
	 * @param driver
	 * @throws InterruptedException
	 * @Description This method click on ok order
	 */
	public static void clickOnOkOrder(WebDriver driver) throws InterruptedException{
		Thread.sleep(10);
		driver.findElement(By.xpath("//*[@id='mainResultContainer']/div/div[16]/div[2]/div[1]/div[3]/div[3]/div[2]/a")).click();
	}
	
	/**
	 * @param driver
	 * @param fname
	 * @param lname
	 * @param email
	 * @param cell
	 * @throws InterruptedException
	 * @Description This method add details
	 */
	public static void addDetails(WebDriver driver,String fname,String lname,String email,String cell) throws InterruptedException{
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='FName']")).sendKeys(fname);

		WebElement fname_element= driver.findElement(By.xpath("//*[@id='FName']"));
		LibraryUtils.waitForElementToBeVisible(driver,fname_element, 20).sendKeys(fname);

		driver.findElement(By.xpath("//*[@id='LName']")).sendKeys(lname);
		driver.findElement(By.xpath("//*[@id='txtEMail']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='txtCell']")).sendKeys(cell);
		driver.findElement(By.xpath("//*[@id='chkGetDealsToEmailAndSms']")).click();
		driver.findElement(By.xpath("//*[@id='chkConfirmPrivacyPolicy']")).click();
		driver.findElement(By.xpath("//*[@class='ContinueBTN']")).click();
	}
	
	/**
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @Description This method Verify record Added succefully
	 */
	public static boolean verifyOrderAdded(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//*[@id='participantsInfoTbl']")).isDisplayed()) {
			return true; 
		}
		return false;
	}
	/**
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @Description This method Switch to the new tab
	 */
	public static void changeToNewTab(WebDriver driver)throws InterruptedException {
		Thread.sleep(10);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	/**
	 * @param driver
	 * @return
	 * @throws InterruptedException
	 * @Description This method Close the JavaScript popup
	 */
	public static void closeJSPopup(WebDriver driver)throws InterruptedException {

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var e = document.getElementsByClassName('__ADORIC__1 __ADORIC__'); while (e[0]) {e[0].parentNode.removeChild(e[0])}");
	}
}