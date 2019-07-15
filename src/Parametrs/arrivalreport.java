package Parametrs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrivalreport {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://productsqa.idsnext.com/#/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
	       //driver.findElement(By.xpath(""))
	       driver.findElement(By.xpath("//button[@class='login-button']")).click();
	       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	       driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
	       driver.findElement(By.xpath("//label[text()='Reports']")).click();
	       driver.findElement(By.xpath("//span[@id='Standard Reports']")).click();
	       //driver.findElement(By.xpath("//span[@id='Standard Reports']")).click();
	       
	   
	       driver.findElement(By.xpath("//span[text()='Arrival Report']")).click();
	       Thread.sleep(1000);
	      // driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	       //Thread.sleep(5000);
	       driver.findElement(By.xpath("//button[text()='Generate Report']")).click();
	       //driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	       driver.findElement(By.xpath("//button[text()='Email']")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@class='chip-input ng-pristine ng-valid ng-star-inserted ng-touched']")).sendKeys("aditya.raj@idsnext.com");
	       driver.findElement(By.xpath("//input[@class='md-input ng-pristine ng-invalid ng-touched']")).sendKeys("arrival report test");
	       driver.findElement(By.xpath("//button[text()='Send']")).click();
	       
	
	
	}     
	

}
