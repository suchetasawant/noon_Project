package com.noon.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.noon.Pages.ElectronicsPage;
import com.noon.Pages.HomePage;
import com.noon.Pages.SignInPage;
import com.noon.mainClass.mainClass;

public class ElectronicsPageTest extends mainClass{
	
	SignInPage Page= new SignInPage();
	mainClass Page1=new mainClass();
	HomePage Page2= new HomePage();
	ElectronicsPage Page3= new ElectronicsPage();
	

	public  ElectronicsPageTest() {
		super();
	}

	@BeforeClass
	public void setUp() {
		openBrowser("chrome");
		Page.lunchUrl(Page1.prop.getProperty("openurl"));
		SignInPage signin=PageFactory.initElements(Page1.driver, SignInPage.class);

		signin.clickOnsignin();
		signin.EnterEmailId();
		signin.EnterPassword();
		signin.clickOnsignin();
	}

	@Test
	public void MoveToElectronicsPageTest() {
		Page3.ElectronicsPagelist();
	}


	@AfterClass
	public void teardown() {
		driver.quit();
	}


}
