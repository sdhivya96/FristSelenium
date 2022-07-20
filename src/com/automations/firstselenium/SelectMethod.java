package com.automations.firstselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ezhil\\course\\FirstSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/select-menu");
		   
		   List<WebElement> allcars =driver.findElements(By.xpath("//select[@ name=\"cars\"]"));
		  for(int i=0;i<=allcars.size()-1;i++) {
			  WebElement carnames=allcars.get(i);
			  System.out.println("all car name==");
			  System.out.println(carnames.getText());
			  }
		  WebElement allcar = driver.findElement(By.xpath("//select[@ name=\"cars\"]"));
		  Select s=new Select(allcar);
		  s.selectByIndex(0);
		  s.selectByIndex(1);
		  s.selectByVisibleText("Opel");
		  s.deselectByIndex(1);
		  List<WebElement> mySelectAll=s.getAllSelectedOptions();
		  for(WebElement m :mySelectAll)
			  System.out.println(m.getText());
		  

	}

}
