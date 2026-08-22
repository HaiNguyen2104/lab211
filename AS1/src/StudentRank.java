/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class StudentRank {

    public StudentRank() {
    }
    
    public void displayRank(Student stu){
        double gpa = stu.getGpa();
        if(gpa>=5){
            System.out.println("Thong bao: Dat yeu cau qua mon");
        }else if(gpa>=9){
            System.out.println("Thong bao: Ban qua mon va dajt yeu cau khen ");
        }else{
            System.out.println("Thong bao: Khong dat yeu cau");
        }
    }
}
