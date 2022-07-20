package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		WebElement txtparent = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(txtparent);
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());

		WebElement txtChild = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(txtChild);
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());

	}

}
