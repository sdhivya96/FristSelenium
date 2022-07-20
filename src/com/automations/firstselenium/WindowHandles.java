package com.automations.firstselenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsLi = new ArrayList<String>(allTabs);
		driver.switchTo().window(allTabsLi.get(1));
		WebElement enterEmail = driver.findElement(By.xpath("//input[@name='emailid']"));
		enterEmail.click();
		enterEmail.sendKeys("jgdajhd@mail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(allTabsLi.get(0));
		System.out.println(driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText());

	}

}
