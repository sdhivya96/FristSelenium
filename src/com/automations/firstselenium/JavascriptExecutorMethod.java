package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='ezhil12@gmail.com'", txtEmail);
		WebElement txtPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		js.executeScript("arguments[0].value='qwerty123'", txtPass);
		WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click();", login);

	}

}
