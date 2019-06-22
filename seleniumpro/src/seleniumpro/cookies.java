package seleniumpro;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver id= new IntializeWebDriver();
		WebDriver driver=id.getdriver("Chrome");
		driver.get("https://www.walmart.com/");
		Set<Cookie>allcookies=driver.manage().getCookies();
		System.out.println(allcookies);
		System.out.println(allcookies.size());
		for(Cookie eachcookie : allcookies) {
			System.out.println(driver.manage().getCookieNamed(eachcookie.getName()));
			System.out.println("cookie Name :"+eachcookie.getName());
			System.out.println("cookie Domain :"+eachcookie.getDomain());
			System.out.println("cookie path :"+eachcookie.getPath());
			System.out.println("cookie value :"+eachcookie.getValue());
			System.out.println("cookie expiry :"+eachcookie.getExpiry());
			
			if(eachcookie.getName().equals("s_vi")) {
				driver.manage().deleteCookie(eachcookie);
				
				
			}
			
		}
		
		driver.manage().deleteCookieNamed("xpa");
		
		driver.manage().deleteAllCookies();
		
		
		

		Set<Cookie> allCookiesAfterDelete=driver.manage().getCookies();
		System.out.println(allCookiesAfterDelete.size());
		
		
		
		
		
	}

}
