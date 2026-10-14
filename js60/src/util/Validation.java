/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp kiểm tra dữ liệu đầu vào.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package util;

import java.util.Scanner;

/**
 * Lớp Validation chịu trách nhiệm kiểm tra tính hợp lệ của dữ liệu nhập từ bàn phím.
 */
public class Validation {

    private final Scanner in = new Scanner(System.in);

    /**
     * Nhập số nguyên và kiểm tra phải lớn hơn hoặc bằng giá trị tối thiểu.
     *
     * @param msg Thông báo yêu cầu nhập
     * @param min Giá trị nhỏ nhất được chấp nhận
     * @return Số nguyên hợp lệ
     */
    public int checkInputInt(String msg, int min) {
        while (true) {
            System.out.print(msg);
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result >= min) {
                    return result;
                }
                System.out.println("Value must be greater than or equal to " + min + "!");
            } catch (NumberFormatException e) {
                System.out.println("Value must be a valid integer!");
            }
        }
    }
}
