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
		accessHomePage(url);
		page.fillSearch(info);
		search();
		return this;
	}
	
	public HomeSteps search() {
		page.pressTab();
		page.clickSearch();
		return this;
	}

	public HomeSteps accessHomePage(String url) {
		page.accessPage(url);
		return this;
	}

	public HomeSteps clickFeelingLucky(String url) {
		accessHomePage(url);
		page.clickFeelingLucky();
		return this;
	}
	
	public HomeSteps clickTextInputTool(String url) {
		accessHomePage(url);
		page.clickTextInputTool();
		return this;
	}
	
	public HomeSteps clickAdvertising(String url) {
		accessHomePage(url);
		page.clickAdvertising();
		return this;
	}
	
	public HomeSteps clickBusiness(String url) {
		accessHomePage(url);
		page.clickBusiness();
		return this;
	}
	
	public HomeSteps clickAbout(String url) {
		accessHomePage(url);
		page.clickAbout();
		return this;
	}
	
	public HomeSteps clickPrivacy(String url) {
		accessHomePage(url);
		page.clickPrivacy();
		return this;
	}
	
	public HomeSteps clickTerms(String url) {
		accessHomePage(url);
		page.clickTerms();
		return this;
	}
	
	public HomeSteps clickSearchSettings(String url) {
		accessHomePage(url);
		page.clickSettings();
		page.clickSearchSettings();
		return this;
	}
	
	public HomeSteps clickAdvancedSearch(String url) {
		accessHomePage(url);
		page.clickSettings();
		page.clickAdvancedSearch();
		return this;
	}
	
	public HomeSteps clickHistory(String url) {
		accessHomePage(url);
		page.clickSettings();
		page.clickHistory();
		return this;
	}
	
	public HomeSteps clickSearchHelp(String url) {
		accessHomePage(url);
		page.clickSettings();
		page.clickSearchHelp();
		return this;
	}
	
	public HomeSteps clickSendFeedback(String url) {
		accessHomePage(url);
		page.clickSettings();
		page.clickSendFeedback();
		return this;
	}
	
	public HomeSteps clickUseGoogle(String url) {
		accessHomePage(url);
		page.clickUseGoogle();
		return this;
	}
	
	public void checkIfImageIsDisplayed(String searchResult) {
		asserts.checkIfImageIsDisplayed(searchResult);
	}
	
	public Object checkIfPageIsOpen(String titlePage) {
		return asserts.checkIfPageIsOpen(titlePage);
	}
	
	public HomeSteps fillFeedback(String url, String info, Boolean includeScreenshot) {
		clickSendFeedback(url);
		page.accessFrame(page.frameFeedback);
		page.fillTextAreaFeedback(info);
		page.enableIncludeScreenshot(includeScreenshot);
		page.clickSend();
		return this;
	}
	
	public Object cancelFeedback(String url) {
		clickSendFeedback(url);
		page.accessFrame(page.frameFeedback);
		page.clickCancelFeedback();
		return this;
	}
	
}
