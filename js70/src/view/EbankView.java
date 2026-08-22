package view;

import java.util.ResourceBundle;
import util.Validation;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Quản lý hiển thị màn hình và gọi Validation kiểm tra đầu vào.
 */

public class EbankView {

    public int displayMainMenu() {
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        return Validation.checkIntLimit(1, 3);
    }

    public String inputAccount(ResourceBundle bundle) {
        while (true) {
            System.out.print(bundle.getString("labelAccount"));
            String input = Validation.inputString();
            String error = Validation.checkAccountNumber(input, bundle);

            if (error.isEmpty()) {
                return input;
            }
            System.out.println(error);
        }
    }

    public String inputPassword(ResourceBundle bundle) {
        while (true) {
            System.out.print(bundle.getString("labelPassword"));
            String input = Validation.inputString();
            String error = Validation.checkPassword(input, bundle);

            if (error.isEmpty()) {
                return input;
            }
            System.out.println(error);
        }
    }

    public void inputCaptcha(String captchaGenerate, ResourceBundle bundle) {
        System.out.println(bundle.getString("labelCaptcha") + captchaGenerate);

        while (true) {
            System.out.print(bundle.getString("labelEnterCaptcha"));
            String input = Validation.inputString();
            String error = Validation.checkCaptcha(input, captchaGenerate, bundle);

            if (error.isEmpty()) {
                break;
            }
            System.out.println(error);
        }
    }
}