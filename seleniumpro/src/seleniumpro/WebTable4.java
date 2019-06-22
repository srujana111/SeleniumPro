package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		List<WebElement>rowlist=driver.findElements(By.xpath("//table[@class='table table-hover']//tbody//tr"));
		System.out.println(rowlist.size());
		for(int i=0;i<rowlist.size();i++) {
			List<WebElement>columnlist=rowlist.get(i).findElements(By.tagName("td"));
			//System.out.println(columnlist.size());
			System.out.println(columnlist.get(0).getText());
			System.out.println(columnlist.get(1).getText());
			System.out.println(columnlist.get(2).getText());
			System.out.println(columnlist.get(3).getText());
			System.out.println(columnlist.get(4).getText());
			System.out.println(columnlist.get(5).getText());
			System.out.println(columnlist.get(6).getText());
			
			/*for(int j=0;j<columnlist.size();j++) {
				System.out.println(columnlist.get(j).getText());
			}*/
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
