package Parametrs;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;    
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ticket {

	
	
	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://products.idsnext.com/#/login");
		
	}
}
		
		

	
