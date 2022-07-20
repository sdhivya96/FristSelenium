package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest1 = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		Actions acc = new Actions(driver);
		acc.dragAndDrop(source1, dest1).perform();

		WebElement source2 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(source2, dest2).perform();

		WebElement source3 = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(source3, dest3).perform();
		WebElement source4 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement dest4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		acc.dragAndDrop(source4, dest4).perform();

		String txtPerfect = driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]")).getText();
		System.out.println(txtPerfect);
	}

}
