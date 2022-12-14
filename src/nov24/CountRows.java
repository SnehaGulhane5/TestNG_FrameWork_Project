package nov24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRows {

	public static void main(String[] args) throws Throwable {
		//read path of excel file
		FileInputStream fi=new FileInputStream("E:\\SoftwareTesting\\Book.xlsx");
		//get WB from fi file
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		//get sheet from WB
		XSSFSheet ws=wb.getSheet("EmpData");
		//get first row from sheet
		XSSFRow row=ws.getRow(0);
		//Count no. of row in a sheet
		int rc=ws.getLastRowNum();
		//count no. of cell from firstrow
		int cc=row.getLastCellNum();
		System.out.println("No. of rows::"+rc+"No. of cells::"+cc);
		fi.close();
		wb.close();
	}

}
