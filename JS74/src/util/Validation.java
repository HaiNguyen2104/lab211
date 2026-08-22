/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp tiện ích kiểm tra và xử lý lỗi nhập dữ liệu từ bàn phím.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 21/08/2026
 */

import java.util.Scanner;

/**
 * Lớp Validation chịu trách nhiệm kiểm tra tính hợp lệ của dữ liệu đầu vào.
 */
public class Validation {

    // Khởi tạo đối tượng Scanner dùng chung để đọc dữ liệu từ bàn phím
    private static final Scanner in = new Scanner(System.in);

    /**
     * Phương thức kiểm tra lựa chọn Menu nằm trong khoảng [min, max].
     * 
     * @param min Giới hạn nhỏ nhất được chấp nhận
     * @param max Giới hạn lớn nhất được chấp nhận
     * @return Số nguyên hợp lệ nằm trong khoảng [min, max]
     */
    public static int checkIntLimit(int min, int max) {
        // Vòng lặp vô hạn duy trì hỏi người dùng cho đến khi nhập đúng
        while (true) {
            try {
                // Đọc chuỗi nhập vào và ép kiểu sang số nguyên
                int n = Integer.parseInt(in.nextLine().trim());
                // Kiểm tra xem số vừa nhập có nằm trong khoảng [min, max] hay không
                if (n >= min && n <= max) {
                    return n; // Trả về số nguyên hợp lệ và thoát hàm
                }
            } catch (NumberFormatException e) {
                // Bắt ngoại lệ nếu người dùng nhập chữ hoặc ký tự đặc biệt
            }
            // In thông báo yêu cầu nhập lại khi dữ liệu không hợp lệ
            System.out.print("Please input number in range [" + min + ", " + max + "]: ");
        }
    }

    /**
     * Phương thức kiểm tra kích thước hàng/cột ma trận (phải là số nguyên > 0).
     * 
     * @return Số nguyên lớn hơn 0
     */
    public static int checkIntMatrix() {
        // Vòng lặp vô hạn bắt lỗi nhập kích thước ma trận
        while (true) {
            try {
                // Ép kiểu chuỗi nhập vào sang số nguyên
                int n = Integer.parseInt(in.nextLine().trim());
                // Kích thước hàng và cột ma trận bắt buộc phải lớn hơn 0
                if (n > 0) {
                    return n; // Trả về kích thước hợp lệ
                }
            } catch (NumberFormatException e) {
                // Bắt lỗi nếu người dùng không nhập đúng định dạng số nguyên
            }
            // In thông báo lỗi khi kích thước <= 0 hoặc không phải số
            System.out.print("Values of matrix must be a number > 0: ");
        }
    }

    /**
     * Phương thức kiểm tra giá trị của từng phần tử trong ma trận (chấp nhận mọi số nguyên âm, dương, 0).
     * 
     * @return Số nguyên giá trị của phần tử
     */
    public static int checkInputMatrix() {
        // Vòng lặp vô hạn bắt lỗi nhập phần tử ma trận
        while (true) {
            try {
                // Trả về số nguyên hợp lệ ngay sau khi ép kiểu thành công
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                // Bắt lỗi nếu người dùng nhập chữ thay vì số
                System.out.print("Values of matrix must be the number: ");
            }
        }
    }
    
    public static boolean checkINputYN(){
        while(true){
            String result = in.nextLine().trim();
            
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }
            System.out.println("Please input Y/y or N/n");
        }
    }
}