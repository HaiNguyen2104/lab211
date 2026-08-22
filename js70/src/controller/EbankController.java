package controller;

import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import model.Account;
import view.EbankView;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp điều khiển chính, kết nối View và Model, xử lý nghiệp vụ.
 */
public class EbankController {

    // Khai báo đối tượng View để gọi màn hình hiển thị
    private EbankView view;

    // Khai báo biến lưu trữ bộ ngôn ngữ được lựa chọn
    private ResourceBundle bundle;

    // Constructor khởi tạo Controller
    public EbankController() {
        // Khởi tạo đối tượng EbankView
        this.view = new EbankView();
    }

    /*
     * Phương thức thiết lập ngôn ngữ hiển thị (Function 1)
     * @param locale: Đối tượng Locale đại diện cho quốc gia/ngôn ngữ
     */
    public void setLocate(Locale locale) {
        // Nạp file .properties tương ứng trong package resources dựa theo locale truyền vào
        this.bundle = ResourceBundle.getBundle("resource.Language", locale);
    }

    /*
     * Phương thức sinh ngẫu nhiên chuỗi Captcha 5 ký tự (Function 4)
     * @return: Chuỗi Captcha ngẫu nhiên gồm 5 ký tự
     */
    public String generateCaptcha() {
        // Khởi tạo chuỗi rỗng chứa tất cả ký tự cho phép
        String chars = "";

        // Vòng lặp 1: Tự động ghép các ký tự số từ '0' đến '9'
        for (char c = '0'; c <= '9'; c++) {
            chars += c;
        }

        // Vòng lặp 2: Tự động ghép các ký tự chữ cái in hoa từ 'A' đến 'Z'
        for (char c = 'A'; c <= 'Z'; c++) {
            chars += c;
        }

        // Vòng lặp 3: Tự động ghép các ký tự chữ cái in thường từ 'a' đến 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            chars += c;
        }

        // Khởi tạo đối tượng Random để sinh số ngẫu nhiên
        Random random = new Random();

        // Khởi tạo chuỗi rỗng để chứa kết quả Captcha
        String captcha = "";

        // Vòng lặp 5 lần để chọn ngẫu nhiên 5 ký tự ghép thành Captcha
        for (int i = 0; i < 5; i++) {
            // Lấy ngẫu nhiên 1 chỉ số (index) trong khoảng độ dài của chuỗi chars
            int index = random.nextInt(chars.length());

            // Trích xuất ký tự tại chỉ số index ngẫu nhiên và cộng trực tiếp vào chuỗi captcha
            captcha += chars.charAt(index);
        }

        // Trả về chuỗi Captcha hoàn chỉnh 5 ký tự
        return captcha;
    }

    /*
     * Phương thức thực hiện luồng Đăng nhập (Function 6)
     */
    public void performLogin() {
        // 1. Gọi View thực hiện nhập Số tài khoản
        String accountNumber = view.inputAccount(bundle);

        // 2. Gọi View thực hiện nhập Mật khẩu
        String password = view.inputPassword(bundle);

        // Khởi tạo đối tượng Model Account để lưu trữ dữ liệu người dùng đăng nhập thành công
        Account userAccount = new Account(accountNumber, password);

        // 3. Controller gọi hàm nghiệp vụ sinh mã Captcha ngẫu nhiên
        String captchaGenerate = generateCaptcha();

        // 4. Truyền mã Captcha sinh được sang View để người dùng nhập xác nhận
        view.inputCaptcha(captchaGenerate, bundle);
    }

    /*
     * Phương thức khởi chạy luồng chính của ứng dụng
     */
    public void run() {
        // Vòng lặp ứng dụng liên tục cho đến khi người dùng chọn Option 3 (Exit)
        while (true) {
            // Hiển thị menu và nhận lựa chọn từ người dùng
            int choice = view.displayMainMenu();

            // Cấu trúc rẽ nhánh dựa theo lựa chọn menu
            switch (choice) {
                case 1:
                    // Đặt ngôn ngữ là Tiếng Việt
                    setLocate(new Locale("vi", "VN"));
                    // Thực hiện luồng đăng nhập
                    performLogin();
                    break;
                case 2:
                    // Đặt ngôn ngữ là Tiếng Anh
                    setLocate(new Locale("en", "US"));
                    // Thực hiện luồng đăng nhập
                    performLogin();
                    break;
                case 3:
                    // Dừng chương trình hoàn toàn
                    System.exit(0);
                    break;
            }
        }
    }
}
