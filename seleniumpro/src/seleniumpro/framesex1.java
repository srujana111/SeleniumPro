package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class framesex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver ie=new IntializeWebDriver();
		WebDriver driver =ie.getdriver("Chrome");
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.switchTo().frame(1);
		driver.switchTo().frame("_mN_main_224278574_0_n");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		driver.findElement(By.xpath("//a[text()='Data Science Courses']")).click();
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Insurance Project")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().equals("Insurance Broker System - Login")) {
			System.out.println("Insurance Project is working fine");
		}
		
		else {
			System.out.println("Insurance Project is not working fine");
		}
		
		
		
		
		
		
		
		
		
	}

}
