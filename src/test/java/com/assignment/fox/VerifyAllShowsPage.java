package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyAllShowsPage {

	public WebDriver driver;

	public VerifyAllShowsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyAllShows() throws InterruptedException {
		AllShowsPage all = new AllShowsPage(driver);
		all.clickAllShows().click();
		List<WebElement> links = all.getLinksCount();
		System.out.println();
		for (int i = 0; i <= links.size() - 1; i = i + 1) {
			if (links.get(i).getText().contains("24 Hours To Hell & Back")) {
				System.out.println("24 Hours To Hell & Back - is in the List");
			} else if (links.get(i).getText().contains("So You Think You Can Dance")) {
				System.out.println("So You Think You Can Dance - is in the List");
			} else if (links.get(i).getText().contains("Meghan Markle: An American Princess")) {
				System.out.println("Meghan Markle: An American Princess - is in the List");
			} else if (links.get(i).getText().contains("Hypnotize Me")) {
				System.out.println("Hypnotize Me - is in the List");
			}
		}
		System.out.println("Given movies is not in the specified list");
	}
}
