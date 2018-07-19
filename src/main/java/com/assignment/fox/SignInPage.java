package com.assignment.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	public WebDriver driver;
	
	By login = By.cssSelector(".Account_signIn_Q0B7n");
	By email = By.cssSelector(".Account_signinField_mdMZF");
	By password = By.xpath("//input[@name='signinPassword']");
	By signin = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[4]/div[4]/button");
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement clickLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickSignIn() {
		return driver.findElement(signin);
	}
}
