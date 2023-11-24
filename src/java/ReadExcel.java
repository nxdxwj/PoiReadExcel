import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) {

        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("./学生信息.xlsx"));
            //int numberOfSheets = xssfWorkbook.getNumberOfSheets();

            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

            int rowNum = sheet.getLastRowNum();
            //System.out.println(rowNum);
            for (int row = 0; row <= rowNum; row++) {

                int maxRol = sheet.getRow(row).getLastCellNum();

                System.out.println("------第 "+ (row+1) +" 行数据如下：------");
                for (int rol = 0; rol < maxRol; rol++) {

                    System.out.println(sheet.getRow(row).getCell(rol).getCellType());
                    
                }
                System.out.println();

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
