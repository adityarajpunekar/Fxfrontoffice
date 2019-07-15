package Parametrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic {
public WebDriver driver;
@BeforeMethod
public void appln() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://productsqa.idsnext.com/#/login");
	Thread.sleep(2000);
	
}	
@AfterMethod
public void closeappln(){
driver.quit();	
}	
}

