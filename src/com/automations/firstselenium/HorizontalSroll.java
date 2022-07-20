package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalSroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://amazom.in");
		WebElement bestSellers = driver
				.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", bestSellers);
		WebElement scroll = driver
				.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61GQUtqKIpS._AC_SY200_.jpg']"));
		js.executeScript("arguments[0].scrollIntoView(false);", scroll);

	}

}
