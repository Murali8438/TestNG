package com.Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Ecomerce1 {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\This PC\\eclipse-workspace\\Mini_Project1\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement dress = driver.findElement(By.xpath("(//div[@class='product-container'])[3]"));
		
		dress.click();
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.xpath("//input[@id='quantity_wanted']"));
		
		quantity.clear();
		
		quantity.sendKeys("5");
		
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		
		Select s = new Select(size);
		
		s.selectByValue("3");
		
		 WebElement add = driver.findElement(By.name("Submit"));
		
		add.click();

		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		//Thread.sleep(2000);
		
		WebElement procced = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	
		Thread.sleep(200);
		
		procced.click();
	
		//WebElement procced_but = driver.findElement(By.linkText("Proceed to checkout"));
		
		//procced_but.click();
		
		WebElement confirm = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	
		confirm.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		
		email.sendKeys("muralik091@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		
		create.click();
		
		WebElement mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		
		mr.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
	
		name.sendKeys("Murali");
		
		WebElement name2 = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
	
		name2.sendKeys("kumar");
		
		WebElement pass = driver.findElement(By.id("passwd"));
	
		pass.sendKeys("Muralikumar@98");
		
		WebElement days = driver.findElement(By.id("days"));
	
		Select s1 = new Select(days);
		
		s1.selectByValue("12");
		
		WebElement mon = driver.findElement(By.id("months"));
		
		Select s2 = new Select(mon);
		
		s2.selectByVisibleText("February ");
		
		WebElement year = driver.findElement(By.id("years"));

		Select s3 = new Select(year);

		s3.selectByValue("1998");
		
		
		
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
