package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntializeWebDriver {

	WebDriver driver;
	
	public WebDriver getdriver(String browsertype) {
		
		
		if(browsertype.equalsIgnoreCase("Chrome")) {
		
			 driver = new ChromeDriver();
			
		}
			else if(browsertype.equalsIgnoreCase("Firefox")) {
				
					 driver = new FirefoxDriver();		
			}
		return driver;
	}
}
