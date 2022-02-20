package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String fileName) throws IOException {
		// Set the Path of the excel workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+ fileName + ".xlsx");

		// Get into the sheet
		XSSFSheet ws = wb.getSheetAt(0);
		// wb.getSheetAt(0);

		// Get No. of Rows (Excluding Header)
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);

		// Get Rows Count with Header
		int totalRowsCount = ws.getPhysicalNumberOfRows();
		System.out.println(totalRowsCount);
		
		// Get No. of Cells from Header
		int cellCount = ws.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j < cellCount; j++) {
				// Get into First Row (Excluding Header)
				// XSSFRow row = ws.getRow(1);
				// Get into First Cell
				XSSFCell cell = row.getCell(j);
				// Retrive the data
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
		}
		
		// Close Excel Workbook
		wb.close();
		
		/*
		 * String[][] data = new String[2][3];
		
		data[0][0] = "TestLeaf";
		data[0][1] = "Haja";
		data[0][2] = "J";
		
		data[1][0] = "Qeagle";
		data[1][1] = "Hari";
		data[1][2] = "R";
		
		return data;
		 * 
		 */
		return data;

	}

}
