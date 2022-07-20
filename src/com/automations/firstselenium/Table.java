package com.automations.firstselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		List<WebElement> allrows = driver.findElements(By.xpath("(//tbody)//tr"));
		for (int row = 0; row < allrows.size(); row++) {

			List<WebElement> eachRowColCount = driver.findElements(By.xpath("((//tbody)//tr[" + (row + 1) + "])//td"));
			for (int col = 0; col < eachRowColCount.size(); col++) {
				String eachCell = "((//tbody)//tr[" + (row + 1) + "])//td[" + (col + 1) + "]";
				System.out.print(driver.findElement(By.xpath(eachCell)).getText() + " ");

			}
			System.out.println();
			
		}
	}

}
