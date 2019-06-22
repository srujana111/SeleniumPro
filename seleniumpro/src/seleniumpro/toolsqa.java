package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class toolsqa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver qa= new IntializeWebDriver();
		WebDriver driver = qa.getdriver("Chrome");
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("srujana");
		driver.findElement(By.name("lastname")).sendKeys("gouru");
		//driver.findElement(By.id("sex-0")).click();
		
		click_Radibutton_checkbox(driver,"sex","Female");
		driver.findElement(By.id("datepicker")).sendKeys("10/12/1990");
		click_Radibutton_checkbox(driver,"profession","Manual Tester");
		click_Radibutton_checkbox(driver,"tool","QTP");
		click_Radibutton_checkbox(driver,"tool","Selenium IDE");
		
		WebElement element_continents=driver.findElement(By.id("continents"));
		
		Select select = new Select(element_continents);
		System.out.println(select.isMultiple());
		select.selectByIndex(2);
		//select.selectByValue(arg0);
		select.selectByVisibleText("Asia");
		
		List<WebElement>available_continents=select.getOptions();
		for(int i=0;i<available_continents.size();i++) {
			String continentsList = available_continents.get(i).getText();
			System.out.println(continentsList);
		}
		
		WebElement element_commands = driver.findElement(By.id("selenium_commands"));
		Select select_multiple= new Select(element_commands);
		System.out.println(select.isMultiple());
		
		List<WebElement>availableCommands=select_multiple.getOptions();
		for(int i=0;i<availableCommands.size();i++) {
			
			String commandsList=availableCommands.get(i).getText();
			System.out.println(commandsList);
			
		}
		
		select_multiple.selectByVisibleText("Switch Commands");
		select_multiple.selectByVisibleText("Navigation Commands");
		
		WebElement firstSelectedCommand=select_multiple.getFirstSelectedOption();
		System.out.println(firstSelectedCommand.getText());
		
		
		List<WebElement> AllSelected= select_multiple.getAllSelectedOptions();
		
		for(int i=0;i<AllSelected.size();i++) {
			String selectedCommands=AllSelected.get(i).getText();
			System.out.println(selectedCommands);
		}
	}

	
	public static void click_Radibutton_checkbox(WebDriver driver,String name,String value) {
		driver.findElement(By.xpath("//input[@name='"+name+"' and @value='"+value+"']")).click();
		
	}
	
	
}
