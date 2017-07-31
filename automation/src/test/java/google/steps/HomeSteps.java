package google.steps;

import org.openqa.selenium.WebDriver;

import commons.AssertsStep;
import google.pages.HomePage;

public class HomeSteps {

	private HomePage page;
	private AssertsStep asserts;
	
	public HomeSteps(WebDriver driver) {
		page = new HomePage(driver);
		asserts = new AssertsStep(driver);
	}
	
	public HomeSteps searchSomething(String url, String info) {
		page.accessPage(url);
		page.fillSearch(info);
		page.pressTab();
		page.clickSearch();
		return this;
	}

	public HomeSteps accessHomePage(String url) {
		page.accessPage(url);
		return this;
	}

	public HomeSteps clickFeelingLucky(String url) {
		page.accessPage(url);
		page.clickFeelingLucky();
		return this;
	}
	
	public void checkIfImageIsDisplayed(String searchResult) {
		asserts.checkIfImageIsDisplayed(searchResult);
	}
	
	public void checkIfPageIsOpen(String titlePage) {
		asserts.checkIfPageIsOpen(titlePage);
	}
}
