/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Khai báo các thuộc tính, phương thức khởi tạo, truy xuất dữ liệu và hiển thị thông tin kèm xếp loại sinh viên.
 * Ngày tạo file: 12/08/2026
 * Ngày cập nhật cuối: 12/08/2026
 */

/**
 * Class Student đại diện cho đối tượng sinh viên.
 */
public class Student {

    private String studentID;
    private String studentName;
    private int age;
    private double gpa;

    /**
     * Hàm tạo đối tượng Student không có các tham số truyền vào
     */
    public Student() {
    }

    /**
     * Hàm tạo đối tượng Student có đầy đủ các tham số truyền vào.
     *
     * @param studentId Mã sinh viên
     * @param studentName Tên sinh viên
     * @param age Tuổi của sinh viên
     * @param gpa Điểm trung bình (GPA)
     */
    public Student(String studentID, String studentName, int age, double gpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Hàm hiển thị xếp hạng sinh viên theo quy tắc
    public void displayRank() {
        //Kiểm tra xem gpa của học sinh lớn hơn hoặc bằng 9
        if (this.gpa >= 9.0) {
            //Hiện thông báo phù hợp với điều kiện
            System.out.println("Thong bao: Ban qua mon va dat yeu cau khen thuong");
            //Kiểm tra gpa lớn hơn hoặc bằng 5
        } else if (this.gpa >= 5.0) {
            //Hiện thông báo phù hợp với điều kiện
            
            System.out.println("Thong bao: Dat yeu cau qua mon ");
        } else {
            //Hiện thông báo phù hợp với điều kiện
            System.out.println("Thong bao: Khong dat yeu cau");
        }
    }
    //Override ghi chồng phương thức toString định dạng chuỗi trả về
    @Override
    public String toString() {
        //Tạo chuổi hiển thị thông tin sinh viên
        String info = "Student [ID=" + studentID + ", Name=" + studentName + ", Age=" + age + ", GPA=" + gpa + "]";
        
        return info;
    }
}
