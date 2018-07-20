package com.assignment.fox;

import org.openqa.selenium.WebDriver;
import resources.TestBase;

public class VerifyCreateAccount extends TestBase {

	public WebDriver driver;

	public VerifyCreateAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void signUp() throws InterruptedException {
		CreateAccountPage signup = new CreateAccountPage(driver);
		signup.clickAccount().click();
		signup.signUp().click();
		signup.getFirstName().sendKeys("Madhavi");
		signup.getLastName().sendKeys("Geddam");
		signup.getEmail().sendKeys("madhavinalandula@gmail.com");
		signup.getPassword().sendKeys("Testing1");
		signup.getGender().click();
		signup.selectFemale().click();
		signup.getBirthdate().sendKeys("07/09/1980");
		signup.submit().click();
		Thread.sleep(5);
		signup.done().click();
		System.out.println(driver.getCurrentUrl());
	}
}
