package seleniumpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmail1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		IntializeWebDriver iw= new IntializeWebDriver();
		WebDriver driver = iw.getdriver("Chrome");
		

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.id("identifierId"));
		
		element.sendKeys("srujanagouru87");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("sdgtfh");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("passwordNext")).click();
		
	}

}
