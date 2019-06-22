package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class assessment {

	public static void main(String[] args) throws InterruptedException {	
		// TODO Auto-generated method stub


		IntializeWebDriver iw=new IntializeWebDriver();
		WebDriver driver=iw.getdriver("Chrome");
		driver.get("https://www.fb.com");
		String URL=driver.getCurrentUrl();
		if(URL.equals("https://www.facebook.com/")) {
			System.out.println("match");
		}
		else {
			System.out.println("not match");
		}
		
		System.out.println(driver.findElement(By.id("u_0_u")).isDisplayed());
		driver.findElement(By.id("u_0_u")).click();
		driver.findElement(By.name("firstname")).sendKeys("abcde");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		driver.findElement(By.id("u_0_h")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcd12@");
		WebElement month=driver.findElement(By.id("month"));
		Select select =new Select(month);
		select.selectByIndex(2);
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select selectday =new Select(date);
		selectday.selectByValue("20");
	
		WebElement year=driver.findElement(By.id("year"));
		Select selectyear =new Select(year);
		//selectyear.selectByValue("2000");
		selectyear.selectByVisibleText("2000");
		

	driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("websubmit")).click();


}




}
