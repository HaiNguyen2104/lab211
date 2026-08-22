package main;

import controller.EbankController;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Điểm khởi chạy chương trình (Entry point).
 */

public class Main {

    /*
     * Phương thức main mặc định để chạy ứng dụng Java
     */
    public static void main(String[] args) {
        // Khởi tạo đối tượng điều hướng EbankController
        EbankController controller = new EbankController();
        
        // Gọi phương thức run() để bắt đầu vòng lặp ứng dụng
        controller.run();
    }
}