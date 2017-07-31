package commons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void closeWindow() {
		driver.quit();
	}
	
}
