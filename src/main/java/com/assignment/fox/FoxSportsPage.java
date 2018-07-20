package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FoxSportsPage {

	public WebDriver driver;

	public FoxSportsPage(WebDriver driver) {
		this.driver = driver;
	}

	By FSports = By.xpath(
			"//div[@class='PageHeaderBrowse_tabContainer_3htBb PageHeaderBrowseAltHeader_tabContainer_en4tN']//a[4]");
	By fxSportsLinks = By.className("Tile_info_28rKd");

	public WebElement clickFxSportsPage() {
		return driver.findElement(FSports);
	}

	public List<WebElement> getFoxSportsShowsCount() {
		return driver.findElements(fxSportsLinks);
	}
	
}
