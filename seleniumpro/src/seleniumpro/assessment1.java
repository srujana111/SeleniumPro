package seleniumpro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class assessment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntializeWebDriver ie = new IntializeWebDriver();
		WebDriver driver = ie.getdriver("Chrome");
		driver.get("https://en.wikipedia.org/wiki/Metis_(mythology)");
		List<WebElement>list=driver.findElements(By.xpath("//div[@id='toc']//a//span[@class='toctext']"));
		List<WebElement>displaylist=driver.findElements(By.xpath("//span[@class='mw-headline']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String list1=list.get(i).getText();
			String list2=displaylist.get(i).getText();
			if(list1.equals(list2)) {
				System.out.println("matching");
			}
			else {
				System.out.println("not matching");
			}
			
		}	
			
			List<WebElement>hlinks=driver.findElements(By.xpath("//div[@id='toc']//a"));
			for(int j=0;j<hlinks.size();j++) {
				
				String href=hlinks.get(j).getAttribute("href");
			
				//System.out.println(href);
				hlinks.get(j).click();
		String url=	driver.getCurrentUrl();
		//System.out.println(url);
		if(href.equals(url)) {
			System.out.println("working");
		}
		else {
			System.out.println("not working");
		}
				
			}
			
			
			WebElement element=driver.findElement(By.xpath("(//a[@title='Nike (mythology)'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		String text=driver.findElement(By.xpath("//a[@dir='ltr']//p")).getText();
	
		System.out.println(text);
		if(text.equals("In ancient Greek religion, Nike was a goddess who personified victory. Her Roman equivalent was Victoria.")) {
			System.out.println("text matching");
		}
		else {
			System.out.println("text not matching");
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
