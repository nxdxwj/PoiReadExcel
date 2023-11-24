import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {

    public static void main(String[] args) {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("测试");
        HSSFRow row = sheet.createRow(0);

        HSSFCell cell = row.createCell(0);
        cell.setCellValue("学号");

        HSSFCell cell1 = row.createCell(1);
        cell1.setCellValue("姓名");

        HSSFCell cell2 = row.createCell(2);
        cell2.setCellValue("账号");

        HSSFCell cell3 = row.createCell(3);
        cell3.setCellValue("密码");

        System.out.println("数据准备完成！");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("信息测试.xlsx");

            try {
                workbook.write(fileOutputStream);

                fileOutputStream.close();
                System.out.println("数据写入完成！");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }






}
