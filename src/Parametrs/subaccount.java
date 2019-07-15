package Parametrs;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class subaccount {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
       driver.findElement(By.xpath("//span[text()='Sub Account Type']")).click();
       Thread.sleep(2000);
       //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//p[@class='plus']")).click();
     //  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
      
       driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("15");
      // driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
       

       driver.findElement(By.xpath("//input[@id='mdname-input']")).sendKeys("ab4c");
         
   driver.findElement(By.xpath("//md2-select[contains(@class, 'dropdownProperty')]")).click();
       
       

      driver.findElement(By.xpath("//div[@class='group']/md2-select/div[@class='md2-select-menu open']/md2-option[5]")).click();
      
       //for(WebElement option : options) {
           //if (option.getText().equals("New1")) {
               
           
       
       
       
       
       
       
       
       
       
       
       
             //Select drp=new Select (driver.findElement(By.xpath("(//md2-option[@id='md2-option-26']")));
             //drp.
       //driver.findElement(By.xpath("//span[@class='md2-select-placeholder']")).click();
       //Thread.sleep(2000);
       
       //driver.findElement(By.xpath("(//md2-option[@id='md2-option-26']")).click();
      
       
       //driver.findElement(By.xpath("//label[@class='input-toggle'] ")).click();
       
       //driver.findElement(By.xpath("//button[text()='Save']")).click();
      
            //driver.findElement(By.xpath("//button[text()='Save']")).click();

          

           // System.out.println(element.getText().toString());

       }
    
       
	

	}

