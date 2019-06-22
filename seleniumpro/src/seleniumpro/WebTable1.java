package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String filter="j";
		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//List<WebElement>webtablelist=	driver.findElements(By.xpath("//table[@id='task-table']//tbody//tr"));
		
	//System.out.println(webtablelist.size());	
		
	driver.findElement(By.id("task-table-filter")).sendKeys(filter);	
	List<WebElement>webtablelist=driver.findElements(By.xpath("//table[@id='task-table']//tbody//tr[not(contains(@style,'display: none;'))]"));
	//webtablelist.removeAll(hiddenlist);
	System.out.println(webtablelist.size());
	for(WebElement element:webtablelist)	{
		List<WebElement>columnlist=element.findElements(By.tagName("td"));
		//System.out.println(columnlist.size());
		String Task=columnlist.get(1).getText();
		String Asignee=columnlist.get(2).getText();
		String Status=columnlist.get(3).getText();
		String columnvalue=Task+Asignee+Status;
		System.out.println(columnvalue);
		if(columnvalue.toUpperCase().contains(filter.toUpperCase())) {
		System.out.println("pass");	
		}
		else {
			System.out.println("fail");
		}
		
		
	}
		
		
		
		
	}

}
