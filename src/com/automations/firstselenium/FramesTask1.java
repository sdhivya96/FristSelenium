package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTask1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("ezhil");

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in')]")).click();
		WebElement F1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(F1);
		WebElement F2 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(F2);
		WebElement textEnter = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textEnter.click();
		textEnter.sendKeys("billie");

	}

}
