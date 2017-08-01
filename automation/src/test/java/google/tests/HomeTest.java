package google.tests;

import org.junit.Test;

import commons.BaseTest;
import google.steps.HomeSteps;
import google.steps.TextInputToolStep;
import google.steps.DoodlesSteps;

public class HomeTest extends BaseTest {

	private HomeSteps home;
	private DoodlesSteps doodles;
	private TextInputToolStep teclado;
	
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
	
	@Test
	public void test4() {
		home = new HomeSteps(driver);
		home.clickAdvertising("https://www.google.com.br/");
		home.checkIfPageIsOpen("Anúncios do Google – Crie anúncios on-line para a sua empresa – Google");
	}
	
	@Test
	public void test5() {
		home = new HomeSteps(driver);
		home.clickBusiness("https://www.google.com.br/");
		home.checkIfPageIsOpen("Software de gerenciamento de negócios | Soluções do Google para Empresas – Google");
	}
	
	@Test
	public void test6() {
		home = new HomeSteps(driver);
		home.clickAbout("https://www.google.com.br/");
		home.checkIfPageIsOpen("Quem somos | Google");
	}
	
	@Test
	public void test7() {
		home = new HomeSteps(driver);
		home.clickPrivacy("https://www.google.com.br/");
		home.checkIfPageIsOpen("Política de Privacidade – Privacidade & Termos – Google");
	}
	
	@Test
	public void test8() {
		home = new HomeSteps(driver);
		home.clickTerms("https://www.google.com.br/");
		home.checkIfPageIsOpen("Termos de Serviço do Google – Privacidade & Termos – Google");
	}
	
	@Test
	public void test9() {
		home = new HomeSteps(driver);
		home.clickSearchSettings("https://www.google.com.br/");
		home.checkIfPageIsOpen("Configurações de pesquisa");
	}
	
	@Test
	public void test10() {
		home = new HomeSteps(driver);
		home.clickAdvancedSearch("https://www.google.com.br/");
		home.checkIfPageIsOpen("Pesquisa avançada do Google");
	}
	
	@Test
	public void test11() {
		home = new HomeSteps(driver);
		home.clickHistory("https://www.google.com.br/");
		home.checkIfPageIsOpen("Google - Personalização de pesquisas");
	}
	
	@Test
	public void test12() {
		home = new HomeSteps(driver);
		home.clickSearchHelp("https://www.google.com.br/");
		home.checkIfPageIsOpen("Ajuda do Pesquisa Google");
	}
	
	@Test
	public void test13() {
		home = new HomeSteps(driver);
		home.fillFeedback("https://www.google.com.br/", "informação", false);
	}
	
	@Test
	public void test14() {
		home = new HomeSteps(driver);
		home.cancelFeedback("https://www.google.com.br/");
	}
	
	@Test
	public void test15() {
		home = new HomeSteps(driver);
		doodles = new DoodlesSteps(driver);
		home.clickFeelingLucky("https://www.google.com.br/");
		doodles.clickDoodleArchive();
		doodles.clickAbout();
		doodles.searchDoodles("do");
		doodles.selectLanguage("es");
	}
	
	@Test
	public void test16() {
		home = new HomeSteps(driver);
		teclado = new TextInputToolStep(driver);
		home.clickTextInputTool("https://www.google.com.br/");
		teclado.letterA();
		teclado.letterB();
		teclado.letterA();
		teclado.letterC();
		teclado.letterA();
		teclado.letterT();
		teclado.letterE();
		home.search();
	}
}
