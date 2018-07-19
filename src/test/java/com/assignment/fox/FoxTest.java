package com.assignment.fox;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.ExcelReader;
import resources.TestBase;

public class FoxTest extends TestBase {

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("homeURL"));
	}

	@Test(priority = 1) // Running ShowsPage
	public void writeDataExcel() throws IOException, InterruptedException {
		/*String xlsFilePath = prop.getProperty("xlsFilePath");
		String Sheetname = "1";
		ShowsPage sp = new ShowsPage(driver);
		String[][] obj = sp.clickOnShows();
		ExcelReader excel = new ExcelReader();
		excel.writeToExcel(xlsFilePath, Sheetname, obj);*/
		ShowsPage sp = new ShowsPage(driver);
		sp.clickOnShows();		
	}

	@Test(priority = 2) // Test for FOX page
	public void verifyMoviesList() throws InterruptedException {
		FxPage fx = new FxPage(driver);
		fx.verifyMovies();
	}

	@Test(priority = 3) // Test for AllShows Page
	public void verifyAllShows() throws InterruptedException {
		AllShowsPage all = new AllShowsPage(driver);
		all.verifyAllShows();
	}

	@Test(priority = 4) // Test for FoxSports Page
	public void verifyFXSports() throws InterruptedException {
		FoxSportsPage fxSports = new FoxSportsPage(driver);
		fxSports.verifyFXSportsShows();
	}

	@Test(priority = 5) // Test for National Geographic Page
	public void verifyNGeoShows() throws InterruptedException {
		NationalGeographicPage ng = new NationalGeographicPage(driver);
		ng.verifyNGeoShows();
	}

	@AfterTest
	public void teardown() {
		//driver.close();
	}
}
