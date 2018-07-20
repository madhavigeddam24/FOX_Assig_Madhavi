package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllShowsPage {

	public WebDriver driver;

	public AllShowsPage(WebDriver driver) {
		this.driver = driver;
	}

	By allShows = By.xpath(
			"//div[@class='PageHeaderBrowse_tabContainer_3htBb PageHeaderBrowseAltHeader_tabContainer_en4tN']//a[6]");
	// verifying the shows and displaying titles
	By links = By.className("Tile_info_28rKd");
	
	public WebElement clickAllShows() {
		return driver.findElement(allShows);
	}
	
	public List<WebElement> getLinksCount() {
		return driver.findElements(links);
	}

}
