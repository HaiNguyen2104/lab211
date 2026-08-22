/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Tính toán và hiển thị 45 số Fibonacci bằng phương thức đệ quy không dùng mảng.
 * Ngày tạo file: 13/08/2026
 * Ngày cập nhật cuối: 17/08/2026
 */

import java.math.BigInteger;

/**
 * Class Fibonacci chứa phương thức đệ quy tính số Fibonacci thứ n và hiển thị kết quả ra màn hình.
 */
public class Fibonacci {

    /**
     * Đây là hàm main thực thi chương trình chính, dùng vòng lặp for duyệt 45 phần tử để hiển thị kết quả.
     * 
     * @param args Tham số dòng lệnh truyền vào từ bàn phím
     */
    public static void main(String[] args) {
        // Khai báo hằng số 45 phần tử cần tính và hiển thị theo yêu cầu đề bài
        int count = 45;

        // In dòng thông báo tiêu đề danh sách dãy số Fibonacci
        System.out.println("The 45 sequence Fibonacci:");

        // Vòng lặp for chạy từ 0 đến 44 để gọi hàm tính toán và hiển thị trực tiếp ra màn hình
        for (int i = 0; i < count; i++) {

            // Gọi hàm calculateFibonacciRecursive để tính số Fibonacci thứ i bằng đệ quy
            BigInteger fiboNum = calculateFibonacci(i);

            // Gọi hàm System.out.print để xuất giá trị ra màn hình kèm dấu phẩy định dạng
            System.out.print(fiboNum+ (i < count - 1 ? ", " : "\n"));
        }
    }

    /**
     * Đây là hàm đệ quy tính và trả về giá trị Fibonacci tại vị trí n truyền vào.
     * 
     * @param n Vị trí phần tử Fibonacci cần tính
     * @return Giá trị Fibonacci kiểu BigInteger tại vị trí n
     */
    public static BigInteger calculateFibonacci(int n) {
        // Kiểm tra điều kiện cơ sở đệ quy khi n = 0
        if (n == 0) {
            // Trả về hằng số 0 của lớp BigInteger
            return BigInteger.ZERO;
        }

        // Kiểm tra điều kiện cơ sở đệ quy khi n = 1
        if (n == 1) {
            // Trả về hằng số 1 của lớp BigInteger
            return BigInteger.ONE;
        }

        // Gọi hàm đệ quy hai lần cho (n - 1) và (n - 2) rồi thực hiện phương thức .add() để cộng hai giá trị lại
        return calculateFibonacci(n - 1).add(calculateFibonacci(n - 2));
    }
}