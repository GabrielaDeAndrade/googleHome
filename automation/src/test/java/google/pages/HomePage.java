package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class HomePage {

	private WebDriver driver;
	// private TargetLocator targetLocator;
	
	private Utils util;
	
	@FindBy(id = "google-feedback-wizard")
	public WebElement frameFeedback;
	
	@FindBy(id = "lst-ib")
	private WebElement searchInput;

	@FindBy(name = "btnK")
	private WebElement searchButton;
	
	@FindBy(name = "btnI")
	private WebElement feelingLuckyButton;
	
	@FindBy(id = "gs_ok0")
	private WebElement textInputTool;
	
	@FindBy(xpath = "//*[@id='fsl']/a[1]")
	private WebElement advertising;
	
	@FindBy(xpath = "//*[@id='fsl']/a[2]")
	private WebElement business;
	
	@FindBy(xpath = "//*[@id='fsl']/a[3]")
	private WebElement about;
	
	@FindBy(xpath = "//*[@id='fsr']/a[1]")
	private WebElement privacy;
	
	@FindBy(xpath = "//*[@id='fsr']/a[2]")
	private WebElement terms;
	
	@FindBy(xpath = "//*[@id='fsettl']")
	private WebElement settings;
	
	@FindBy(xpath = "//*[@id='fsr']/a[3]")
	private WebElement useGoogle;
	
	@FindBy(xpath = "//*[@id='fsett']/a[1]")
	private WebElement searchSettings;
	
	@FindBy(xpath = "//*[@id='advsl']/a")
	private WebElement advancedSearch;
	
	@FindBy(xpath = "//*[@id='fsett']/a[2]")
	private WebElement history;
	
	@FindBy(xpath = "//*[@id='fsett']/a[3]")
	private WebElement searchHelp;
	
	@FindBy(id = "google-feedback-wizard")
	private WebElement googleFrame;
	
	@FindBy(id = "_Yvd")
	private WebElement sendFeedback;
	
	@FindBy(name = "uid_0")
	private WebElement imageResult;	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/uf-describe-page/form/label/textarea")
	private WebElement textAreaFeedback;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/uf-describe-page/form/div/div/label/uf-material-checkbox/input")
	private WebElement includeScreenshot;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/uf-describe-page/form/footer/uf-material-button[2]/label/button")
	private WebElement cancelFeedback;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/uf-describe-page/form/footer/uf-material-button[1]/label/button")
	private WebElement send;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);
		PageFactory.initElements(driver, this);
	}
	
	public HomePage accessPage(String url) {
		driver.get(url);
		return this;
	}
	
	public HomePage accessFrame(WebElement id) {
		util.handleFrame(id);
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
	
	public HomePage clickTextInputTool() {
		util.click(textInputTool);
		return this;
	}
	
	public HomePage clickAdvertising() {
		util.click(advertising);
		return this;
	}
	
	public HomePage clickBusiness() {
		util.click(business);
		return this;
	}
	
	public HomePage clickAbout() {
		util.click(about);
		return this;
	}
	
	public HomePage clickPrivacy() {
		util.click(privacy);
		return this;
	}
	
	public HomePage clickTerms() {
		util.click(terms);
		return this;
	}
	
	public HomePage clickSettings() {
		util.click(settings);
		return this;
	}
	
	public HomePage clickUseGoogle() {
		util.click(useGoogle);
		return this;
	}
	
	public HomePage clickSearchSettings() {
		util.click(searchSettings);
		return this;
	}
	
	public HomePage clickAdvancedSearch() {
		util.click(advancedSearch);
		return this;
	}
	
	public HomePage clickHistory() {
		util.click(history);
		return this;
	}
	
	public HomePage clickSearchHelp() {
		util.click(searchHelp);
		return this;
	}
	
	public HomePage clickSendFeedback() {
		util.click(sendFeedback);
		return this;
	}
	
	public HomePage fillTextAreaFeedback(String feedback) {
		util.sendKeys(textAreaFeedback, feedback);
		return this;
	}
	
	public HomePage enableIncludeScreenshot(Boolean enable) {
		util.enable(includeScreenshot, enable);
		return this;
	}
	
	public HomePage clickCancelFeedback() {
		util.click(cancelFeedback);
		return this;
	}
	
	public HomePage clickSend() {
		util.click(send);
		return this;
	}
	
}
