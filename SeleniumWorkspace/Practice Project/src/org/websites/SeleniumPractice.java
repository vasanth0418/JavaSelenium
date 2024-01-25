package org.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Utils;

public class SeleniumPractice {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(5000); //Wait for 5 seconds
		/*driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();*/
//		driver.findElement(By.linkText("Elemental Selenium")).click();
//		driver.findElement(By.partialLinkText("Elemental")).click();
		driver.findElement(By.tagName("input")).sendKeys("tomsmith");
		driver.findElement(By.tagName("input")).sendKeys("SuperSecretPassword!");
		/*
		 * 1. What is XPath? 
		 * 	 
		 * 	  A query language which is used to find a node or set of nodes in XML/HTML document
		 * 
		 * 2. Relative XPath Using Node Attributes
		 *     
		 *    Syntax: //TagName[@Attribute Name="Attribute Value"]
		 *    
		 */
		driver.findElement(By.xpath("(//input[@name='username' or @id='username'])"));
		driver.findElement(By.cssSelector(""));
		Thread.sleep(10000);
		/*Utils.highLightAndUnHighlightElement(By.name("password"));
		Thread.sleep(5000); //Wait for 5 seconds
*/		driver.quit();
	}

}
