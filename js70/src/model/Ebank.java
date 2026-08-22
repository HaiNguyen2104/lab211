package model;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Quản lý ResourceBundle đa ngôn ngữ và tạo Captcha ngẫu nhiên.
 */

public class Ebank {

    private ResourceBundle bundle;

    /**
     * Function 1: Convert the languages (Đúng tên phương thức setLocate trong đề bài).
     */
    public void setLocate(Locale locale) {
        this.bundle = ResourceBundle.getBundle("resources.Language", locale);
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    /**
     * Function 4: Generate a random captcha code (5 ký tự).
     */
    public String generateCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder captcha = new StringBuilder(5);

        for (int i = 0; i < 5; i++) {
            captcha.append(chars.charAt(random.nextInt(chars.length())));
        }
        return captcha.toString();
    }
}