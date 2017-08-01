package google.steps;

import org.openqa.selenium.WebDriver;

import commons.AssertsStep;
import google.pages.TextInputToolPage;

public class TextInputToolStep {

	private TextInputToolPage page;
	private AssertsStep asserts;
	
	public TextInputToolStep(WebDriver driver) {
		page = new TextInputToolPage(driver);
		asserts = new AssertsStep(driver);
	}
	
	public TextInputToolStep clickQuotationMarksAndApostrophe() {
		page.quotationMarksAndApostrophe();
		return this;
	}
	
	public TextInputToolStep clickOneAndExclamationMark() {
		page.oneAndExclamationMark();
		return this;
	}
	
	public TextInputToolStep twoAndAt() {
		page.twoAndAt();
		return this;
	}
	
	public TextInputToolStep threeAndHash() {
		page.threeAndHash();
		return this;
	}
	
	public TextInputToolStep fourAndDollarSign() {
		page.fourAndDollarSign();
		return this;
	}
	
	public TextInputToolStep fiveAndPercent() {
		page.fiveAndPercent();
		return this;
	}
	
	public TextInputToolStep sixAndUmlauts() {
		page.sixAndUmlauts();
		return this;
	}
	
	public TextInputToolStep sevenAndAnd() {
		page.sevenAndAnd();
		return this;
	}
	
	public TextInputToolStep eightAndAsterisk() {
		page.eightAndAsterisk();
		return this;
	}
	
	public TextInputToolStep nineAndOpenParenthesis() {
		page.nineAndOpenParenthesis();
		return this;
	}

	public TextInputToolStep zeroAndCloseParenthesis() {
		page.zeroAndCloseParenthesis();
		return this;
	}
	
	public TextInputToolStep hyphenAndUnderscore() {
		page.hyphenAndUnderscore();
		return this;
	}
	
	public TextInputToolStep equalSignAndPlusSymbol() {
		page.equalSignAndPlusSymbol();
		return this;
	}
	
	public TextInputToolStep backSpace() {
		page.backSpace();
		return this;
	}
	
	public TextInputToolStep letterQ() {
		page.letterQ();
		return this;
	}

	public TextInputToolStep letterW() {
		page.letterW();
		return this;
	}
	
	public TextInputToolStep letterE() {
		page.letterE();
		return this;
	}
	
	public TextInputToolStep letterR() {
		page.letterR();
		return this;
	}
	
	public TextInputToolStep letterT() {
		page.letterT();
		return this;
	}
	
	public TextInputToolStep letterY() {
		page.letterY();
		return this;
	}
	
	public TextInputToolStep letterU() {
		page.letterU();
		return this;
	}
	
	public TextInputToolStep letterI() {
		page.letterI();
		return this;
	}
	
	public TextInputToolStep letterO() {
		page.letterO();
		return this;
	}
	
	public TextInputToolStep letterP() {
		page.letterP();
		return this;
	}
	
	public TextInputToolStep acuteAccentAndGraveAccent() {
		page.acuteAccentAndGraveAccent();
		return this;
	}
	
	public TextInputToolStep openBracketsAndOpenBraces() {
		page.openBracketsAndOpenBraces();
		return this;
	}
	
	public TextInputToolStep capsLock() {
		page.capsLock();
		return this;
	}
	
	public TextInputToolStep letterA() {
		page.letterA();
		return this;
	}
	
	public TextInputToolStep letterS() {
		page.letterS();
		return this;
	}
	
	public TextInputToolStep letterD() {
		page.letterD();
		return this;
	}
	
	public TextInputToolStep letterF() {
		page.letterF();
		return this;
	}
	
	public TextInputToolStep letterG() {
		page.letterG();
		return this;
	}
	
	public TextInputToolStep letterH() {
		page.letterH();
		return this;
	}
	
	public TextInputToolStep letterJ() {
		page.letterJ();
		return this;
	}
	
	public TextInputToolStep letterK() {
		page.letterK();
		return this;
	}
	
	public TextInputToolStep letterL() {
		page.letterL();
		return this;
	}
	
	public TextInputToolStep letterÇ() {
		page.letterÇ();
		return this;
	}
	
	public TextInputToolStep tildeAndCircumflexAccent() {
		page.tildeAndCircumflexAccent();
		return this;
	}
	
	public TextInputToolStep closeBracketsAndCloseBraces() {
		page.closeBracketsAndCloseBraces();
		return this;
	}
	
	public TextInputToolStep shift() {
		page.shift();
		return this;
	}
	
	public TextInputToolStep backslashAndPipe() {
		page.backslashAndPipe();
		return this;
	}
	
	public TextInputToolStep letterZ() {
		page.letterZ();
		return this;
	}
	
	public TextInputToolStep letterX() {
		page.letterX();
		return this;
	}
	
	public TextInputToolStep letterC() {
		page.letterC();
		return this;
	}
	
	public TextInputToolStep letterV() {
		page.letterV();
		return this;
	}
	
	public TextInputToolStep letterB() {
		page.letterB();
		return this;
	}
	
	public TextInputToolStep letterN() {
		page.letterN();
		return this;
	}
	
	public TextInputToolStep letterM() {
		page.letterM();
		return this;
	}
	
	public TextInputToolStep virgula() {
		page.virgula();
		return this;
	}
	
	
	public TextInputToolStep dot() {
		page.dot();
		return this;
	}
	
	public TextInputToolStep semicolonAndColon() {
		page.semicolonAndColon();
		return this;
	}
	public TextInputToolStep shift2() {
		page.shift2();
		return this;
	}

	public TextInputToolStep ctrlAlt() {
		page.ctrlAlt();
		return this;
	}
	
	public TextInputToolStep space() {
		page.space();
		return this;
	}
	
	public TextInputToolStep ctrlAlt2() {
		page.ctrlAlt2();
		return this;
	}
	
}
