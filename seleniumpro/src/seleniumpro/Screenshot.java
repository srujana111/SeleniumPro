package seleniumpro;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
   
	
		
	
	public static void CaptureScreenshot(WebDriver driver,String fileName)  {
		//String strPath="./screenshots/";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("/Users/prasad_smiles/eclipse-workspace/seleniumpro/screenshots/"+fileName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void CaptureAlertScreenshot(String fileName) throws Exception  {
		Robot robot=new Robot();
		Rectangle rect=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image=robot.createScreenCapture(rect);
		ImageIO.write(image, "png", new File("/Users/prasad_smiles/eclipse-workspace/seleniumpro/screenshots/"+fileName+".png"));
	}
	
	

}
