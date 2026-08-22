package util;

import java.util.ResourceBundle;
import java.util.Scanner;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp tiện ích kiểm tra (validate) tính hợp lệ của dữ liệu đầu vào.
 */
public class Validation {

    // Khởi tạo đối tượng Scanner static để đọc dữ liệu từ bàn phím dùng chung cho cả class
    private static final Scanner scanner = new Scanner(System.in);

    /*
     * Phương thức kiểm tra lựa chọn số nguyên trong phạm vi [min, max]
     * @param min: Giá trị nhỏ nhất cho phép
     * @param max: Giá trị lớn nhất cho phép
     * @return: Lựa chọn số nguyên hợp lệ
     */
    public static int checkIntLimit(int min, int max) {
        // Vòng lặp vô hạn, bắt buộc người dùng nhập đúng mới dừng
        while (true) {
            try {
                // Đọc dòng nhập vào, cắt bỏ khoảng trắng hai đầu (.trim()) và ép kiểu sang số nguyên
                int result = Integer.parseInt(scanner.nextLine().trim());

                // Kiểm tra xem số vừa nhập có nằm trong khoảng [min, max] không
                if (result >= min && result <= max) {
                    return result; // Trả về kết quả và thoát khỏi phương thức ngay lập tức
                }
            } catch (NumberFormatException e) {
                // Bắt ngoại lệ nếu người dùng nhập chữ/ký tự không phải số nguyên
                // Bỏ trống để chương trình tiếp tục thực thi câu lệnh in thông báo bên dưới
            }
            // In thông báo yêu cầu người dùng nhập lại nếu dữ liệu không hợp lệ
            System.out.print("Please choice one option: ");
        }
    }

    /*
     * Phương thức đọc chuỗi ký tự từ bàn phím
     * @return: Chuỗi ký tự đã được loại bỏ khoảng trắng 2 đầu
     */
    public static String inputString() {
        return scanner.nextLine().trim(); // Đọc nguyên dòng dữ liệu và cắt khoảng trắng thừa
    }

    /*
     * Phương thức kiểm tra định dạng Số tài khoản
     * @param accountNumber: Chuỗi số tài khoản do người dùng nhập
     * @param bundle: Gói tài nguyên ngôn ngữ
     * @return: Chuỗi rỗng "" nếu hợp lệ, hoặc chuỗi thông báo lỗi theo ngôn ngữ
     */
    public static String checkAccountNumber(String accountNumber, ResourceBundle bundle) {
        // Regex: ^[0-9]{10}$ nghĩa là từ đầu đến cuối chuỗi phải là đúng 10 chữ số (0-9)
        if (accountNumber.matches("^[0-9]{10}$")) {
            return ""; // Trả về chuỗi rỗng quy ước là HỢP LỆ
        }
        // Nếu không khớp Regex, lấy câu báo lỗi từ file .properties tương ứng
        return bundle.getString("errAccountNumber");
    }

    /*
     * Phương thức kiểm tra định dạng Mật khẩu
     * @param password: Chuỗi mật khẩu do người dùng nhập
     * @param bundle: Gói tài nguyên ngôn ngữ
     * @return: Chuỗi rỗng "" nếu hợp lệ, hoặc chuỗi thông báo lỗi theo ngôn ngữ
     */
    public static String checkPassword(String password, ResourceBundle bundle) {
        // Kiểm tra điều kiện độ dài: Mật khẩu phải có từ 8 đến 31 ký tự
        if (password.length() < 8 || password.length() > 31) {
            return bundle.getString("errPassword"); // Trả về lỗi nếu vượt quá phạm vi độ dài
        }

        // Kiểm tra xem mật khẩu có chứa ít nhất một chữ cái (hoa hoặc thường) không
        boolean hasLetter = password.matches(".*[a-zA-Z].*");

        // Kiểm tra xem mật khẩu có chứa ít nhất một chữ số không
        boolean hasDigit = password.matches(".*[0-9].*");

        // Kiểm tra xem toàn bộ mật khẩu chỉ gồm chữ và số (không chứa ký tự đặc biệt/khoảng trắng)
        boolean isAlphanumeric = password.matches("^[a-zA-Z0-9]+$");

        // Nếu thỏa mãn đồng thời cả 3 điều kiện
        if (hasLetter && hasDigit && isAlphanumeric) {
            return ""; // Trả về chuỗi rỗng quy ước là HỢP LỆ
        }

        // Trả về thông báo lỗi nếu không thỏa mãn các điều kiện quy chuẩn
        return bundle.getString("errPassword");
    }

    /*
     * Phương thức kiểm tra Captcha người dùng nhập
     * @param captchaInput: Chuỗi do người dùng nhập vào
     * @param captchaGenerate: Chuỗi Captcha hệ thống tự sinh ra trước đó
     * @param bundle: Gói tài nguyên ngôn ngữ
     * @return: Chuỗi rỗng "" nếu hợp lệ, hoặc chuỗi thông báo lỗi theo ngôn ngữ
     */
    public static String checkCaptcha(String captchaInput, String captchaGenerate, ResourceBundle bundle) {
        // Kiểm tra: Người dùng không để trống VÀ chuỗi nhập vào xuất hiện trong Captcha gốc
        if (!captchaInput.isEmpty() && captchaGenerate.contains(captchaInput)) {
            return ""; // Trả về chuỗi rỗng quy ước là HỢP LỆ
        }
        // Trả về thông báo lỗi nếu nhập sai
        return bundle.getString("errCaptchaIncorrect");
    }
}
