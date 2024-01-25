package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.websites.SeleniumPractice;

public class Utils {
	public static void highLightAndUnHighlightElement(By by) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) SeleniumPractice.driver;
		WebElement element = SeleniumPractice.driver.findElement(by);
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		Thread.sleep(200);
		js.executeScript("arguments[0].removeAttribute('style','')", element);
	}
	
   /*String attribute = driver.findElement(By.id("username")).getAttribute("value");
	System.out.println("Username Entered : "+attribute);
	String attribute2 = driver.findElement(By.name("password")).getAttribute("value");
	System.out.println("Password Entered : "+attribute2);
	String text = driver.findElement(By.className("subheader")).getText();
	System.out.println("Output : "+text);*/
	
	
	
}
