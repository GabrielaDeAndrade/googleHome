package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertsPage {
	
	private Utils util;
	private WebDriver driver;
	
	@FindBy(name = "uid_0")
	private WebElement imageResult;
	
	public AssertsPage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(this.driver);
		PageFactory.initElements(this.driver, this);
	}
	
	public boolean isImagemDisplayed(String searchResult) {
		return util.isThereIsAnAttribute(imageResult, "alt", "Resultado de imagem para " + searchResult);
	}
	
	public boolean isPageOpen(String titlePage) {
		return driver.getTitle().equals(titlePage);
	}
}
