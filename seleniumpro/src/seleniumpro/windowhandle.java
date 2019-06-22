package seleniumpro;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		IntializeWebDriver ie=new IntializeWebDriver();
		WebDriver driver =ie.getdriver("Chrome");
		driver.get("http://demo.guru99.com/test/guru99home/");
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		
		driver.switchTo().frame("_mN_main_224278574_0_n");
		driver.findElement(By.linkText("Cyber Security Training")).click();
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		for(String windows:allwindows) {
			if(!windows.equals(mainwindow)) {
				driver.switchTo().window(windows);
				
			}
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
