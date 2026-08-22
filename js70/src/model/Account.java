package model;

/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Model đại diện cho đối tượng Tài khoản (Entity thuần túy).
 */

public class Account {

    // Thuộc tính lưu trữ số tài khoản
    private String accountNumber;
    
    // Thuộc tính lưu trữ mật khẩu
    private String password;

    // Constructor không tham số (Dùng khi khởi tạo đối tượng rỗng)
    public Account() {
    }

    // Constructor có tham số (Dùng để gán giá trị ngay khi tạo đối tượng)
    public Account(String accountNumber, String password) {
        this.accountNumber = accountNumber; // Gán giá trị tham số truyền vào cho thuộc tính lớp
        this.password = password;           // Gán giá trị tham số truyền vào cho thuộc tính lớp
    }

    // Phương thức Getter để lấy giá trị accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Phương thức Setter để cập nhật giá trị accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Phương thức Getter để lấy giá trị password
    public String getPassword() {
        return password;
    }

    // Phương thức Setter để cập nhật giá trị password
    public void setPassword(String password) {
        this.password = password;
    }
}