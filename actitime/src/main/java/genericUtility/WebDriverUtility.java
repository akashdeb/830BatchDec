package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	public void waitForTheTitle(WebDriver driver, long duration, String title) {
		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.titleContains(title));
		
	}

}
