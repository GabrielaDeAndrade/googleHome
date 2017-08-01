package commons;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class AssertsStep {

	private AssertsPage assertsPage;
	
	public AssertsStep(WebDriver driver) {
		assertsPage = new AssertsPage(driver);
	}
	
	public void checkIfImageIsDisplayed(String searchResult) {
		Assert.assertTrue(assertsPage.isImagemDisplayed(searchResult));
	}
	
	public Object checkIfPageIsOpen(String titlePage) {
		Assert.assertTrue(assertsPage.isPageOpen(titlePage));
		return this;
	}
}
