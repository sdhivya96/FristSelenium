package com.automations.firstselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//
public class W3sTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		for (int i = 0; i < allrows.size(); i++,i=i-1) {
			
			List<WebElement> eachRowColcount = driver
					.findElements(By.xpath("(((//table[@id='customers'])//tbody)//tr[" + (i + 1) + "])//td"));
			
			for (int j = 0; j < eachRowColcount.size(); j++,j=j+1) {
				String rowColCount = "(((//table[@id='customers'])//tbody)//tr[" + (i + 1) + "])//td[" + (j + 1) + "]";

				System.out.print(driver.findElement(By.xpath(rowColCount)).getText() + " ");
			}
			System.out.println();
		}

	}

}
