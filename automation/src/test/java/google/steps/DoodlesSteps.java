package google.steps;

import org.openqa.selenium.WebDriver;

import commons.AssertsStep;
import google.pages.DoodlesPage;

public class DoodlesSteps {

	private DoodlesPage doodles;
	private AssertsStep asserts;
	
	public DoodlesSteps(WebDriver driver) {
		doodles = new DoodlesPage(driver);
		asserts = new AssertsStep(driver);
	}

	public DoodlesSteps accessHomePage(String url) {
		doodles.accessPage(url);
		return this;
	}
	
	public DoodlesSteps clickDoodleArchive() {
		doodles.clickDoodlesArchive();
		return this;
	}
	
	public DoodlesSteps clickAbout() {
		doodles.clickAbout();
		return this;
	}
	
	public DoodlesSteps searchDoodles(String info) {
		doodles.fillSearch(info);
		doodles.clickSearch();
		return this;
	}
	
	public DoodlesSteps selectLanguage(String value) {
		doodles.selectLanguage(value);
		return this;
	}
	
}
