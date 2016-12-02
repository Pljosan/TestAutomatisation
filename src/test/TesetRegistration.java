package test;

import org.testng.annotations.Test;

import lib.pages.HomePage;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TesetRegistration {
	WebDriver driver;
	HomePage homePage;
	RegistrationPage registrationPage;
	String url;	
	
  @Test
  public void test() {
	  try{
		  homePage = new HomePage(driver);
		  registrationPage = homePage.clickOnRegistrationLink();
		  
		 
	  }catch(Exception e){
		  e.printStackTrace();
	  }	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  url = "http://demoqa.com/";
	  driver = Browser.openBrowser(url);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
