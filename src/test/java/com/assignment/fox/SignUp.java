package com.assignment.fox;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.TestBase;

public class SignUp extends TestBase {

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("homeURL"));
		driver.get(prop.getProperty("accountURL"));
	}
	// Code for Signup
	@Test
	public void signUp() throws InterruptedException {
		CreateAccountPage signup = new CreateAccountPage(driver);
		signup.signUp().click();
		signup.getFirstName().sendKeys("Madhavi");
		signup.getLastName().sendKeys("Geddam");
		signup.getEmail().sendKeys("madhavinalandula@gmail.com");
		signup.getPassword().sendKeys("Testing1");
		signup.getGender().click();
		// Select s = new Select(signup.selectGender());
		signup.selectGender().click();
		signup.getBirthdate().sendKeys("07/09/1980");
		signup.submit().click();
		Thread.sleep(5);
		signup.done().click();
		System.out.println(driver.getCurrentUrl());
	}

	@Test(dataProvider = "getData")
	public void Login(String Email, String Password) {
		SignInPage signin = new SignInPage(driver);
		signin.clickLogin().click();
		signin.getEmail().sendKeys(Email);
		signin.getPassword().sendKeys(Password);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(signin.clickSignIn()));
		element.click();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "madhavinalandula@gmail.com";
		data[0][1] = "Testing1";
		return data;
	}

}
