package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.flipkart.com/");	
		
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='✕']")));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions action=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//span[text()='Men']"));
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//a[text()='Kurtas']")).click();
	
		/*List<WebElement>list= driver.findElements(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[3]//a"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getAttribute("href"));
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
