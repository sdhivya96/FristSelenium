package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginIntoIcici {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_cms_IB_internetbanking_login_btn&_gl=1*1q0c14o*_ga*MTIwNjAzNzQyMC4xNjA2NTY4ODQ0*_ga_SKB78GHTFV*MTY1NTAxMTQ4NS41LjAuMTY1NTAxMTQ4NS42MA..");

		WebElement txtLoginClick = driver
				.findElement(By.xpath("(//input[@onkeypress='return checkEnter(event);'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", txtLoginClick);
		WebElement txtLogin = driver.findElement(By.xpath("//input[@title='User Id']"));
		js.executeScript("arguments[0].value='101041154422'", txtLogin);
		Thread.sleep(5000);
		WebElement txtPassClick = driver.findElement(By.xpath("(//input[@onkeypress='return checkEnter(event);'])[4]"));
		txtPassClick.click();
		js.executeScript("arguments[0].value='qwerty123'", txtPassClick);
		driver.findElement(By.xpath("//input[@onclick='return feba.js.adaptive.icici.onLoginSubmit(this.id);']"))
				.click();
	}

}
