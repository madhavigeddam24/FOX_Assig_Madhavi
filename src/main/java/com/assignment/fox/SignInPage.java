package com.assignment.fox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	public WebDriver driver;

	By account = By.xpath("//*[@id='path-1']");
	By login = By.cssSelector(".Account_signIn_Q0B7n");
	By email = By.xpath("//input[@name='signinEmail']");
	By password = By.xpath("//input[@name='signinPassword']");
	By signin = By.cssSelector(".Account_signinButtonDesktop_2SO1g > button:nth-child(1)");

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickAccount() {
		return driver.findElement(account);
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
