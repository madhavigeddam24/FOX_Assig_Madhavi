package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FxPage {

	public WebDriver driver;

	By FX = By.xpath(
			"//div[@class='PageHeaderBrowse_tabContainer_3htBb PageHeaderBrowseAltHeader_tabContainer_en4tN']//a[2]");

	By fxLinks = By.className("Tile_info_28rKd");
	
	public FxPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickFXPage() {
		return driver.findElement(FX);
	}

	public List<WebElement> getShowsCount() {
		return driver.findElements(fxLinks);
	}
}
