package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		IntializeWebDriver am = new IntializeWebDriver();
		
	    WebDriver driver = am.getdriver("Chrome");
	    driver.get("https://www.amazon.com/");
	    WebDriverWait wait= new WebDriverWait(driver,120);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("//span[text()='Samsung UBD-M9500/ZA 4K UHD Blu-Ray Player']")));
		driver.findElement(By.xpath("//span[text()='Samsung UBD-M9500/ZA 4K UHD Blu-Ray Player']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
