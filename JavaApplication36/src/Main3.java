/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Chứa hàm main nhận thông tin sinh viên nhập từ bàn phím và gọi hàm hiển thị xếp loại.
 * Ngày tạo file: 12/08/2026
 * Ngày cập nhật cuối: 12/08/2026
 */

import java.util.Scanner;

/**
 * Class Main chứa luồng thực thi chính của chương trình.
 */
public class Main3 {

    /**
     * Đây là hàm main chạy chính dùng để lặp nhập dữ liệu sinh viên và hiển thị kết quả tổng hợp.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        // Gọi hàm khởi tạo Scanner từ thư viện Java (System.in) để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khối lệnh nhập Mã sinh viên từ bàn phím
        System.out.print("Nhap ma sinh vien: ");
        String id = scanner.nextLine();

        // Khối lệnh nhập Tên sinh viên từ bàn phím
        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();

        // Khối lệnh nhập Tuổi từ bàn phím và ép kiểu sang số nguyên
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());

        // Khối lệnh nhập Điểm GPA từ bàn phím và ép kiểu sang số thực
        System.out.print("Nhap diem GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        // Khởi tạo đối tượng Student từ các thông tin vừa nhập từ bàn phím
        Student st = new Student(id, name, age, gpa);

        System.out.println("\n--- KET QUA ---");

        // Khối lệnh gọi hàm displayRank từ đối tượng st để in thông tin và xếp loại ra màn hình console
        st.displayRank();
    }
    
}
