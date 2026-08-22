package main;

import controller.EbankController;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Hàm khởi chạy ứng dụng.
 */

public class Main {

    public static void main(String[] args) {
        EbankController controller = new EbankController();
        controller.run();
    }
}