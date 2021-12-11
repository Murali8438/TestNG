package com.Project1;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ecommers {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\This PC\\eclipse-workspace\\Mini_Project1\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//a[text()='Women']"));
		
		ac.moveToElement(hover).build().perform();
		
		WebElement casuall = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));
		
		casuall.click();
		
		Thread.sleep(3000);
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_3\"]"));
		
		size.click();
		
		WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div"));
		
		//ac.moveToElement(hover2);
	
		hover2.click();
		
		WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"));
		
		cart.click();
		
		//WebElement frame = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]"));
		
		//driver.switchTo().frame(frame);

		Thread.sleep(2000);
		
		WebElement checkout = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		
		checkout.click();
		
		Thread.sleep(2000);
		
		WebElement count = driver.findElement(By.xpath("//input[@class='cart_quantity_input form-control grey']"));
		
		count.clear();
		
		count.sendKeys("5");
		
		WebElement procced = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		
		procced.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		
		email.sendKeys("muralik091@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		
		create.click();
		
		Thread.sleep(3000);
		
//		WebElement mr = driver.findElement(By.className("top"));
//		
//		mr.click();
//		
//		WebElement name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
//	
//		name.sendKeys("Murali");
//		
//		WebElement name2 = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
//	
//		name2.sendKeys("kumar");
//		
//		WebElement pass = driver.findElement(By.id("passwd"));
//	
//		pass.sendKeys("Muralikumar@98");
//		
//		WebElement days = driver.findElement(By.id("days"));
//	
//		Select s1 = new Select(days);
//		
//		s1.selectByValue("12");
//		
//		WebElement mon = driver.findElement(By.id("months"));
//		
//		Select s2 = new Select(mon);
//		
//		s2.selectByVisibleText("February ");
//		
//		WebElement year = driver.findElement(By.id("years"));
//
//		Select s3 = new Select(year);
//
//		s3.selectByValue("1998");
//		
//		WebElement compNmae = driver.findElement(By.id("company"));
//		
//		compNmae.sendKeys("DMVM Company");
//		
//		WebElement adress = driver.findElement(By.id("address1"));
//		
//		adress.sendKeys("513/5D Thendral Nagar Walajapet");
//		
//		WebElement adress2 = driver.findElement(By.id("address2"));
//		
//		adress2.sendKeys("513/5D Thendral Nagar Walajapet");
//		
//		WebElement city = driver.findElement(By.id("city"));
//		
//		city.sendKeys("Vellore");
//		
//		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
//		
//		Select s4 = new Select(state);
//		
//		s4.selectByIndex(17);
//		
//		WebElement zip = driver.findElement(By.id("postcode"));
//			
//		zip.sendKeys("32513");
//		
////		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']"));
////			
////		Select s5 = new Select(country);
////		
////		s5.selectByVisibleText("")
////		
//		WebElement info = driver.findElement(By.id("other"));
//		
//		info.sendKeys("thank you nice to shop her");
//		
//		WebElement phone = driver.findElement(By.id("phone"));
//		
//		phone.sendKeys("8298353992");
//		
//		WebElement phone1 = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
//		
//		phone1.sendKeys("6380625603");
//		
//		WebElement addres3 = driver.findElement(By.id("alias"));
//		
//		addres3.sendKeys("513/5D");
//		
//		WebElement register = driver.findElement(By.xpath("(//button)[2]"));
//		
//		register.click();
		
		WebElement mail = driver.findElement(By.id("email"));
		
		mail.sendKeys("muralik091@gmail.com");
		
		WebElement passs = driver.findElement(By.id("passwd"));
		
		passs.sendKeys("Muralikumar@98");
		
		WebElement sign = driver.findElement(By.id("SubmitLogin"));
		
		sign.click();
		
		WebElement mess = driver.findElement(By.name("message"));
		
		mess.sendKeys("good to use this site ");
		
		WebElement process = driver.findElement(By.name("processAddress"));
		
		process.click();
		
		WebElement click = driver.findElement(By.id("cgv"));
		
		click.click();
		
		WebElement ship = driver.findElement(By.name("processCarrier"));
		
		ship.click();
		
		WebElement pay = driver.findElement(By.className("bankwire"));
	
		pay.click();
		
		WebElement order = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		
		order.click();
		
		//Actions as = new Actions(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,400)");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\This PC\\eclipse-workspace\\Mini_Project1\\Screenshot//shot1.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	


