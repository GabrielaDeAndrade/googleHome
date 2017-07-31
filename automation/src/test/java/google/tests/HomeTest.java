package google.tests;

import org.junit.Test;

import commons.BaseTest;
import google.steps.HomeSteps;

public class HomeTest extends BaseTest {

	private HomeSteps home;
	
	@Test
	public void test() {
		home = new HomeSteps(driver);
		home.accessHomePage("https://www.google.com.br/");
		home.checkIfPageIsOpen("Google");
	}

	
	@Test public void test2() {
		home = new HomeSteps(driver);
		home.searchSomething("https://www.google.com.br/", "Abacate");
		home.checkIfImageIsDisplayed("Abacate");
	}


	@Test
	public void test3() {
		home = new HomeSteps(driver);
		home.clickFeelingLucky("https://www.google.com.br/");
		home.checkIfPageIsOpen("Google Doodles");
	}
}
