package seleniumpro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.google.com/");
		//Screenshot.CaptureScreenshot(driver, "googlepage");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Selenium");
		element.sendKeys(Keys.ENTER);
		
		
		
		Screenshot.CaptureScreenshot(driver, "seleniumpage");
	
		driver.findElement(By.xpath("//h3[text()=\'Selenium - Web Browser Automation']")).click();
		Screenshot.CaptureScreenshot(driver, "result page");
		driver.findElement(By.linkText("Download")).click();
		String stractualURl = driver.getCurrentUrl();
		if(stractualURl .equals("https://www.seleniumhq.org/download/")){
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
			
		driver.close();
			}
		}
	


