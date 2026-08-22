/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class PerfectSquareChecker {
    //Hàm kiểm tra xem n có phải là số chính phương hay không
    public boolean checkPerfectSquare(int n){
        //Sử dụng hàm Math.sqrt để tính căn bậc 2 của n
        int k = (int)Math.sqrt(n);
        //trả về so sánh k*k với n
        return k*k==n; 
    }
    
    //Kiểm tra số nguyên n và hiển thị 
    public void checkAndDislayResult(int n){
        //Kiểm tra số n nhập vào
        if(n<=0){
            System.out.println("Dien so lon hon 0");
        }else{
            if(checkPerfectSquare(n)){ //Kiểm tra có phải số chính phương không bằng cách gọi hàm kiểm tra 
                System.out.println(n + " la so chinh phuong"); // Hiển thị kết quả phù hợp
            }else{
                System.out.println(n+ " khong la so chinh phuong"); // Hiển thị kết quả phù hợp
            }
        }
    }
    
}
