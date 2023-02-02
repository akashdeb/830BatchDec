package HomePageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMRepo.HomePage;
import POMRepo.LoginPage;
import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;

public class ToVerifyHomePageTitleTest extends BaseClass{
	@Test
	public void toVerifyHomePageTitleTest() {
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		wUtils.waitForTheTitle(driver, 20, expectedTitle);
		
		HomePage home = new HomePage(driver);
		String actualTitle = home.verifyHomePageTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified");
		
	}

}
