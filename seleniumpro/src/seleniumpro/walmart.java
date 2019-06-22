package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class walmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

IntializeWebDriver am = new IntializeWebDriver();
		
	    WebDriver driver = am.getdriver("Chrome");
	    
	    driver.get("https://www.walmart.com/");
	   driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
	   Actions builder=new Actions(driver); 
	    
	    
	    
	    
	}

}
