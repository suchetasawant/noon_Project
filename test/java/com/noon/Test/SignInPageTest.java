package com.noon.Test;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import com.noon.Pages.SignInPage;
import com.noon.mainClass.mainClass;

public class SignInPageTest extends mainClass {

	SignInPage signin= new SignInPage();
	mainClass mainclass=new mainClass();

	public SignInPageTest() {
		super();
	}

	@Test
	public void setUp() {
		openBrowser("chrome");
		signin.lunchUrl(mainclass.prop.getProperty("openurl"));
		
		signin=PageFactory.initElements(mainclass.driver, SignInPage.class);
		signin.clickOnSignInBtn();
		implicitlyWait();
		signin.EnterEmailId();
		signin.EnterPassword();
		signin.clickOnsignin();
	}



	public void teardown() {
		driver.quit();
	}
}


