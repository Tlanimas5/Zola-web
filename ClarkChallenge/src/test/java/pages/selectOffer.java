package pages;


import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.*;

public class selectOffer {
	
	WebDriver driver;
	//creating variables for page elements
	private By txt_username = By.xpath("//*[@id=\"user_email\"]");
	private By txt_password = By.xpath("//*[@id=\"user_password\"]");
	private By btn_login = By.xpath("//*[@id=\"new_user\"]/div[4]/input");
	String landing_url = "http://vision-pr-556.zolaelectric.com/";
	//private By dealsHeading = By.cssSelector("#ember4 > div > div > div > main > div._selection-group_1473uq > div._search_1mors6.cucumber-category-selection-search-field > div > h1");
	private By titleofferPage = By.xpath("//*[@id=\"site-content\"]/div/div[2]/div[1]/div/div[1]/div/div[1]");
	//String landing_text = "Hallo, wie möchtest du starten?";
	
	//the constructor
	public selectOffer(WebDriver driver){
		this.driver = driver;
	}
	//the url the user would be navigated to when browser is open
	public void contractsPage() throws InterruptedException {
		driver.navigate().to(landing_url);
		Thread.sleep(2000);
	}
	
	public void chooseOffer() throws InterruptedException {
		//user on page to select offer
		Thread.sleep(2000);
		Boolean Display = driver.findElement(titleofferPage).isDisplayed();
		Assert.assertTrue(Display);
		String titleOnOfferPage = driver.findElement(titleofferPage).getText();
		System.out.println("Title: "+titleOnOfferPage+" is Displayed");
		Thread.sleep(500);
		//Assert.assertEquals(expected, actual);
		Assert.assertEquals("Perfomance", titleOnOfferPage);
		//click button to access offers
		//driver.findElement(primaryOfferBtn).click();
		//driver.findElement(By.cssSelector("#ember276")).click();
		Thread.sleep(500);
		System.out.println("User is on performance page");
	}
	
	public void loginValidUser(String username, String password) throws InterruptedException
	{
		Thread.sleep(900);
		System.out.println("User is on Login form");
		//enter username
//		Random random=new Random();
//
//		int bound = random.nextInt(100000000);
//		String newEmail = username+bound+"@yahoo.com";
//		System.out.println("This is the new email - "+newEmail);
//		
		//String new_email = username+"yahoo.com";
		driver.findElement(txt_username).sendKeys(username);
		System.out.println("Username entered successfully");
		Thread.sleep(500);
		//enter password
		driver.findElement(txt_password).sendKeys(password);
		System.out.println("Password entered successfully");
		Thread.sleep(1000);
		//scroll down to login button
//		WebElement element = driver.findElement(btn_login);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		Thread.sleep(100);
//		//focus on login button
//		element.sendKeys("");
//		System.out.println("Login button is in view");
//		Thread.sleep(400);
//		//click on login button
		driver.findElement(btn_login).click();	
		System.out.println("Login successfully clicked");
		Thread.sleep(500);
	}
}
