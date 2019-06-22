package seleniumpro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet ;
public class readexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String strfilename="/Users/prasad_smiles/eclipse-workspace/seleniumpro/ExcelSheets/readexcel.xlsx";
		File file=new File(strfilename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=null;
		
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
		
		for(int i=1;i<=rowCount;i++) {
		Row row=sheet.getRow(i)	;
		String firstName=row.getCell(0).getStringCellValue();
		String lastName=row.getCell(1).getStringCellValue();
		String email=row.getCell(2).getStringCellValue();
		Cell cellphno= row.getCell(3);
		cellphno.setCellType(CellType.STRING);
		String phno=row.getCell(3).getStringCellValue();
		System.out.println(firstName+":"+lastName+":"+email+":"+phno);
		Cell cell_status=row.createCell(4);
		cell_status.setCellValue("pass");
		
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		fos.close();
		
		}
	}

}
