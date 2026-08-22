/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentRank rankDisplay = new StudentRank();
        Student st1 = new Student("SV01", "Nguyen Van A", 20, 9.5);
        Student st2 = new Student("SV02", "Tran Thi B", 21, 6.5);
        Student st3 = new Student("SV03", "Le Van C", 19, 4.0);

        System.out.println(st1.toString());      
        rankDisplay.displayRank(st1);           

        System.out.println(); 

        System.out.println(st2.toString());
        rankDisplay.displayRank(st2);

        System.out.println(); 

        System.out.println(st3.toString());
        rankDisplay.displayRank(st3);
    }
    
}
