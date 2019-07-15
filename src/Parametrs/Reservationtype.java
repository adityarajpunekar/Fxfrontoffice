package Parametrs;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reservationtype {
	 static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	      
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
//step1
		 try{
      driver=new ChromeDriver();
      WebDriverWait wait = new WebDriverWait(driver,300);
      driver.get("https://productsqa.idsnext.com/#/login");
      driver.manage().window().maximize();
    //step2  
 Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
    driver.findElement(By.xpath("//button[@class='login-button']")).click();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
    driver.findElement(By.xpath("//label[text()='Configuration']")).click();
    driver.findElement(By.xpath("//span[text()='Reservation']")).click();
    driver.findElement(By.xpath("//span[text()='Reservation Type']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//p[text()='+']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("144");
    driver.findElement(By.xpath("//input[@id='mdname-input']")).sendKeys("confirm");
   //WebElement ele= driver.findElement(By.xpath("//span[text()='Group ']"));
		  //ele.click();
    WebElement element = driver.findElement(By.xpath("//span[text()='Group ']"));

    Actions actions = new Actions(driver);

    actions.moveToElement(element).click().perform();
    List<WebElement> menudrop=driver.findElements(By.xpath("//div/md2-option[@role='option']"));
    for(int i=0;i<menudrop.size();i++)
    {
    	
    	WebElement element1=menudrop.get(i);
    	
    	String innerhtml =element1.getText();
    	System.out.println(innerhtml);
    	if(innerhtml.contentEquals("Waitlist"))
    	{
    		element1.click();
    	}
    	
    }
    driver.findElement(By.xpath("//input[@id='md-input-3-input']")).click();
    driver.findElement(By.xpath("//label[@id='input-toggle']")).click();
    driver.findElement(By.xpath("//button[text()='Save']")).click();
    		
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }    	
    
	      }

	private static void getAttribute(String string) {
		// TODO Auto-generated method stub
		
	}
	}

	      
  
	