package Parametrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class channelgroup {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		
				
				
					System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://productsqa.idsnext.com/#/login");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
					driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
					driver.findElement(By.xpath("//button[@class='login-button']")).click();
				       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				       driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
				       driver.findElement(By.xpath("//label[text()='Configuration']")).click();
				       driver.findElement(By.xpath("//span[text()='Reservation']")).click();
				       driver.findElement(By.xpath("//span[text()='Channel Group']")).click();
				       Thread.sleep(2000);
				       driver.findElement(By.xpath("//p[@class='plus']")).click();
					   driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("165");
					   Thread.sleep(1000);
					   driver.findElement(By.xpath("//input[@id='mdname-input']")).sendKeys("adv");
					   driver.findElement(By.xpath("//button[text()='Save']")).click();
			// TODO Auto-generated method stub

		}

	
		// TODO Auto-generated method stub

	}


