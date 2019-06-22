package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver we = new  IntializeWebDriver();
		 
		WebDriver driver = we.getdriver("firefox");
		
		driver.get("https://www.google.com/");
	}

}
