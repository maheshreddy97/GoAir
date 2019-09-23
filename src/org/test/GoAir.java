package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoAir {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-12\\eclipse\\jee-2019-06\\eclipse\\Manish Vinay\\WizzAir\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goair.in");
		driver.manage().window().maximize();
		
		
	
	    WebElement c = driver.findElement(By.xpath("(//input[@placeholder='From'])[2]"));
	    c.click();
	    Robot r=new Robot();
	    for (int i = 0; i <=3; i++) {
	    	r.keyPress(KeyEvent.VK_DOWN);
	    	r.keyRelease(KeyEvent.VK_DOWN);
	    }
	    r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
	   driver.findElement(By.xpath("(//input[@placeholder='To'])[2]")).click();
    	for (int i = 0; i <=3; i++) {
			
		
		r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	}
	 r.keyPress(KeyEvent.VK_ENTER);
 	r.keyRelease(KeyEvent.VK_ENTER);
 	
 	driver.findElement(By.xpath("(//input[@name='StartDate'])[2]")).click();
 	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[2]")).click();
 	driver.findElement(By.xpath("(//input[@name='EndDate'])[1]")).click();
 	driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]")).click();
	driver.findElement(By.xpath("(//button[text()='Book Now'])[2]")).click();	
	
	driver.findElement(By.xpath("(//td[@journey='0'])[15]")).click();
	WebElement c1 = driver.findElement(By.xpath("(//td[@data-fare-class='RT'])[11]"));
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()",c1);
	
	WebElement c2 = driver.findElement(By.xpath("(//span[@class='mdl-button__ripple-container'])[4]"));
	j.executeScript("arguments[0].click()",c2);
	
	WebElement c3 = driver.findElement(By.xpath("//select[@id='goAirPassengers_0__Name_Title']"));
	j.executeScript("arguments[0].click()",c3);
	
	for (int i = 0; i <=3; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
	}
	 r.keyPress(KeyEvent.VK_ENTER);
	 	r.keyRelease(KeyEvent.VK_ENTER);
	 	
	 	
	 	WebElement c4 = driver.findElement(By.xpath("//input[@id='goAirPassengers_0__Name_First']"));
	 	j.executeScript("arguments[0].click()",c4);
	c4.sendKeys("mahesh");
	
	WebElement c5 = driver.findElement(By.xpath("//input[@id='goAirPassengers_0__Name_Last']"));
 	j.executeScript("arguments[0].click()",c5);
c4.sendKeys("reddy");

WebElement c6 = driver.findElement(By.xpath("//select[@id='goAirPassengers_0__Info_Gender']"));
j.executeScript("arguments[0].click()",c6);

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
	
	

}
