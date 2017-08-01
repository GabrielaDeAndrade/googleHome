package commons;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	private WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeys(WebElement element, String value) {
		waitElement(element);
		element.sendKeys(value);
	}

	public void click(WebElement element) {
		waitElement(element);
		element.click();
	}

	public void enable(WebElement element, boolean enable) {
		if (enable) {
			if (!element.isSelected())
				element.click();
		} else {
			if (element.isSelected())
				element.click();
		}
	}
	
	public void selectOption(WebElement element, String value) {
		waitElement(element);
		new Select(element).selectByValue(value);
	}
	
	public boolean isDispleyd(WebElement element) {
		try {
			waitElement(element);
			element.isDisplayed();
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
	
	public boolean isThereIsAnAttribute(WebElement element, String attribute, String value) {
		return element.getAttribute(attribute).equals(value);
	}

	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void keyboardPressTab(WebElement element) {
		waitElement(element);
		element.sendKeys(Keys.TAB);
	}
	
	public void handleFrame(WebElement element) {
		waitElement(element);
		driver.switchTo().frame(element);
	//	driver.switchTo().defaultContent();
	}


	
}
