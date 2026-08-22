/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import util.Validation;
/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Chịu trách nhiệm hiển thị Menu, câu prompt và gọi Validation nhập liệu.
 * Ngày tạo file: 20/08/2026
 * Ngày cập nhật cuối: 20/08/2026
 */

public class ConversionView {

    /**
     * In Menu chính và lấy lựa chọn của người dùng.
     */
    public int displayMainMenu() {
        System.out.println("======= Change Base Number System Program =======");
        System.out.println("1. Convert Base System");
        System.out.println("2. Exit");
        System.out.print("Your choice: ");
        return Validation.checkIntLimit(1, 2);
    }

    /**
     * Lấy lựa chọn Input Base từ người dùng.
     */
    public int getBaseInputChoice() {
        System.out.println("\n--- Base Number Conversion ---");
        System.out.print("Choose the base number input (1 is binary, 2 is decimal, 3 is hexadecimal): ");
        return Validation.checkIntLimit(1, 3);
    }

    /**
     * Lấy lựa chọn Output Base (tự động ẩn tùy chọn trùng).
     */
    public int getBaseOutputChoice(int inputBaseChoice) {
        return Validation.checkOutputBase(inputBaseChoice);
    }

    /**
     * Lấy giá trị chuỗi cần chuyển đổi.
     */
    public String getInputValue(int inputBaseChoice) {
        return Validation.checkInputValue(inputBaseChoice);
    }

    /**
     * In kết quả chuyển đổi ra Console.
     */
    public void displayResult(String result) {
        System.out.println("Output value: " + result);
        System.out.println("-------------------------------\n");
    }
    
    public boolean askToContinue(){
        System.out.print("Do you want to continue(y/n): ");
        return Validation.checkINputYN();
    }
}
