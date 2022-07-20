package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement ddnDate = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(ddnDate);
		s1.selectByValue("31");
		WebElement ddnMonth = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(ddnMonth);
		s2.selectByVisibleText("Dec");
		WebElement ddnYear = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(ddnYear);
		s3.selectByIndex(1);
	}

}
