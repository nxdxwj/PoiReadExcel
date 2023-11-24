import model.Student;
import model.StudentsList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ReadExcel {

    public static void main(String[] args) {

        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("./学生信息.xlsx"));
            //int numberOfSheets = xssfWorkbook.getNumberOfSheets();

            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

            int rowNum = sheet.getLastRowNum();

            //System.out.println(rowNum);
            ArrayList<Student> students = new ArrayList<>();
            for (int row = 1; row <= rowNum; row++) {



                int maxRol = sheet.getRow(row).getLastCellNum();

                //System.out.println("------第 " + (row) + " 行数据如下：------");

                String id = sheet.getRow(row).getCell(0).toString();

                String name = sheet.getRow(row).getCell(1).toString();

                String account = sheet.getRow(row).getCell(2).toString();

                String password = sheet.getRow(row).getCell(3).toString();


                Student student = new Student(id,name,account,password);
                students.add(students.size(),student);
            }


            StudentsList studentsList = new StudentsList();
            studentsList.setStudentsList(students);
            System.out.println("数据采集完成！");
            System.out.println();

            for (int i = 0; i < studentsList.getStudentsList().size(); i++) {
                System.out.println(studentsList.getStudentsList().get(i).toString());
            }




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
