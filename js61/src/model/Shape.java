/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp trừu tượng định nghĩa các phương thức chung cho các hình học.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 22/08/2026
 */

package model;

/**
 * Lớp trừu tượng Shape đóng vai trò khuôn mẫu cho tất cả các đối tượng hình học.
 */
public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void printResult();
}