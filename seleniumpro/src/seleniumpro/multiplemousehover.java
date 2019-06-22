package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class multiplemousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.toolsqa.com/selenium-webdriver");
		Actions action=new Actions(driver);
		
		WebElement tools=driver.findElement(By.xpath("(//span[text()='Tools'])[1]"));
		
		WebElement uiautomation=driver.findElement(By.xpath("(//span[text()='UI Automation'])[1]"));
		
		action.moveToElement(tools).moveToElement(uiautomation).perform();
		driver.findElement(By.xpath("(//span[text()='Selenium Tutorial'])[1]")).click();
		
		
		
		
		
		
		
		
	}

}
