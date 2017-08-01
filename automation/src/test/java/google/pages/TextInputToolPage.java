package google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class TextInputToolPage {

	private WebDriver driver;
	// private TargetLocator targetLocator;
	
	private Utils util;
	
	@FindBy(id = "K192")
	public WebElement quotationMarksAndApostrophe;
	
	@FindBy(id = "K49")
	private WebElement oneAndExclamationMark;

	@FindBy(id = "K50")
	private WebElement twoAndAt;
	
	@FindBy(id = "K51")
	private WebElement threeAndHash;
	
	@FindBy(id = "K52")
	private WebElement fourAndDollarSign;
	
	@FindBy(id = "K53")
	private WebElement fiveAndPercent;
	
	@FindBy(id = "K54")
	private WebElement sixAndUmlauts;
	
	@FindBy(id = "K55")
	private WebElement sevenAndAnd;
	
	@FindBy(id = "K56")
	private WebElement eightAndAsterisk;
	
	@FindBy(id = "K57")
	private WebElement nineAndOpenParenthesis;
	
	@FindBy(id = "K48")
	private WebElement zeroAndCloseParenthesis;
	
	@FindBy(id = "K189")
	private WebElement hyphenAndUnderscore;
	
	@FindBy(id = "K187")
	private WebElement equalSignAndPlusSymbol;
	
	@FindBy(id = "K8")
	private WebElement backSpace;
	
	@FindBy(id = "K81")
	private WebElement letterQ;
	
	@FindBy(id = "K87")
	private WebElement letterW;
	
	@FindBy(id = "K69")
	private WebElement letterE;
	
	@FindBy(id = "K82")
	private WebElement letterR;
	
	@FindBy(id = "K84")
	private WebElement letterT;
	
	@FindBy(id = "K89")
	private WebElement letterY;
	
	@FindBy(id = "K85")
	private WebElement letterU;
	
	@FindBy(id = "K73")
	private WebElement letterI;
	
	@FindBy(id = "K79")
	private WebElement letterO;
	
	@FindBy(id = "K80")
	private WebElement letterP;
	
	@FindBy(id = "K219")
	private WebElement acuteAccentAndGraveAccent;
	
	@FindBy(id = "K221")
	private WebElement openBracketsAndOpenBraces;

	@FindBy(id = "K20")
	private WebElement capsLock;
	
	@FindBy(id = "K65")
	private WebElement letterA;
	
	@FindBy(id = "K83")
	private WebElement letterS;
	
	@FindBy(id = "K68")
	private WebElement letterD;
	
	@FindBy(id = "K70")
	private WebElement letterF; 
	
	@FindBy(id = "K71")
	private WebElement letterG;
	
	@FindBy(id = "K72")
	private WebElement letterH;
	
	@FindBy(id = "K74")
	private WebElement letterJ;
	
	@FindBy(id = "K75")
	private WebElement letterK;
	
	@FindBy(id = "K76")
	private WebElement letterL;
	
	@FindBy(id = "K186")
	private WebElement letterÇ;
	
	@FindBy(id = "K222")
	private WebElement tildeAndCircumflexAccent;
	
	@FindBy(id = "K220")
	private WebElement closeBracketsAndCloseBraces;
	
	@FindBy(id = "K16")
	private WebElement shift;
	
	@FindBy(id = "K226")
	private WebElement backslashAndPipe;
	
	@FindBy(id = "K90")
	private WebElement letterZ;
	
	@FindBy(id = "K88")
	private WebElement letterX;
	
	@FindBy(id = "K67")
	private WebElement letterC;
	
	@FindBy(id = "K86")
	private WebElement letterV;
	
	@FindBy(id = "K66")
	private WebElement letterB;
	
	@FindBy(id = "K78")
	private WebElement letterN;
	
	@FindBy(id = "K77")
	private WebElement letterM;
	
	@FindBy(id = "K188")
	private WebElement virgula;
	
	@FindBy(id = "K190")
	private WebElement dot;
	
	@FindBy(id = "K191")
	private WebElement semicolonAndColon;
	
	@FindBy(id = "K16")
	private WebElement shift2;

	@FindBy(id = "K273")
	private WebElement ctrlAlt;
	
	@FindBy(id = "K32")
	private WebElement space;
	
	@FindBy(id = "K273")
	private WebElement ctrlAlt2;
	
	public TextInputToolPage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);
		PageFactory.initElements(driver, this);
	}
	
	public TextInputToolPage accessPage(String url) {
		driver.get(url);
		return this;
	}
	
	public TextInputToolPage accessFrame(WebElement id) {
		util.handleFrame(id);
		return this;
	}
	
	public TextInputToolPage pressTab() {
		util.keyboardPressTab(ctrlAlt2);
		return this;
	}
	
	public TextInputToolPage quotationMarksAndApostrophe() {
		util.click(quotationMarksAndApostrophe);
		return this;
	}
	
	public TextInputToolPage oneAndExclamationMark() {
		util.click(oneAndExclamationMark);
		return this;
	}
	
	public TextInputToolPage twoAndAt() {
		util.click(twoAndAt);
		return this;
	}
	
	public TextInputToolPage threeAndHash() {
		util.click(threeAndHash);
		return this;
	}
	
	public TextInputToolPage fourAndDollarSign() {
		util.click(fourAndDollarSign);
		return this;
	}
	
	public TextInputToolPage fiveAndPercent() {
		util.click(fiveAndPercent);
		return this;
	}
	
	public TextInputToolPage sixAndUmlauts() {
		util.click(sixAndUmlauts);
		return this;
	}
	
	public TextInputToolPage sevenAndAnd() {
		util.click(sevenAndAnd);
		return this;
	}
	
	public TextInputToolPage eightAndAsterisk() {
		util.click(eightAndAsterisk);
		return this;
	}
	
	public TextInputToolPage nineAndOpenParenthesis() {
		util.click(nineAndOpenParenthesis);
		return this;
	}

	public TextInputToolPage zeroAndCloseParenthesis() {
		util.click(zeroAndCloseParenthesis);
		return this;
	}
	
	public TextInputToolPage hyphenAndUnderscore() {
		util.click(hyphenAndUnderscore);
		return this;
	}
	
	public TextInputToolPage equalSignAndPlusSymbol() {
		util.click(equalSignAndPlusSymbol);
		return this;
	}
	
	public TextInputToolPage backSpace() {
		util.click(backSpace);
		return this;
	}
	
	public TextInputToolPage letterQ() {
		util.click(letterQ);
		return this;
	}
	
	public TextInputToolPage letterW() {
		util.click(letterW);
		return this;
	}
	
	public TextInputToolPage letterE() {
		util.click(letterE);
		return this;
	}
	
	public TextInputToolPage letterR() {
		util.click(letterR);
		return this;
	}
	
	public TextInputToolPage letterT() {
		util.click(letterT);
		return this;
	}
	
	public TextInputToolPage letterY() {
		util.click(letterY);
		return this;
	}
	
	public TextInputToolPage letterU() {
		util.click(letterU);
		return this;
	}
	
	public TextInputToolPage letterI() {
		util.click(letterI);
		return this;
	}
	
	public TextInputToolPage letterO() {
		util.click(letterO);
		return this;
	}
	
	public TextInputToolPage letterP() {
		util.click(letterP);
		return this;
	}
	
	public TextInputToolPage acuteAccentAndGraveAccent() {
		util.click(acuteAccentAndGraveAccent);
		return this;
	}
	
	public TextInputToolPage openBracketsAndOpenBraces() {
		util.click(openBracketsAndOpenBraces);
		return this;
	}
	
	public TextInputToolPage capsLock() {
		util.click(capsLock);
		return this;
	}
	
	public TextInputToolPage letterA() {
		util.click(letterA);
		return this;
	}
	
	public TextInputToolPage letterS() {
		util.click(letterS);
		return this;
	}
	
	public TextInputToolPage letterD() {
		util.click(letterD);
		return this;
	}
	
	public TextInputToolPage letterF() {
		util.click(letterF);
		return this;
	}
	
	public TextInputToolPage letterG() {
		util.click(letterG);
		return this;
	}
	
	public TextInputToolPage letterH() {
		util.click(letterH);
		return this;
	}
	
	public TextInputToolPage letterJ() {
		util.click(letterJ);
		return this;
	}
	
	public TextInputToolPage letterK() {
		util.click(letterK);
		return this;
	}
	
	public TextInputToolPage letterL() {
		util.click(letterL);
		return this;
	}
	
	public TextInputToolPage letterÇ() {
		util.click(letterÇ);
		return this;
	}
	
	public TextInputToolPage tildeAndCircumflexAccent() {
		util.click(tildeAndCircumflexAccent);
		return this;
	}
	
	public TextInputToolPage closeBracketsAndCloseBraces() {
		util.click(closeBracketsAndCloseBraces);
		return this;
	}
	
	public TextInputToolPage shift() {
		util.click(shift);
		return this;
	}
	
	public TextInputToolPage backslashAndPipe() {
		util.click(backslashAndPipe);
		return this;
	}
	
	public TextInputToolPage letterZ() {
		util.click(letterZ);
		return this;
	}
	
	public TextInputToolPage letterX() {
		util.click(letterX);
		return this;
	}
	
	public TextInputToolPage letterC() {
		util.click(letterC);
		return this;
	}
	
	public TextInputToolPage letterV() {
		util.click(letterV);
		return this;
	}
	
	public TextInputToolPage letterB() {
		util.click(letterB);
		return this;
	}
	
	public TextInputToolPage letterN() {
		util.click(letterN);
		return this;
	}
	
	public TextInputToolPage letterM() {
		util.click(letterM);
		return this;
	}
	
	public TextInputToolPage virgula() {
		util.click(virgula);
		return this;
	}
	
	
	public TextInputToolPage dot() {
		util.click(dot);
		return this;
	}
	
	public TextInputToolPage semicolonAndColon() {
		util.click(semicolonAndColon);
		return this;
	}
	public TextInputToolPage shift2() {
		util.click(shift2);
		return this;
	}
	
	public TextInputToolPage ctrlAlt() {
		util.click(ctrlAlt);
		return this;
	}
	
	public TextInputToolPage space() {
		util.click(space);
		return this;
	}
	
	public TextInputToolPage ctrlAlt2() {
		util.click(ctrlAlt2);
		return this;
	}

}
