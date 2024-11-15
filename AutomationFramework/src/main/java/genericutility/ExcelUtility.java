package genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * @author Shobha
 */
public class ExcelUtility {
/**
 * This method is used to read string data from excel
 * user must pass sheetName,rowIndex,colIndex
 * @param sheetName
 * @param rowIndex
 * @param colIndex
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
Workbook workbook=WorkbookFactory.create(fis);
return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();

}
}
