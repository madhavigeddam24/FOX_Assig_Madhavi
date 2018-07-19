package com.assignment.fox;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.TestBase;

public class VerifyGetShowsAndWriteToExcelTest extends TestBase {
	
	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("homeURL"));
		//driver.get(prop.getProperty("accountURL"));
	}
	
	@Test
	public void getLinksAndWriteToExcel() {
		//Clicking on Account Icon
		
		driver.findElement(By.xpath("//*[@id='path-1']")).click();
		//Clicking on SignIn Button
		driver.findElement(By.cssSelector(".Account_signIn_Q0B7n")).click();
		//Entering Username
		driver.findElement(By.xpath("//input[@name='signinEmail']")).sendKeys("madhavinalandula@gmail.com");
		//Entering Password
		driver.findElement(By.xpath("//input[@name='signinPassword']")).sendKeys("Testing1");
		//Clicking on SignIn Button
		driver.findElement(By.cssSelector(".Account_signinButtonDesktop_2SO1g > button:nth-child(1)")).click();
	}

}
