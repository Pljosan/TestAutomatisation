package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	@FindBy(id = "menu-item-158")
	private WebElement aboutUsLink;;
	@FindBy(xpath = "id('post-156')/header/h1")
	private WebElement aboutUsHeader;
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	protected WebDriver _driver;
	
	public Page(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(_driver, this); //mapira ove findby anotacije
	}
	
	public RegistrationPage clickOnRegistrationLink(){
		registrationLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistrationPage(_driver);
	}
	
	public AboutUsPage clickOnAboutUsLink(){
		aboutUsLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new AboutUsPage(_driver);
	}
	
}
