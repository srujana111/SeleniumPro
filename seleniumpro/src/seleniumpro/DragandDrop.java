package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement srcelement=driver.findElement(By.id("draggable"));
		WebElement destelement=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(srcelement, destelement).perform();;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
