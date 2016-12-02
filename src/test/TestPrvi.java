package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestPrvi {
	WebDriver driver;
	String url;
	
  @BeforeClass
  public void beforeClass() {
	  url = "http://demoqa.com/";
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }

  @Test
  public void f() {
	WebElement aboutUsLink = driver.findElement(By.id("menu-item-158")); //ovo je about us  
	aboutUsLink.click();
	
	//hocemo da izdvojimo header About Us
	WebElement header = driver.findElement(By.xpath("id('post-156')//h1")); 
	String textHeader = header.getText();
	
	Assert.assertEquals(textHeader, "About us");
	//assert textHeader.equals("About us") : "Tekst se podudara!";
  }
  
  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
