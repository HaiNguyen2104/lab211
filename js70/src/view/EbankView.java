package view;

import java.util.ResourceBundle;
import util.Validation;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp hiển thị giao diện console và nhận dữ liệu nhập từ người dùng.
 */
public class EbankView {

    /*
     * Phương thức hiển thị Menu chính
     * @return: Số nguyên lựa chọn của người dùng (1, 2 hoặc 3)
     */
    public int displayMainMenu() {
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");

        // Gọi phương thức validate số nguyên từ 1 đến 3 và trả về kết quả
        return Validation.checkIntLimit(1, 3);
    }

    /*
     * Phương thức nhận Số tài khoản từ màn hình
     * @param bundle: Gói tài nguyên ngôn ngữ hiện tại
     * @return: Chuỗi Số tài khoản hợp lệ
     */
    public String inputAccount(ResourceBundle bundle) {
        // Vòng lặp yêu cầu người dùng nhập cho đến khi dữ liệu hợp lệ
        while (true) {
            // In ra nhãn thông báo nhập số tài khoản theo ngôn ngữ
            System.out.print(bundle.getString("labelAccount"));

            // Gọi hàm đọc chuỗi dữ liệu nhập
            String input = Validation.inputString();

            // Lấy thông báo lỗi (nếu có) từ phương thức validate
            String error = Validation.checkAccountNumber(input, bundle);

            // Nếu không có lỗi (error là chuỗi rỗng)
            if (error.isEmpty()) {
                return input; // Trả về số tài khoản hợp lệ và dừng vòng lặp
            }

            // In câu thông báo lỗi ra màn hình để người dùng biết và nhập lại
            System.out.println(error);
        }
    }

    /*
     * Phương thức nhận Mật khẩu từ màn hình
     * @param bundle: Gói tài nguyên ngôn ngữ hiện tại
     * @return: Chuỗi Mật khẩu hợp lệ
     */
    public String inputPassword(ResourceBundle bundle) {
        // Vòng lặp yêu cầu người dùng nhập lại nếu nhập sai
        while (true) {
            // In ra nhãn thông báo nhập mật khẩu theo ngôn ngữ
            System.out.print(bundle.getString("labelPassword"));

            // Đọc chuỗi ký tự mật khẩu nhập từ bàn phím
            String input = Validation.inputString();

            // Kiểm tra mật khẩu có hợp lệ không
            String error = Validation.checkPassword(input, bundle);

            // Nếu mật khẩu hợp lệ (error rỗng)
            if (error.isEmpty()) {
                return input; // Trả về mật khẩu hợp lệ
            }

            // In thông báo lỗi ra màn hình
            System.out.println(error);
        }
    }

    /*
     * Phương thức hiển thị và xác nhận Captcha
     * @param captchaGenerate: Chuỗi Captcha hệ thống vừa tạo
     * @param bundle: Gói tài nguyên ngôn ngữ hiện tại
     */
    public void inputCaptcha(String captchaGenerate, ResourceBundle bundle) {
        // Hiển thị mã Captcha gốc ra màn hình
        System.out.println(bundle.getString("labelCaptcha") + captchaGenerate);

        // Vòng lặp bắt buộc nhập đúng ký tự Captcha mới được đi tiếp
        while (true) {
            // In ra nhãn yêu cầu nhập ký tự Captcha
            System.out.print(bundle.getString("labelEnterCaptcha"));

            // Đọc ký tự Captcha người dùng nhập
            String input = Validation.inputString();

            // Kiểm tra tính hợp lệ của Captcha
            String error = Validation.checkCaptcha(input, captchaGenerate, bundle);

            // Nếu nhập đúng Captcha (error rỗng)
            if (error.isEmpty()) {
                break; // Thoát khỏi vòng lặp kiểm tra
            }

            // In ra thông báo nhập Captcha sai
            System.out.println(error);
        }
    }
}
