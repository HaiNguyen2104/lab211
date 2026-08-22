/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Xử lý bắt lỗi nhập liệu dùng try-catch cho View.
 * Ngày tạo file: 20/08/2026
 * Ngày cập nhật cuối: 20/08/2026
 */

import java.util.Scanner;

public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Kiểm tra số nguyên nhập vào thuộc khoảng [min, max].
     */
    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Your choice: ");
            }
        }
    }

    /**
     * Nhập Output Base dùng try-catch.
     * Tự động ẩn cơ số đã chọn ở bước Input Base.
     * Nếu nhập sai hoặc chọn trùng, âm thầm hiển thị lại prompt.
     */
    public static int checkOutputBase(int inputBaseChoice) {
        String prompt = "Choose the base number out (";
        
        if (inputBaseChoice == 1) {
            prompt += "2 is decimal, 3 is hexadecimal): ";
        } else if (inputBaseChoice == 2) {
            prompt += "1 is binary, 3 is hexadecimal): ";
        } else if (inputBaseChoice == 3) {
            prompt += "1 is binary, 2 is decimal): ";
        }

        while (true) {
            System.out.print(prompt);
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result == inputBaseChoice || result < 1 || result > 3) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                // Để trống: Tự động in lại câu prompt ở lượt lặp tiếp theo
            }
        }
    }

    /**
     * Kiểm tra giá trị chuỗi nhập vào có khớp với định dạng cơ số đã chọn không.
     */
    public static String checkInputValue(int baseChoice) {
        while (true) {
            System.out.print("Enter the input value: ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input value cannot be empty!");
                continue;
            }

            if (baseChoice == 1 && input.matches("^[0-1]+$")) {
                return input;
            } else if (baseChoice == 2 && input.matches("^[0-9]+$")) {
                return input;
            } else if (baseChoice == 3 && input.matches("^[0-9a-fA-F]+$")) {
                return input.toUpperCase();
            } else {
                System.out.println("Invalid input value for chosen base system! Please re-enter.");
            }
        }
    }
    
    public static boolean checkINputYN(){
        while(true){
            String result = scanner.nextLine().trim();
            
            if(result.equalsIgnoreCase("Y")){
                return true;
            }else if(result.equalsIgnoreCase("N")){
                return false;
            }
            System.out.println("Please input Y/y or N/n");
        }
    }
}
