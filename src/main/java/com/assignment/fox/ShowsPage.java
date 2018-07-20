package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.TestBase;

public class ShowsPage extends TestBase {

	public WebDriver driver;

	public ShowsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By SHOWS = By.xpath("//*[contains(@href,'/shows/')]");
	By links = By.className("Tile_info_28rKd");

	public WebElement clickShowsPage() {
		return driver.findElement(SHOWS);
	}

	public List<WebElement> getShowsCount() {
		return driver.findElements(links);
	}
}
