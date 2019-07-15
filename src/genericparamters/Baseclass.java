package genericparamters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass implements Auto_constants {
public WebDriver driver;
@Beforemethod
public void openparameter(){
	System.setProperty(Chrome_key,Chrome_value);
	driver=new ChromeDriver();
	driver.get("https://productsqa.idsnext.com/#/login");
	//aditya modified
			
}


}
