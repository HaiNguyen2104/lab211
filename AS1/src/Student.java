/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Student {
    private String studentID;
    private String studentName;
    private int age;
    private double gpa;

    public Student() {
    }

    public Student(String studentID, String studentName, int age, double gpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public static void displayRank(){
        
    }
    
    @Override
    public String toString() {
        String info = "Student [ID=" + studentID + ", Name=" + studentName + ", Age=" + age + ", GPA=" + gpa + "]";

        return info;
    }
    
    
}
