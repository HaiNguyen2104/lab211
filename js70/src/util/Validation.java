package util;

import java.util.ResourceBundle;
import java.util.Scanner;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Chứa tất cả các hàm validate dữ liệu chuẩn đề bài J1.S.P0070.
 */

public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static int checkIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(scanner.nextLine().trim());
                if (result >= min && result <= max) {
                    return result;
                }
            } catch (NumberFormatException e) {
                // Bỏ qua lỗi để tiếp tục bắt nhập lại
            }
            System.out.print("Please choice one option: ");
        }
    }

    public static String inputString() {
        return scanner.nextLine().trim();
    }

    /**
     * Function 2: Checking account number (10 chữ số).
     */
    public static String checkAccountNumber(String accountNumber, ResourceBundle bundle) {
        if (accountNumber.matches("^[0-9]{10}$")) {
            return ""; // Rỗng là hợp lệ
        }
        return bundle.getString("errAccountNumber");
    }

    /**
     * Function 3: Check password (8-31 ký tự, phải gồm cả chữ và số).
     */
    public static String checkPassword(String password, ResourceBundle bundle) {
        if (password.length() < 8 || password.length() > 31) {
            return bundle.getString("errPassword");
        }

        boolean hasLetter = password.matches(".*[a-zA-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean isAlphanumeric = password.matches("^[a-zA-Z0-9]+$");

        if (hasLetter && hasDigit && isAlphanumeric) {
            return ""; // Rỗng là hợp lệ
        }
        return bundle.getString("errPassword");
    }

    /**
     * Function 5: Check captcha code (Kiểm tra ký tự nhập vào có thuộc chuỗi captcha sinh ra không).
     */
    public static String checkCaptcha(String captchaInput, String captchaGenerate, ResourceBundle bundle) {
        if (!captchaInput.isEmpty() && captchaGenerate.contains(captchaInput)) {
            return ""; // Rỗng là hợp lệ
        }
        return bundle.getString("errCaptchaIncorrect");
    }
}