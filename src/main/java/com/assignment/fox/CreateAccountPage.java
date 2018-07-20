package com.assignment.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.TestBase;

public class CreateAccountPage extends TestBase {

	public WebDriver driver;
	By account = By.xpath("//*[@id='path-1']");
	By signup = By.cssSelector(".Account_signUp_3SpTs");
	By fname = By.cssSelector(".Account_signupField_21Jct.Account_signupFirstName_1LEKX");
	By lname = By.xpath("//input[@name='signupLastName']");
	By email = By.xpath("//input[@name='signupEmail']");
	By password = By.xpath("//input[@name='signupPassword']");
	By gender = By.xpath("//*[contains(@class,'Dropdown_selectedText_3xUOl')]");
	By male = By.xpath("(//*[contains(@class,'Dropdown_itemContent_1_Dzw')])[1]");
	By female = By.xpath("(//*[contains(@class,'Dropdown_itemContent_1_Dzw')])[2]");
	By donotprefer = By.xpath("(//*[contains(@class,'Dropdown_itemContent_1_Dzw')])[3]");
	By dob = By.xpath("//input[@placeholder='Birthdate']");
	By submit = By.cssSelector(".Account_signupButtonDesktop_1PCXs > button");
	By success = By.cssSelector(".Account_signupSuccessButton_1mM7y");

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickAccount() {
		return driver.findElement(account);
	}

	public WebElement signUp() {
		return driver.findElement(signup);
	}

	public WebElement getFirstName() {
		return driver.findElement(fname);
	}

	public WebElement getLastName() {
		return driver.findElement(lname);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getGender() {
		return driver.findElement(gender);
	}

	public WebElement selectMale() {
		return driver.findElement(male);
	}

	public WebElement selectFemale() {
		return driver.findElement(female);
	}

	public WebElement selectDoNotPrefer() {
		return driver.findElement(donotprefer);
	}

	public WebElement getBirthdate() {
		return driver.findElement(dob);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement done() {
		return driver.findElement(success);
	}
}
