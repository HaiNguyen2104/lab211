/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp hiển thị giao diện và nhập xuất dữ liệu (gọi Validation).
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package view;

import util.Validation;

/**
 * Lớp ShapeView chịu trách nhiệm xuất/nhập thông số hình học từ màn hình.
 */
public class ShapeView {

    private final Validation validation;

    /**
     * Constructor khởi tạo View và liên kết đối tượng Validation.
     */
    public ShapeView() {
        this.validation = new Validation();
    }

    /**
     * In tiêu đề chương trình ra màn hình console.
     */
    public void displayTitle() {
        System.out.println("=====Calculator Shape Program=====");
    }

    /**
     * Nhận nhập chiều rộng và chiều dài hình chữ nhật bằng cách gọi Validation.
     * 
     * @return Mảng 2 phần tử chứa {width, length}
     */
    public double[] inputRectangleSides() {
        double width = validation.checkInputDouble("Please input side width of Rectangle: ");
        double length = validation.checkInputDouble("Please input length of Rectangle: ");
        return new double[]{width, length};
    }

    /**
     * Nhận nhập bán kính hình tròn từ người dùng bằng cách gọi Validation.
     * 
     * @return Bán kính hợp lệ
     */
    public double inputRadius() {
        return validation.checkInputDouble("Please input radius of Circle: ");
    }

    /**
     * Nhận nhập 3 cạnh của tam giác và kiểm tra tính hợp lệ bằng cách gọi Validation.
     * 
     * @return Mảng 3 phần tử chứa độ dài 3 cạnh (sideA, sideB, sideC)
     */
    public double[] inputTriangleSides() {
        // Vòng lặp yêu cầu nhập lại nếu 3 cạnh không tạo thành tam giác hợp lệ
        while (true) {

            // Gọi Validation lấy giá trị 3 cạnh
            double a = validation.checkInputDouble("Please input side A of Triangle: ");
            double b = validation.checkInputDouble("Please input side B of Triangle: ");
            double c = validation.checkInputDouble("Please input side C of Triangle: ");

            // Gọi Validation kiểm tra bất đẳng thức tam giác
            if (validation.isValidTriangle(a, b, c)) {
                return new double[]{a, b, c};
            }

            // In thông báo lỗi nếu 3 cạnh không hợp lệ
            System.out.println("Invalid triangle sides! The sum of any two sides must be greater than the third side.");
        }
    }
}
