package seleniumpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class yahoowithexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	String strfilename="/Users/prasad_smiles/eclipse-workspace/seleniumpro/ExcelSheets/readexcel.xlsx";
	File file=new File(strfilename);
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=null;{
	
	if(strfilename.contains(".xlsx"))
	{
	workbook=new XSSFWorkbook(fis);
	}
	else if(strfilename.contains(".xls")){
		workbook=new HSSFWorkbook(fis);
	}
	

	Sheet sheet= workbook.getSheet("sheet1");
	
	

	int rowCount=sheet.getLastRowNum();
	
	System.out.println("Row Count "+rowCount);
	
}
}}