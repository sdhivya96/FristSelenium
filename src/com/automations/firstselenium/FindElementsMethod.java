package com.automations.firstselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		List<WebElement> locateAllName = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> locateAllPrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i <= locateAllName.size() - 1; i++) {
			WebElement name = locateAllName.get(i);
			WebElement price = locateAllPrice.get(i);
			System.out.println(name.getText() + "---> " + price.getText());

		}

	}
}