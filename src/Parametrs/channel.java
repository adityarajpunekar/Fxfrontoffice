package Parametrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class channel {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
			try{
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
		       driver.findElement(By.xpath("//span[text()='']")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//p[@class='plus']")).click();
			   List<WebElement>ele=driver.findElements(By.xpath("//input[@id='mdname-input']"));
			   ele.get(0).sendKeys("165");
			   ele.get(1).sendKeys("147");
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("//input[@id='mdncode-input']")).sendKeys("adv");
			   WebElement element=driver.findElement(By.xpath("//span[text()='Group ']"));

			   Actions action=new Actions(driver);
			   action.moveToElement(element).click().perform();
			   List<WebElement> menudd=driver.findElements(By.xpath("//div/md2-option[@role='option']"));
			   for(int i=0;i<menudd.size();i++)
			   {
				   //Thread.sleep(2000);
				WebElement element1=menudd.get(i);
				String innerhtml =element1.getText();
				if(innerhtml.contentEquals("Adv"))
		    	{
		    		element1.click();
		    	}
		    	
		    }
			   Thread.sleep(1000);
			   driver.findElement(By.xpath("//input[@id='md-input-3-input']")).sendKeys("1");
			    driver.findElement(By.xpath("//label[@id='input-toggle']")).click();
			    driver.findElement(By.xpath("//button[text()='Save']")).click();
			}
		
			catch(Exception e)
			{
				 e.printStackTrace();
			} 
				}
}


	
