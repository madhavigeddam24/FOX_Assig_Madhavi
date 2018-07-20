package com.assignment.fox;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.TestBase;

public class VerifyShowsAndWriteExcel extends TestBase {

	public WebDriver driver;

	public VerifyShowsAndWriteExcel(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void clickOnShows() throws InterruptedException {
		ShowsPage sp = new ShowsPage(driver);
		sp.clickShowsPage().click();
		// Reading the titles and Writing into the Excel
		List<WebElement> links = sp.getShowsCount();
		System.out.println("Total Links:" + links.size());
		int size = links.size() - 1;
		int limit = size - 3;
		for (int i = limit; i <= size; i = i + 1) {
			System.out.println(links.get(i).getText());
		}
	}
	/*
	 * int size = links.size()-1; int limit = size - 3;
	 * 
	 * String[][] data=new String[4][1]; int row=0; int col=0;
	 * 
	 * for (int i=limit; i<=size; i=i+1)
	 * 
	 * { String str=links.get(i).getText(); data[row][col]=str;
	 * System.out.println(data[row][col]); row++;
	 * 
	 * }
	 * 
	 * return data;
	 */

	// for (int i = 0; i <= links.size() - 1; i = i + 1) {
	// System.out.println(links.get(i).getText());
	// String data = links.get(i).getText();
	// setExcelData("C:\\Assignment\\FOX_Assig_Madhavi\\data.xlsx", "config", i, 0,
	// data);
	// }
	// }

}
