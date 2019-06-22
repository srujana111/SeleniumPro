package seleniumpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetLoation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver iw=new IntializeWebDriver();
		WebDriver driver=iw.getdriver("Chrome");
		driver.get("https://www.facebook.com/");
int uid_x=driver.findElement(By.name("email")).getLocation().getX();
int uid_y=	driver.findElement(By.name("email")).getLocation().getY();	
		
		System.out.println(uid_x+" "+uid_y);
		System.out.println(driver.findElement(By.name("email")).getLocation());
		
		int pwd_x=driver.findElement(By.name("pass")).getLocation().getX();
		int pwd_y=	driver.findElement(By.name("pass")).getLocation().getY();
		
		System.out.println(pwd_x+" "+pwd_y);
		System.out.println(driver.findElement(By.name("pass")).getLocation());
		if(uid_x==pwd_x) {
			System.out.println("uid,pwd are same");
		}
			else {
				System.out.println("uid,pwd arenot same");	
		
		int height=driver.findElement(By.name("email")).getRect().getHeight();
		int width=driver.findElement(By.name("email")).getRect().getWidth();
		System.out.println(height+" "+width);
		}
	}

}
