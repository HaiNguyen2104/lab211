/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo đối tượng scanner để đọc dữ liệu
        Scanner sc = new Scanner(System.in);
        
        // Khởi tạo đối tượng dùng để gọi hàm 
        PerfectSquareChecker checker = new PerfectSquareChecker();
        
        //Yêu cầu người dùng nhập vào số n 
        System.out.println("Nhap so n:");
        //Kiểm tra số n nhập vào là dạng interger
        int n = sc.nextInt();
        
        //Kiểm tra và hiển thị kết quả
        checker.checkAndDislayResult(n);
    }
    
}
