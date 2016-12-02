package lib.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Page{
	//mapiranje
	@FindBy(id = "name_3_firstname")
	private WebElement firstNameInput;
	@FindBy(id = "name_3_lastname")
	private WebElement lastNameInput;
	@FindBy(id = "phone_9")
	private WebElement phoneNumberInput;
	@FindBy(id = "username")
	private WebElement usernameInput;
	@FindBy(id = "email_1")
	private WebElement emailInput;
	@FindBy(id = "password_2")
	private WebElement passwordInput;
	@FindBy(id = "confirm_password_password_2")
	private WebElement passwordConfirmInput;
	
	public RegistrationPage(WebDriver driver){
		super(driver);
	}
	
	//input polja
	public void sendKeysToFirstNameInput(String firstname){
		firstNameInput.sendKeys(firstname);
	}
	public void sendKeysToLastNameInput(String lastname){
		lastNameInput.sendKeys(lastname);
	}
	public void sendKeysToPhoneNumberInput(String phone){
		phoneNumberInput.sendKeys(phone);
	}
	public void sendKeysToUsernameInput(String username){
		usernameInput.sendKeys(username);
	}
	public void sendKeysToEmailInput(String email){
		emailInput.sendKeys(email);
	}
	public void sendKeysToPasswordInput(String password){
		passwordInput.sendKeys(password);
	}
	public void sendKeysToPasswordConfirmInput(String confirmPassword){
		passwordConfirmInput.sendKeys(confirmPassword);
	}
	
	String single = "Single";
	String married = "Married";
	String divorced = "Divorced";
	
	//radio buttons
	@FindBy(css = "")
	private WebElement martialStatus;
	
	public void selectMartialStatus(String martialStatus){
		List<WebElement> listOfInputs = _driver.findElements(By.xpath("id('pie_register')/li[2]/div/div/input"));
		if(martialStatus.equalsIgnoreCase(this.single)){
			listOfInputs.get(0).click();
		}
		else if(martialStatus.equalsIgnoreCase(this.married)){
			listOfInputs.get(1).click();
		}
		else{
			listOfInputs.get(2).click();
		}
	}
	
	//checkbox mora svaki pojedinacno!
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[1]")
	private WebElement hobbyDancing;
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[2]")
	private WebElement hobbyReading;
	@FindBy(xpath = "id('pie_register')/li[3]/div/div[1]/input[3]")
	private WebElement hobbyCricket;
	
	public void checkHobbyDancing(WebElement hobbyDancing){
		hobbyDancing.click();
	}
	public void checkHobbyReading(WebElement hobbyReading){
		hobbyReading.click();
	}
	public void checkHobbyCricket(WebElement hobbyCricket){
		hobbyCricket.click();
	}
	
}
