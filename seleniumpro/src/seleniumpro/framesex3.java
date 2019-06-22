package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class framesex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver ie=new IntializeWebDriver();
		WebDriver driver =ie.getdriver("Chrome");
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		if(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()) {
			System.out.println("checkbox is slected");
		}
		else {
			System.out.println("checkbox is not selected");
		}
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("UiPath")).click();
		driver.navigate().back();
		
		driver.switchTo().frame("frame2");
		
		//WebElement element =driver.findElement(By.xpath("//iframe[@id='frame2']"));
		//driver.switchTo().frame(element);
		
		//driver.switchTo().frame(1);
		
		//WebElement list =driver.findElement(By.id("animals"));
		WebElement list =driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		
	
		
		Select list1= new Select(list);
		list1.selectByVisibleText("Baby Cat");
		//list1.selectByValue("avatar");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
