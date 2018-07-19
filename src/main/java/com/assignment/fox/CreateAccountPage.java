package com.assignment.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.TestBase;

public class CreateAccountPage extends TestBase {

	public WebDriver driver;
	By signup = By.cssSelector(".Account_signUp_3SpTs");
	By fname = By.cssSelector(".Account_signupField_21Jct.Account_signupFirstName_1LEKX");
	By lname = By.xpath("//input[@name='signupLastName']");
	By email = By.xpath("//input[@name='signupEmail']");
	By password = By.xpath("//input[@name='signupPassword']");
	By gender=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[10]/div[1]/div/div/div/a");
	By select = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[10]/div[1]/div/div[2]/a[1]/div");
	By dob = By.xpath("//input[@placeholder='Birthdate']");//.Account_signupBirthdayGenderContainer_1n0m8 > div.Account_signupColumnSplit_YtgPc > input.Account_signupField_21Jct
	By submit = By.cssSelector(".Account_signupButtonDesktop_1PCXs > button");
	By success = By.cssSelector(".Account_signupSuccessButton_1mM7y");
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement signUp()
	{
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
	
	public WebElement selectGender() {
		return driver.findElement(select);
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

