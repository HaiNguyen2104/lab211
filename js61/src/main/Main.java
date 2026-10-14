/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Điểm khởi chạy ứng dụng (Entry Point).
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 22/08/2026
 */

package main;

import controller.ShapeController;

/**
 * Lớp Main chứa hàm main() để kích hoạt Controller.
 */
public class Main {

    /**
     * Hàm main đầu tiên được thực thi khi chạy chương trình Java.
     * 
     * @param args Tham số dòng lệnh truyền vào
     */
    public static void main(String[] args) {
        // Khởi tạo đối tượng Controller và gọi hàm run()
        ShapeController controller = new ShapeController();
        controller.run();
    }
}