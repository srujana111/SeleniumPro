package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class multipletabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Firefox");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND+"t");
		driver.get("https://www.bing.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND+"\t");
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
