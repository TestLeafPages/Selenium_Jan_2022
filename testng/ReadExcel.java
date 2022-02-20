package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// Set up the file path
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		// Get into the sheet
		XSSFSheet ws = wBook.getSheet("CreateLead");
		//XSSFSheet ws = wBook.getSheetAt(0);
		int rows = ws.getLastRowNum();
		System.out.println(rows);
		int allRows = ws.getPhysicalNumberOfRows();
		System.out.println(allRows);
		// Get no of cells
		short cells = ws.getRow(0).getLastCellNum();
		System.out.println(cells);
		
		String[][] data = new String[rows][cells];
		// Get into the row
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = ws.getRow(i);
			// Get into the column
			for (int j = 0; j < cells; j++) {
				XSSFCell cell = row.getCell(j);
				// Read the data from cell
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
				data[i-1][j] = cellValue;
			}
		}
		// Close the file
		wBook.close();
		return data;
		/*
		 * String[][] data = new String[2][3];
		
		data[0][0] = "Qeagle";
		data[0][1] = "Hari";
		data[0][2] = "R";
		
		data[1][0] = "TestLeaf";
		data[1][1] = "Haja";
		data[1][2] = "J";
		
		return data;
		 */
		
	}
}
