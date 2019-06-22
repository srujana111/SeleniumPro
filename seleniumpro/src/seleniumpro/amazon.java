package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		IntializeWebDriver am = new IntializeWebDriver();
		
	    WebDriver driver = am.getdriver("Chrome");
	    
	    driver.get("https://www.amazon.com/");
	    
	   driver.findElement(By.linkText("Today's Deals")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("100_dealView_0")).click();
	   
	   
	   
	  
	   
	    
	    
	    
	    
	}
	
	}

