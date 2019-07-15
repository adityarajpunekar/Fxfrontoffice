package Parametrs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;;

public class firefox {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	      WebDriver driver=new FirefoxDriver();
	//step1
	         
	         driver.get("https://productsqa.idsnext.com/#/login");
	         driver.manage().window().maximize();
	       //step2  
	    Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
	       driver.findElement(By.xpath("[@id='md-input-1-input']")).sendKeys("Ids@1234");
	       driver.findElement(By.xpath("//button[@class='login-button']")).click();
	       
		}
	       

	
		// TODO Auto-generated method stub

	}


