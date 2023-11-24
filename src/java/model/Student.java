package model;

public class Student {
    private int studentID;
    private String studentName;
    private String account;
    private String password;

    public Student(int studentID, String studentName, String account, String password) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.account = account;
        this.password = password;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
