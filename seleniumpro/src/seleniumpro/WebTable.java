package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.findElement(By.linkText("Show More >>")).click();
		List<WebElement>rowlist=driver.findElements(By.xpath("//table[@id='dataTable']//tbody//tr"));
		System.out.println(rowlist.size());
		for(int i=0;i<rowlist.size();i++) {
			System.out.println("row number"+i);
			
		List<WebElement>columnlist=rowlist.get(i).findElements(By.tagName("td"));
		//System.out.println(columnlist.size());
		//System.out.println(columnlist.get(0).findElement(By.tagName("a")).getText());
		//System.out.println(columnlist.get(1).getText());
		//System.out.println(columnlist.get(2).getText());
		//System.out.println(columnlist.get(3).getText());
		//System.out.println(columnlist.get(4).getText());
		
		
		
		
		for(int j=0;j<columnlist.size();j++) {
		if(j==0) {
			System.out.println(columnlist.get(j).findElement(By.tagName("a")).getText());
			
		}
		else {
			System.out.println(columnlist.get(j).getText());
		}
			
		}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
		
		
		
	}


