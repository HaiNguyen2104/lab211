package controller;

import java.util.Locale;
import model.Account;
import model.Ebank;
import view.EbankView;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Controller điều hướng chính theo đúng yêu cầu bài toán.
 */

public class EbankController {

    private EbankView view;
    private Ebank ebank;

    public EbankController() {
        this.view = new EbankView();
        this.ebank = new Ebank();
    }

    /**
     * Function 6: Login function.
     */
    public void performLogin() {
        // 1. Controller gọi View (View gọi Validation nhập Account)
        String accountNumber = view.inputAccount(ebank.getBundle());

        // 2. Controller gọi View (View gọi Validation nhập Password)
        String password = view.inputPassword(ebank.getBundle());

        // Khởi tạo Entity lưu giữ tài khoản vừa đăng nhập
        Account account = new Account(accountNumber, password);

        // 3. Controller gọi Ebank sinh Captcha và gọi View (View gọi Validation xác thực Captcha)
        String captchaGenerate = ebank.generateCaptcha();
        view.inputCaptcha(captchaGenerate, ebank.getBundle());
    }

    public void run() {
        while (true) {
            int choice = view.displayMainMenu();

            switch (choice) {
                case 1:
                    ebank.setLocate(new Locale("vi", "VN")); // Chuyển giao diện Tiếng Việt
                    performLogin();
                    break;
                case 2:
                    ebank.setLocate(new Locale("en", "US")); // Giữ/Chuyển giao diện Tiếng Anh
                    performLogin();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}