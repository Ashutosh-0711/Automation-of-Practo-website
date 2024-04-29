package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class INutilities {
	public static FileInputStream file;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static List<String> data1= new ArrayList();
	public static List<String> data2= new ArrayList();

	
	public static List<String> valid_FormData() throws IOException   {
		 
		file= new FileInputStream(".\\TestData\\Input.xlsx");
		workbook = new XSSFWorkbook(file);
    	sheet=workbook.getSheet("Sheet1");
    	
    	
    	
    	for (int i=0;i<4;i++) {
			if(i==2) {
				
				String cellData2=(""+(long) sheet.getRow(2).getCell(i).getNumericCellValue());
				data1.add(cellData2);
			}
			else {
			String cellData2=sheet.getRow(2).getCell(i).toString();
			data1.add(cellData2);
			}
		}
    	workbook.close();
    	file.close();
    	return data1;
}
	
	public static List<String> Invalid_FormData() throws IOException
	{
		file= new FileInputStream(".\\TestData\\Input.xlsx");
		workbook = new XSSFWorkbook(file);
    	sheet=workbook.getSheet("Sheet1");
		
	
		for (int i=0;i<4;i++) {
			if(i==2) {
				
				String cellData=(""+(long) sheet.getRow(1).getCell(i).getNumericCellValue());
				data2.add(cellData);
			}
			else {
			String cellData=sheet.getRow(1).getCell(i).toString();
			data2.add(cellData);
			}
		}
		workbook.close();
		file.close();
		return data2;
		
		
	}
}
