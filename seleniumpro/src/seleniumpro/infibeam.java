package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class infibeam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	IntializeWebDriver ie=new IntializeWebDriver();
	WebDriver driver=ie.getdriver("Chrome");
	driver.get("https://www.infibeam.com/");
	driver.findElement(By.linkText("LOGIN / REGISTER")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("new-account-btn")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("aadya");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//form[@name='registration-form']//input[@name='email']")).sendKeys("xyz@abc.com");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@name='registration-form']//input[@name='password']")).sendKeys("asdf");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@name='registration-form']//button[text()='CREATE NEW ACCOUNT']")).click();	
		
		
		
		
	}

}
