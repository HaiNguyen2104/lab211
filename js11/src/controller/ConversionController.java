package controller;
import view.ConversionView;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Điều phối ứng dụng qua hàm performChangeBase và xử lý thuật toán đổi cơ số trực tiếp.
 * Ngày tạo file: 20/08/2026
 * Ngày cập nhật cuối: 20/08/2026
 */

public class ConversionController {

    private ConversionView view;

    public ConversionController() {
        this.view = new ConversionView();
    }

    /**
     * Chuyển lựa chọn Menu (1, 2, 3) sang cơ số thực tế (2, 10, 16).
     */
    private int getBaseValue(int choice) {
        switch (choice) {
            case 1:
                return 2;  // Binary
            case 2:
                return 10; // Decimal
            case 3:
                return 16; // Hexadecimal
            default:
                return 10;
        }
    }

    /**
     * BƯỚC 1: Đổi chuỗi cơ số bất kỳ sang Decimal bằng công thức tích lũy Horner.
     */
    private long toDecimal(String value, int fromBase) {
        long decimal = 0;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int digit;

            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else if (c >= 'A' && c <= 'F') {
                digit = c - 'A' + 10;
            } else {
                digit = c - 'a' + 10;
            }

            decimal = decimal * fromBase + digit;
        }

        return decimal;
    }

    /**
     * BƯỚC 2: Đổi từ Decimal sang cơ số đích bằng phép chia lấy dư.
     * Nối ký tự dư vào TRƯỚC chuỗi cũ để tự đảo ngược kết quả (Không dùng StringBuilder).
     */
    private String fromDecimal(long decimal, int toBase) {
        if (decimal == 0) {
            return "0";
        }

        String result = "";

        while (decimal > 0) {
            int remainder = (int) (decimal % toBase);
            char digitChar;

            if (remainder < 10) {
                digitChar = (char) ('0' + remainder);
            } else {
                digitChar = (char) ('A' + remainder - 10);
            }

            // Nối ký tự mới vào TRƯỚC result để kết quả không bị ngược
            result = digitChar + result;
            decimal /= toBase;
        }

        return result;
    }

    /**
     * Hàm tính toán chuyển đổi cơ số tổng quát.
     */
    private String convertBase(String value, int fromBase, int toBase) {
        long decimalValue = toDecimal(value, fromBase);
        return fromDecimal(decimalValue, toBase);
    }

    /**
     * Hàm xử lý trọn vẹn case 1: Lấy dữ liệu từ View -> Tính toán -> Gọi View hiển thị.
     */
    public void performChangeBase() {
        // 1. Controller gọi View tương tác nhận dữ liệu nhập từ bàn phím
        int inputChoice = view.getBaseInputChoice();
        int outputChoice = view.getBaseOutputChoice(inputChoice);
        String inputValue = view.getInputValue(inputChoice);

        // Quy đổi từ Lựa chọn (1, 2, 3) sang Cơ số thực tế (2, 10, 16)
        int fromBase = getBaseValue(inputChoice);
        int toBase = getBaseValue(outputChoice);

        // 2. Controller trực tiếp tính toán bằng các hàm nội bộ
        String result = convertBase(inputValue, fromBase, toBase);

        // 3. Controller gọi View để hiển thị kết quả ra màn hình
        view.displayResult(result);
    }

    /**
     * Hàm điều khiển chính duy trì vòng lặp thực thi chương trình.
     */
    public void run() {
            int mainChoice = view.displayMainMenu();

            if(mainChoice==2){
                System.exit(0);
            }
            while(true){
                performChangeBase();
                
                if(!view.askToContinue()){
                    break;
                }
            }
    }
}