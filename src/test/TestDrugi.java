package test;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lib.pages.AboutUsPage;
import lib.pages.HomePage;
import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;

public class TestDrugi {
	WebDriver driver;
	HomePage homePage;
	AboutUsPage aboutUsPage;
	RegistrationPage registrationPage;
	String url;
	
  @Test
  public void test() {
	  try{
		  homePage = new HomePage(driver);
		  aboutUsPage = homePage.clickOnAboutUsLink();
		  
		  Assert.assertEquals(aboutUsPage.isDisplayedAboutUsHeader(), true);
		  Assert.assertEquals(aboutUsPage.getTextAboutUsHeader(), "About Us");
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  }
  
  @BeforeClass
  public void setUp() {
	  url = "http://demoqa.com/";
	  driver = Browser.openBrowser(url);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
