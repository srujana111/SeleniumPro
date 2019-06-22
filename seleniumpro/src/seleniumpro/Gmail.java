package seleniumpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver iw= new IntializeWebDriver();
		WebDriver driver = iw.getdriver("Chrome");
		/* driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.linkText("Sign in")).click();
		WebElement gmail = driver.findElement(By.name("identifier"));
		gmail.sendKeys("srujanagouru87");
		*/
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("srujanagouru87");
		driver.findElement(By.className("CwaK9")).click();
		
		
		driver.findElement(By.name("password")).sendKeys("lalitham9");
		//driver.findElement(By.name("password")).sendKeys("cgmnkj");
		driver.findElement(By.id("passwordNext")).click();
	
		driver.findElement(By.xpath("//div[@role='button' and @gh='cm']")).click();
		driver.findElement(By.name("to")).sendKeys("srujana8316@gmail.com");
		//driver.findElement(By.className("gO aQY")).sendKeys("srujana8316@gmail.com");
		driver.findElement(By.id(":qh")).sendKeys("Test Subject");
		driver.findElement(By.id(":rm")).sendKeys("hi");
		driver.findElement(By.id(":q7")).click();
	}
	
	

}

