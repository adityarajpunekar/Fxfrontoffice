package Parametrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bookerprofile {

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
	       driver.findElement(By.xpath("//span[text()='Booker Profile']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//p[@class='plus']")).click();
		   driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("165");
		   Thread.sleep(1000);
		   WebElement element=driver.findElement(By.xpath("//span[text()='Title']"));

		   Actions action=new Actions(driver);
		   action.moveToElement(element).click().perform();
		   List<WebElement> menudd=driver.findElements(By.xpath("//div/md2-option[@role='option']"));
		   for(int i=0;i<menudd.size();i++)
		   {
			   //Thread.sleep(2000);
			WebElement element1=menudd.get(i);
			String innerhtml =element1.getText();
			if(innerhtml.contentEquals("Mr"))
	    	{
	    		element1.click();
	    	}
	    	
	    }
		
		// TODO Auto-generated method stub

	}

}
