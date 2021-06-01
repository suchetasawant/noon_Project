package com.noon.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.noon.Pages.HomePage;
import com.noon.Pages.SignInPage;
import com.noon.mainClass.mainClass;

public class HomePageTest extends mainClass {
	
	SignInPage signin= new SignInPage();
	mainClass mainclass=new mainClass();
	HomePage home= new HomePage();
	
	public HomePageTest() {
		super();
	}
	
    @BeforeClass
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


		

    @Test(priority=1)
    /*public void ElectronicsPageTest() {
    	
    	home.ElectronicsPagelist();
        home.clickOnSpeakarsTab();
        implicitlyWait();
    }*/
    
    public void EnterSearchbar() {
    	home.EnterSearchBarText();
    	
    }
	
}
