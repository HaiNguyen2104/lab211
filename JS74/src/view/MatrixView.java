/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import util.Validation;
/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp hiển thị giao diện console và nhận đầu vào từ người dùng.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 21/08/2026
 */

/**
 * Lớp MatrixView quản lý tất cả các hoạt động nhập/xút dữ liệu với người dùng.
 */
public class MatrixView {

    /**
     * Phương thức hiển thị Menu chính và nhận lựa chọn của người dùng.
     * 
     * @return Lựa chọn của người dùng (1 - 4)
     */
    public int displayMainMenu() {
        // In các dòng tùy chọn của chương trình ra giao diện console
        System.out.println("======= Calculator Program =======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
        // Gọi hàm bắt lỗi nhập số nguyên từ 1 đến 4
        return Validation.checkIntLimit(1, 4);
    }
    
    public int displayChoiceMenu(){
        // In các dòng tùy chọn của chương trình ra giao diện console
        System.out.println("======= Calculator Program =======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.print("Your choice: ");
        // Gọi hàm bắt lỗi nhập số nguyên từ 1 đến 4
        return Validation.checkIntLimit(1, 3);
    }

    /**
     * Phương thức nhận nhập số hàng của ma trận thứ 'num'.
     * 
     * @param num Số thứ tự của ma trận (1 hoặc 2)
     * @return Số hàng hợp lệ (> 0)
     */
    public int inputRow(int num) {
        System.out.print("Enter Row Matrix " + num + ": ");
        return Validation.checkIntMatrix(); // Gọi Validation kiểm tra số > 0
    }

    /**
     * Phương thức nhận nhập số cột của ma trận thứ 'num'.
     * 
     * @param num Số thứ tự của ma trận (1 hoặc 2)
     * @return Số cột hợp lệ (> 0)
     */
    public int inputCol(int num) {
        System.out.print("Enter Column Matrix " + num + ": ");
        return Validation.checkIntMatrix(); // Gọi Validation kiểm tra số > 0
    }

    /**
     * Phương thức dùng các vòng lặp để nhập giá trị cho từng phần tử của ma trận.
     * 
     * @param matrix Mảng 2 chiều khởi tạo sẵn kích thước
     * @param num Số thứ tự ma trận (1 hoặc 2)
     * @return Mảng 2 chiều đã được lấp đầy dữ liệu
     */
    public int[][] inputMatrixElements(int[][] matrix, int num) {
        // Vòng lặp duyệt qua từng hàng của ma trận
        for (int i = 0; i < matrix.length; i++) {
            // Vòng lặp duyệt qua từng cột trên hàng i
            for (int j = 0; j < matrix[0].length; j++) {
                // In vị trí phần tử đang nhập, ví dụ Matrix1[1][1]:
                System.out.print("Enter Matrix" + num + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                // Đọc và gán giá trị hợp lệ vào phần tử [i][j]
                matrix[i][j] = Validation.checkInputMatrix();
            }
        }
        return matrix; // Trả về ma trận đầy đủ dữ liệu
    }

    /**
     * Phương thức hiển thị ma trận ra màn hình theo định dạng [x].
     * 
     * @param matrix Ma trận mảng 2 chiều cần in
     */
    public void displayMatrix(int[][] matrix) {
        // Vòng lặp lặp qua từng hàng
        for (int i = 0; i < matrix.length; i++) {
            // Vòng lặp lặp qua từng cột
            for (int j = 0; j < matrix[0].length; j++) {
                // In giá trị phần tử đặt trong ngoặc vuông
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(); // Xuống dòng sau khi in hết 1 hàng
        }
    }

    /**
     * Phương thức hiển thị toàn bộ phép tính toán và kết quả ra màn hình.
     * 
     * @param m1 Ma trận 1
     * @param m2 Ma trận 2
     * @param result Ma trận kết quả
     * @param op Toán tử ('+', '-', '*')
     */
    public void displayResult(int[][] m1, int[][] m2, int[][] result, char op) {
        System.out.println("---------- Result ----------");
        displayMatrix(m1); // In ma trận thứ nhất
        System.out.println(op); // In ký tự phép toán (+, -, *)
        displayMatrix(m2); // In ma trận thứ hai
        System.out.println("=");
        displayMatrix(result); // In ma trận kết quả
        System.out.println("----------------------------\n");
    }

    /**
     * Phương thức in thông báo lỗi khi kích thước không hợp lệ.
     * 
     * @param msg Chuỗi thông báo lỗi
     */
    public void displayErrorMessage(String msg) {
        System.out.println("Error: " + msg); // In thông báo lỗi
    }
    
    public boolean askToContinue(){
        System.out.print("Ban co muon tiep tuc(y/n): ");
        return Validation.checkINputYN();
    }
}
