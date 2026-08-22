/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.MatrixController;
/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Điểm khởi chạy chính (Entry Point) của toàn bộ ứng dụng Java.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 21/08/2026
 */

/**
 * Lớp Main chứa phương thức main() để bắt đầu thực thi chương trình.
 */
public class Main {

    /**
     * Hàm main là hàm đầu tiên được JVM gọi khi thực thi chương trình.
     * 
     * @param args Tham số truyền vào từ dòng lệnh
     */
    public static void main(String[] args) {
        // Khởi tạo một đối tượng Controller mới và trực tiếp kích hoạt hàm run()
        new MatrixController().run();
    }
}
