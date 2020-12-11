package Step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

import io.cucumber.java.en.*;
import pages.selectOffer;

public class completeOffer {
	WebDriver driver = null;
	selectOffer offer;

	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("I am running the right file");
		//setting path to project parent folder
		String projectPath = System.getProperty("user.dir");
		//setting local path to Chromedriver
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		//set browser as Chrome
		driver = new ChromeDriver();

		//set the wait time for elements to load
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//set wait time for page to load in case of a slow network
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//set browser at full screen
		driver.manage().window().maximize();
	}

	@And("^user enters (.*) and (.*) then click login$")
	public void user_provides__username_and_password_for_registration(String username, String password) throws InterruptedException {
		offer = new selectOffer(driver);
		offer.contractsPage();
		offer.loginValidUser(username, password);
		
	}
	@Then("confirm user is on the performance page")
	public void confirm_user_is_on_the_performance_page() throws InterruptedException {
		offer = new selectOffer(driver);

		Thread.sleep(1000);
		offer.chooseOffer();
		driver.getPageSource().contains("Performance");
		driver.close();
	}

}
