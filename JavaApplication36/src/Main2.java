/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * @author Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Chứa hàm main cho phép nhập liên tục nhiều sinh viên và hiển thị kết quả của tất cả sau khi kết thúc.
 * Ngày tạo file: 12/08/2026
 * Ngày cập nhật cuối: 12/08/2026
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class Main chứa luồng thực thi chính của chương trình console.
 */
public class Main2 {

    /**
     * Đây là hàm main chạy chính dùng để lặp nhập dữ liệu danh sách sinh viên và hiển thị kết quả tổng hợp.
     * 
     * @param args Tham số dòng lệnh
     */
    public static void main(String[] args) {
        // Gọi hàm khởi tạo Scanner từ thư viện Java để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo danh sách ArrayList từ thư viện Java để lưu trữ nhiều đối tượng sinh viên
        List<Student> studentList = new ArrayList<>();

        // Khai báo biến lựa chọn tiếp tục của người dùng
        String choice = "";

        // Vòng lặp do-while cho phép người dùng nhập liên tục nhiều sinh viên
        do {
            System.out.println("\n--- NHAP THONG TIN SINH VIEN THU " + (studentList.size() + 1) + " ---");

            // Khối lệnh nhập Mã sinh viên
            System.out.print("Nhap ma sinh vien: ");
            String id = scanner.nextLine();

            // Khối lệnh nhập Tên sinh viên
            System.out.print("Nhap ten sinh vien: ");
            String name = scanner.nextLine();

            // Khối lệnh nhập Tuổi và ép kiểu sang số nguyên
            System.out.print("Nhap tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());

            // Khối lệnh nhập GPA và ép kiểu sang số thực
            System.out.print("Nhap diem GPA: ");
            double gpa = Double.parseDouble(scanner.nextLine());

            // Khởi tạo đối tượng Student mới từ dữ liệu vừa nhập
            Student st = new Student(id, name, age, gpa);

            // Gọi hàm add từ danh sách ArrayList để lưu đối tượng sinh viên vào danh sách
            studentList.add(st);

            // Hỏi người dùng có muốn tiếp tục hay không
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            choice = scanner.nextLine().trim();

        } while (choice.equalsIgnoreCase("Y")); // Điều kiện lặp: nếu chọn 'Y' hoặc 'y' thì nhập tiếp

        // Khối lệnh hiển thị danh sách tất cả các sinh viên đã nhập
        System.out.println("\n================ KET QUA TAT CA SINH VIEN ================");

        // Vòng lặp for-each duyệt qua từng đối tượng sinh viên trong danh sách ArrayList
        for (Student st : studentList) {
            // Gọi hàm displayRank của từng sinh viên để in thông tin và xếp loại ra màn hình
            st.displayRank();
            System.out.println("---------------------------------------------------------");
        }
    }
}
