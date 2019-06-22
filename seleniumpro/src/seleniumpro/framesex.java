package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     WebDriver driver=new ChromeDriver();		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
			
		//driver.switchTo().frame(2);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		//driver.switchTo().frame(0);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		
		
		
		
		
		
	}

}
