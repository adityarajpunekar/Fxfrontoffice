package Parametrs;
import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class ratecategory {
			
			public static void main(String[] args) throws InterruptedException{
		
				System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
				WebDriver driver=new ChromeDriver();
				driver.get("https://productsqa.idsnext.com/#/login");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
			       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
			       //driver.findElement(By.xpath(""))
			       driver.findElement(By.xpath("//button[@class='login-button']")).click();
			       //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			       driver.findElement(By.xpath("//img[contains(@src,'./assets/img/products/new-images/FX-FrontDesk-100.png')]")).click();
			       driver.findElement(By.xpath("//label[text()='Configuration']")).click();
		// TODO Auto-generated method stub
			       driver.findElement(By.xpath("//span[@id='Rate']")).click();
driver.findElement(By.xpath("//span[text()='Rate Category']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//p[@class='plus']")).click();
driver.findElement(By.xpath("//input[@id='mdcode-input']")).sendKeys("166");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='mdname-input']")).sendKeys("adv");
WebElement element=driver.findElement(By.xpath("//md2-select[@class='dropdownProperty ng-pristine ng-invalid ng-touched']"));
//Actions action=new Actions(driver);
//action.moveToElement(element).click().perform();
element.click();
//Thread.sleep(1000);
WebElement element2=driver.findElement(By.xpath("//div/md2-option[@role='option'][3]"));
element2.click();
driver.findElement(By.xpath("//label[@id='input-toggle']")).click();
driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
