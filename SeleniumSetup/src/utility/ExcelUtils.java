package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;


public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	public static void setExcelFile(String path, String sheetName) throws Exception {
		
		//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
		try {
		
			//Open Excel File
			FileInputStream ExcelFile = new FileInputStream(path);
			
			//Access the required test data sheet in the excel file
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			
			
	}catch (Exception e) {
		throw e;
	}
}
		//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	    public static String getCellData(int RowNum, int ColNum) throws Exception{

   			try{

      			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

      			String CellData = Cell.getStringCellValue();

      			return CellData;

      			}catch (Exception e){

					return"";

      			}

	    }

		//This method is to write in the Excel cell, Row num and Col num are the parameters

		public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

   			try{

      			//Row  = ExcelWSheet.getRow(RowNum);
      			

				Cell = Row.getCell(ColNum);

				if (Cell == null) {

					Cell = Row.createCell(ColNum);

					Cell.setCellValue(Result);

					} else {

						Cell.setCellValue(Result);

					}

      // Constant variables Test Data path and Test Data file name

      				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

      				ExcelWBook.write(fileOut);

      				fileOut.flush();

						fileOut.close();

					}catch(Exception e){

						throw (e);

				}

			}

}