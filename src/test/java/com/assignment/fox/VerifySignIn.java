package com.assignment.fox;

import org.openqa.selenium.WebDriver;
import resources.TestBase;

public class VerifySignIn extends TestBase {
	public WebDriver driver;

	public VerifySignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void verifyLogin() {
		SignInPage page = new SignInPage(driver);
		page.clickAccount().click();
		page.clickLogin().click();
		page.getEmail().sendKeys("madhavinalandula@gmail.com");
		page.getPassword().sendKeys("Testing1");
		page.clickSignIn().click();
	}

}
