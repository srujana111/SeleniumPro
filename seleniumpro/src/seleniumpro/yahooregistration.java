package seleniumpro;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class yahooregistration {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		IntializeWebDriver ie = new IntializeWebDriver();
		WebDriver driver = ie.getdriver("Chrome");
		String strfilename="/Users/prasad_smiles/eclipse-workspace/seleniumpro/ExcelSheets/yahooregistration.xlsx";
		File file=new File(strfilename);
		
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=null;
		if(strfilename.contains(".xlsx")) {
			workbook=new XSSFWorkbook(fis);
			
		}
		
		else if(strfilename.contains(".xls")) {
			workbook=new HSSFWorkbook(fis);
		}
		Sheet list=workbook.getSheet("sheet1");
		
		int rowCount = list.getLastRowNum();
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++) {
			driver.get("https://login.yahoo.com/account/create");
			Row row=list.getRow(i);
			String FirstName=row.getCell(0).getStringCellValue();
			String LastName=row.getCell(1).getStringCellValue();
			String EmailID=row.getCell(2).getStringCellValue();
			//Cell cell_phno=row.getCell(3);
		
			String Password=row.getCell(3).getStringCellValue();
			row.getCell(4).setCellType(CellType.STRING);
			String MobileNo=row.getCell(4).getStringCellValue();
			String Birth_Month=row.getCell(5).getStringCellValue();
			row.getCell(6).setCellType(CellType.STRING);
			String Birth_Day=row.getCell(6).getStringCellValue();
			row.getCell(7).setCellType(CellType.STRING);
			String Birth_year=row.getCell(7).getStringCellValue();
			String Gender=row.getCell(8).getStringCellValue();
			
			driver.findElement(By.id("usernamereg-firstName")).sendKeys(FirstName);
			driver.findElement(By.id("usernamereg-lastName")).sendKeys(LastName);
			driver.findElement(By.id("usernamereg-yid")).sendKeys( EmailID);
			driver.findElement(By.id("usernamereg-password")).sendKeys(Password);
			driver.findElement(By.id("usernamereg-phone")).sendKeys(MobileNo);
			WebElement element=driver.findElement(By.id("usernamereg-month"));
			Select select=new Select(element);
			select.selectByVisibleText(Birth_Month);
			driver.findElement(By.id("usernamereg-day")).sendKeys(Birth_Day);
			driver.findElement(By.id("usernamereg-year")).sendKeys(Birth_year);
			driver.findElement(By.id("usernamereg-freeformGender")).sendKeys(Gender);
			driver.findElement(By.id("reg-submit-button")).click();
			WebDriverWait wait=new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@class='heading']")));
			
			
			Cell cell_status=row.createCell(9);
			
			if(driver.findElement(By.xpath("//h2[@class='heading']")).isDisplayed()){
				cell_status.setCellValue("Pass");
			}else{
				cell_status.setCellValue("Fail");
			}
		}
	
		
		
		
		
		
		
		
	}

}
