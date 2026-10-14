/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Điểm khởi chạy ứng dụng.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package main;

import controller.ShoppingController;

/**
 * Lớp Main chỉ khởi tạo Controller và gọi hàm run().
 */
public class Main {

    public static void main(String[] args) {
        ShoppingController controller = new ShoppingController();
        controller.run();
    }
}
