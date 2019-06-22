package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver iw=new IntializeWebDriver();
		WebDriver driver=iw.getdriver("Chrome");
		driver.get("https://www.facebook.com/");
	boolean DisplayStatus=driver.findElement(By.name("email")).isDisplayed();
	boolean EnableStatus=driver.findElement(By.name("email")).isEnabled();
	if(DisplayStatus==true&&EnableStatus==true) {
		driver.findElement(By.name("email")).sendKeys("abcd");
	}
	else {
		System.out.println("username is not displyed or enabled");
	}
		
		
		
	}

}
