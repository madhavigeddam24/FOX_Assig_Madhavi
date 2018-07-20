package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NationalGeographicPage {

	public WebDriver driver;

	public NationalGeographicPage(WebDriver driver) {
		this.driver = driver;
	}

	By NATIONALGEO = By.xpath(
			"//div[@class='PageHeaderBrowse_tabContainer_3htBb PageHeaderBrowseAltHeader_tabContainer_en4tN']//a[3]");
	By geoLinks = By.className("Tile_info_28rKd");

	public WebElement clickNationalGeoPage() {
		return driver.findElement(NATIONALGEO);
	}
	
	public List<WebElement> getNationalGeoShowsCount() {
		return driver.findElements(geoLinks);
	}
}
