package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qatechhub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver iw=new IntializeWebDriver();
		WebDriver driver=iw.getdriver("Firefox");
	    driver.get("https://qatechhub.com/");
		
	    String  title=driver.getTitle();
	System.out.println(title);
	if(title.contains("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {

	System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().refresh();
	driver.close();
	}

}
