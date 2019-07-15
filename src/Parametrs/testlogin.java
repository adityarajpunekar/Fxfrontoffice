package Parametrs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testlogin extends generic {
	@Test
	public void testlogin1() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='md-input-0-input']")).sendKeys("nitish.kumar@idsnext.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ids@1234");
		driver.findElement(By.xpath("//button[@class='login-button']")).click();
Thread.sleep(3000);
String Title=driver.getTitle();
System.out.print(Title);
	}

}
