/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp tiện ích kiểm tra dữ liệu số thực và điều kiện tam giác.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package util;

import java.util.Scanner;

/**
 * Lớp Validation chịu trách nhiệm kiểm tra tính hợp lệ của dữ liệu nhập từ bàn phím.
 */
public class Validation {

    private final Scanner SCANNER = new Scanner(System.in);

    /**
     * Phương thức kiểm tra số thực nhập vào từ bàn phím bắt buộc phải lớn hơn 0.
     * 
     * @param msg Thông báo hướng dẫn người dùng nhập dữ liệu
     * @return Số thực hợp lệ lớn hơn 0
     */
    public double checkInputDouble(String msg) {
        // Vòng lặp while vô hạn bắt buộc người dùng nhập đúng định dạng
        while (true) {

            // In thông báo yêu cầu nhập ra màn hình
            System.out.println(msg);

            try {

                // Đọc chuỗi nhập vào và ép kiểu sang số thực double
                double result = Double.parseDouble(SCANNER.nextLine().trim());

                // Kiểm tra điều kiện giá trị phải lớn hơn 0
                if (result > 0) {
                    return result;
                }

                // In thông báo lỗi khi nhập giá trị nhỏ hơn hoặc bằng 0
                System.out.println("Value must be greater than 0!");
            } catch (NumberFormatException e) {

                // In thông báo lỗi khi nhập chuỗi không phải là số
                System.out.println("Value must be a valid number!");
            }
        }
    }

    /**
     * Phương thức kiểm tra 3 cạnh nhập vào có tạo thành một tam giác hợp lệ hay không.
     * 
     * @param a Độ dài cạnh A
     * @param b Độ dài cạnh B
     * @param c Độ dài cạnh C
     * @return true nếu thỏa mãn bất đẳng thức tam giác, ngược lại trả về false
     */
    public boolean isValidTriangle(double a, double b, double c) {
        // Kiểm tra điều kiện tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}