package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class DoodlesPage {

	private WebDriver driver;
	private Utils util;
	
	@FindBy(xpath = "//*[@id='archive-link']/a")
	private WebElement doodlesArchive;
	
	@FindBy(xpath = "//*[@id='nav-list']/li[2]/a")
	private WebElement about;
	
	@FindBy(id = "searchinput")
	private WebElement searchDoodles;
	
	@FindBy(id = "searchbtn")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[@id='lang-chooser']")
	private WebElement selectLanguage;
	
	public DoodlesPage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);
		PageFactory.initElements(driver, this);
	}
	
	public DoodlesPage accessPage(String url) {
		driver.get(url);
		return this;
	}
	
	public DoodlesPage clickDoodlesArchive() {
		util.click(doodlesArchive);
		return this;
	}
	
	public DoodlesPage clickAbout() {
		util.click(about);
		return this;
	}
	
	public DoodlesPage fillSearch(String info) {
		util.sendKeys(searchDoodles, info);
		return this;
	}
	
	public DoodlesPage clickSearch() {
		util.click(searchButton);
		return this;
	}
	
	public DoodlesPage selectLanguage(String value) {
		util.selectOption(selectLanguage, value);
		return this;
	}
	
}
