package com.assignment.fox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.TestBase;

public class ShowsPage extends TestBase{
	
	public WebDriver driver;
	
	public ShowsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void clickOnShows() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(@href,'/shows/')]")).click();
		//Reading the titles and Writing into the Excel 
		List<WebElement> links = driver.findElements(By.className("Tile_info_28rKd"));
		System.out.println("Total Links:"+links.size());
		
		/*int size = links.size()-1;
		int limit = size - 3;
		
		String[][] data=new String[4][1];
		int row=0;
		int col=0;
		
		for (int i=limit; i<=size; i=i+1)

		{
			String str=links.get(i).getText();
			data[row][col]=str;
			System.out.println(data[row][col]);
			row++;

		}
		
		return data;
		*/
		int size = links.size()-1;
		int limit = size - 3;
		
		//for (int i = 0; i <= links.size() - 1; i = i + 1) {
			//System.out.println(links.get(i).getText());
			//String data = links.get(i).getText();
	        //setExcelData("C:\\Assignment\\FOX_Assig_Madhavi\\data.xlsx", "config", i, 0, data);
	       // }
	//}
		
		
		for (int i=limit; i<=size; i=i+1) {
			System.out.println(links.get(i).getText());
		}
	}
		
		private void setExcelData(String string, String string2, int i, int j, String data) {
			// TODO Auto-generated method stub
	} 
	
}
