package Parametrs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;;
public class POSlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://fxposqa.azurewebsites.net/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("surbhi.sreshtha@idsnext.com");
		driver.findElement(By.xpath("//input [@name='password']")).sendKeys("Abc@1234");
		driver.findElement(By.xpath("//span[text()='SIGN IN']")).click();
		// TODO Auto-generated method stub

	}

}
