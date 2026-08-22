/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ConversionController;
/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Khởi tạo và kích hoạt Controller.
 * Ngày tạo file: 20/08/2026
 * Ngày cập nhật cuối: 20/08/2026
 */

public class Main {

    public static void main(String[] args) {
        // Main chỉ việc khởi tạo Controller và gọi hàm run để bắt đầu chương trình
        ConversionController controller = new ConversionController();
        controller.run();
    }
}
