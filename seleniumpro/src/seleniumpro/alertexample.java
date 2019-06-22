package seleniumpro;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertexample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		IntializeWebDriver  iw = new IntializeWebDriver();
		WebDriver driver = iw.getdriver("Chrome");
		driver.get("http://demo.testfire.net/bank/login.aspx");
		driver.findElement(By.id("uid")).sendKeys("abcd");
		driver.findElement(By.name("btnSubmit")).click();
		WebDriverWait wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		Screenshot.CaptureAlertScreenshot("alert");
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		String actualTest=alert.getText();
		if(actualTest.equals("You must enter a valid password"))
		{
			System.out.println("Alert is displayed same as expected");
		}
		else {
			System.out.println("Alert is not displayed same as expected");
		}
		alert.accept();
		
	}

}
