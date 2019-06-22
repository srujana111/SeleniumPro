package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inlineElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		IntializeWebDriver ie = new IntializeWebDriver();
		WebDriver driver = ie.getdriver("Chrome");
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("gb36")).click();
		driver.findElement(By.id("gb27")).click();
		
		
		
		
		
	}

}
