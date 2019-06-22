package seleniumpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gogle.com");
	
		System.out.println(driver.getTitle());

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.amazon.com/");
		
		String actualURl =driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		if(actualURl.equals("https://www.amazon.com/")){
			System.out.println("actual url is same as expected");
		}else{
			System.out.println("actual url is not same as expected");
		}
		driver.close();
}
}