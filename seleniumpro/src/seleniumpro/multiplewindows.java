package seleniumpro;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver ie=new IntializeWebDriver();
		WebDriver driver =ie.getdriver("Chrome");
		driver.get("http://demo.guru99.com/test/guru99home/");
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		
		driver.switchTo().frame("_mN_main_224278574_0_n");
		driver.findElement(By.linkText("Cyber Security Training")).click();
		
		
		driver.findElement(By.linkText("Data Science Courses Online")).click();

		
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		
	/*	for(String windows:allwindows) {
			if(!windows.equals(mainwindow)) {
				driver.switchTo().window(windows);
				driver.close();
			}
			
			
		}      */
		
		
		//ArrayList<String>tabs=new ArrayList<>(allwindows);
		//driver.switchTo().window(tabs.get(2));
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
