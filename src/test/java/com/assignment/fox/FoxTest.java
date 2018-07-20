package com.assignment.fox;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.TestBase;

public class FoxTest extends TestBase {

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("homeURL"));
	}

	@Test(enabled = false) // Test for FOX page, disabled beacause account already created
	public void verifyCreateAccount() throws InterruptedException {
		VerifyCreateAccount acc = new VerifyCreateAccount(driver);
		acc.signUp();
	}

	@Test(enabled = false) // Test for FOX page
	public void verifyLoginTest() throws InterruptedException {
		VerifySignIn signin = new VerifySignIn(driver);
		signin.verifyLogin();
	}

	@Test(priority = 2) // Running ShowsPage
	public void writeDataExcel() throws IOException, InterruptedException {
		/*
		 * String xlsFilePath = prop.getProperty("xlsFilePath"); String Sheetname = "1";
		 * ShowsPage sp = new ShowsPage(driver); String[][] obj = sp.clickOnShows();
		 * ExcelReader excel = new ExcelReader(); excel.writeToExcel(xlsFilePath,
		 * Sheetname, obj);
		 */
		VerifyShowsAndWriteExcel sp = new VerifyShowsAndWriteExcel(driver);
		sp.clickOnShows();
	}

	@Test(priority = 3) // Test for FOX page
	public void verifyFXShows() throws InterruptedException {
		VerifyFxPageShows fx = new VerifyFxPageShows(driver);
		fx.verifyMovies();
	}

	@Test(priority = 4) // Test for AllShows Page
	public void verifyAllShows() throws InterruptedException {
		VerifyAllShowsPage all = new VerifyAllShowsPage(driver);
		all.verifyAllShows();
	}

	@Test(priority = 5) // Test for FoxSports Page
	public void verifyFXSportsShows() throws InterruptedException {
		VerifyFoxSportsShows fxSports = new VerifyFoxSportsShows(driver);
		fxSports.verifyFXSportsShows();
	}

	@Test(priority = 6) // Test for National Geographic Page
	public void verifyNGeoShows() throws InterruptedException {
		VerifyNationalGeographicShows ng = new VerifyNationalGeographicShows(driver);
		ng.verifyNGeoShows();
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
