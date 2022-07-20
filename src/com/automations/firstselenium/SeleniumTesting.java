package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("rolex watches for men");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		WebElement homeAndFur = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(homeAndFur).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Floor')]")).click();
		String txtRating = driver.findElement(By.xpath("//div[text()='3.8']")).getText();
		System.out.println(txtRating);
	}

}
