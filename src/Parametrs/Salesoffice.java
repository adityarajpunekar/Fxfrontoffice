package Parametrs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Salesoffice {
	public static void main(String[] args) throws InterruptedException {
	      
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
//step1
       
       driver.get("https://productsqa.idsnext.com/#/login");
       driver.manage().window().maximize();
     //step2  
  Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
     driver.findElement(By.xpath("//button[@class='login-button']")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
	
	
	driver.findElement(By.xpath("//label[text()='Configuration']")).click();
   driver.findElement(By.xpath("//span[text()='Business Account']")).click();
   driver.findElement(By.xpath("//a[@href='#/sales-office']")).click();
   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.findElement(By.xpath("//p[text='+'] ")).click();
   
   driver.findElement(By.xpath("(//input[@class='md-input-element ng-pristine ng-invalid ng-touched'])[1]")).sendKeys("144");
   driver.findElement(By.xpath("(//input[@class='md-input-element ng-pristine ng-invalid ng-touched'])[2]")).sendKeys("type");
   
   //driver.findElement(By.xpath("//span[text()='Title']")).
   //driver.findElement(By.xpath("//label[@id='input-toggle']")).click();	
   driver.findElement(By.xpath("(//input[@class='md-input-element ng-pristine ng-invalid ng-touched'])[3]")).sendKeys("type");
   driver.findElement(By.xpath("//input[@id='salesOffice_mobile-input']")).sendKeys("95424");
   
   

  
   
   

	}
}
