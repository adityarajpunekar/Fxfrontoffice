package Parametrs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Businesssourcegroup {
	
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
	       driver.findElement(By.xpath("//label[text()='Configuration']")).click();
	       driver.findElement(By.xpath("//span[text()='Reservation']")).click();
		   driver.findElement(By.xpath("//span[text()='Business Source Group']")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//p[@class='plus']")).click();
		   driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("15");
		   Thread.sleep(1000);
		   List<WebElement> ele= driver.findElements(By.xpath("//input[@id='mdname-input']"));
		   ele.get(0).sendKeys("abc");
		  ele.get(1).sendKeys("abc");   
		
		   //WebDriverWait wait = new WebDriverWait(driver, 120);
		   //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//md-input[@formcontrolname='businessSourceGroupNameMultilingual']"))).sendKeys("abc");
		    //WebElement element= driver.findElement(By.xpath("//md-input[@formcontrolname='businessSourceGroupNameMultilingual']"));
		    //element.sendKeys("Abc");
		   driver.findElement(By.xpath("//button[text()='Save']")).click();
		   
		
		
	}

}