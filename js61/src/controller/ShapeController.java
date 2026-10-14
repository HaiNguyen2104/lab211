/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp điều phối luồng xử lý ứng dụng (kết nối View và Model).
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package controller;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;
import view.ShapeView;

/**
 * Lớp ShapeController quản lý logic điều phối luồng tính toán chu vi và diện tích.
 */
public class ShapeController {

    private final ShapeView view;

    /**
     * Constructor khởi tạo Controller và liên kết đối tượng View.
     */
    public ShapeController() {
        this.view = new ShapeView();
    }

    /**
     * Phương thức thực thi luồng chính của ứng dụng theo chuẩn luồng MVC.
     */
    public void run() {
        // 1. Controller gọi View hiển thị tiêu đề chương trình
        view.displayTitle();

        // 2. Controller gọi View để lấy thông số và khởi tạo Model Rectangle
        double[] rectangleSides = view.inputRectangleSides();
        Shape rectangle = new Rectangle(rectangleSides[0], rectangleSides[1]);

        // 3. Controller gọi View để lấy thông số và khởi tạo Model Circle
        double radius = view.inputRadius();
        Shape circle = new Circle(radius);

        // 4. Controller gọi View để lấy thông số và khởi tạo Model Triangle
        double[] triangleSides = view.inputTriangleSides();
        Shape triangle = new Triangle(triangleSides[0], triangleSides[1], triangleSides[2]);

        // 5. Controller gọi trực tiếp Model để hiển thị kết quả
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}