package Parametrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dayendprocess {


		public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://productsqa.idsnext.com/#/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
		       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
		       //driver.findElement(By.xpath(""))
		       driver.findElement(By.xpath("//button[@class='login-button']")).click();
		       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		       driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
		       driver.findElement(By.xpath("//label[text()='Operations']")).click();
		       driver.findElement(By.xpath("//span[@id='Day End Process']")).click();
		       driver.findElement(By.xpath("//span[text()='Run Day End Process']")).click();
		       driver.findElement(By.xpath("//button[@class='button ng-star-inserted'][2]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//button[@class='button ok-button']")).click();
		       driver.findElement(By.xpath("//button[@class='button ng-star-inserted']")).click();
		       Thread.sleep(2000);
		       List<WebElement> element= driver.findElements(By.xpath("//button[text()='Yes']"));
		    		  // (By.xpath("//button[@class='button ok-button']")).click();
		       element.get(1).click();
		       Thread.sleep(32000);
		       driver.findElement(By.xpath("//button[text()='Create Guest Ledger Balance']")).click();
		       Thread.sleep(32000);
		       driver.findElement(By.xpath("//button[text()='Continue']")).click();
		       driver.findElement(By.xpath("//button[text()='Create Night Audit Balance']")).click();
		Thread.sleep(32000);
		 driver.findElement(By.xpath("//button[text()='Continue']")).click();
		 driver.findElement(By.xpath("//button[text()='Open New date']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[text()='Done']")).click();
		  WebElement element1=(WebElement) driver.findElements(By.xpath("//div[@class='account-div']"));
		  String ele=element1.getText();
		  System.out.println(ele);
		 
		       		// TODO Auto-generated method stub

	}

}
