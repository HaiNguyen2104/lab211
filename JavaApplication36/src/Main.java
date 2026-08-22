/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Chứa hàm main khởi tạo danh sách sinh viên và gọi hàm displayRank để kiểm thử.
 * Ngày tạo file: 12/08/2026
 * Ngày cập nhật cuối: 12/08/2026
 */

/**
 * Class Main chứa luồng thực thi chính của chương trình.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Khởi tạo danh sách sinh viên với các mức GPA khác nhau
        Student st1 = new Student("SV01", "Nguyen Van A", 20, 9.5);
        Student st2 = new Student("SV02", "Tran Thi B", 21, 6.5);
        Student st3 = new Student("SV03", "Le Van C", 19, 4.0);

        //Hiển thị thông tin sinh viên
        System.out.println(st1.toString());
        //HIển thị xếp hạng của sinh viên
        st1.displayRank();

        System.out.println(); 

        //Hiển thị thông tin sinh viên
        System.out.println(st2.toString());
        //HIển thị xếp hạng của sinh viên
        st2.displayRank();

        System.out.println(); 

        //Hiển thị thông tin sinh viên
        System.out.println(st3.toString());
        //HIển thị xếp hạng của sinh viên
        st3.displayRank();
    }
}
    
