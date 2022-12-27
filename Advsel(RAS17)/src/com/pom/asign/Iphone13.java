package com.pom.asign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iphone13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//span[.='Apple iPhone 13 (128GB) - (Product) RED'][1]")).click();
		
		Set<String> all_ids =driver.getWindowHandles();
		List<String> ids = new ArrayList<>(all_ids);
		String child_tab = ids.get(1);
		driver.switchTo().window(child_tab);
		
		String iphone13_price = driver.findElement(By.xpath("//span[.='62,999']")).getText();
		System.out.println(iphone13_price);
		
	}

}
