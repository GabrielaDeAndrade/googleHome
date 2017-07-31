package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class HomePage {

	private WebDriver driver;
	private Utils util;
	
	@FindBy(id = "lst-ib")
	private WebElement searchInput;

	@FindBy(name = "btnK")
	private WebElement searchButton;
	
	@FindBy(name = "btnI")
	private WebElement feelingLuckyButton;
	
	@FindBy(name = "uid_0")
	private WebElement imageResult;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);
		PageFactory.initElements(driver, this);
	}
	
	public HomePage accessPage(String url) {
		driver.get(url);
		return this;
	}
	
	public HomePage fillSearch(String info) {
		util.sendKeys(searchInput, info);
		return this;
	}
	
	public HomePage pressTab() {
		util.keyboardPressTab(searchInput);
		return this;
	}
	
	public HomePage clickSearch() {
		util.click(searchButton);
		return this;
	}
	
	public HomePage clickFeelingLucky() {
		util.click(feelingLuckyButton);
		return this;
	}
	
}
