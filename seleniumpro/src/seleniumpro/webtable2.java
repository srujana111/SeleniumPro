package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.seleniumeasy.com/test/table-records-filter-demo.html");
		
		List<WebElement>rowlist=driver.findElements(By.xpath("//table[@class='table table-filter']//tbody//tr"));
		System.out.println(rowlist.size());
		
		boolean element=driver.findElement(By.xpath("(//span[text()='(Green)'])[2]")).isSelected();
		if(element==true) {
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
