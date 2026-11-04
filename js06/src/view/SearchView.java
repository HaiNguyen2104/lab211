/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp giao diện nhập dữ liệu và hiển thị kết quả tìm kiếm.
 * Ngày tạo file: 04/11/2026
 * Ngày cập nhật cuối: 04/11/2026
 */

package view;

import java.util.Arrays;
import util.Validation;

/**
 * Lớp SearchView chịu trách nhiệm nhập và xuất dữ liệu.
 */
public class SearchView {

    private final Validation validation;

    public SearchView() {
        this.validation = new Validation();
    }

    /**
     * Nhập số phần tử của mảng (ít nhất 1).
     */
    public int inputArraySize() {
        return validation.checkInputInt("Enter number of array:", 1);
    }

    /**
     * Nhập giá trị cần tìm (không âm).
     */
    public int inputSearchValue() {
        return validation.checkInputInt("Enter search value:", 0);
    }

    /**
     * Hiển thị mảng đã sắp xếp.
     *
     * @param array Mảng đã sắp xếp
     */
    public void displaySortedArray(int[] array) {
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    /**
     * Hiển thị vị trí tìm thấy, hoặc thông báo không tìm thấy.
     *
     * @param value Giá trị đã tìm
     * @param index Vị trí tìm thấy, -1 nếu không có trong mảng
     */
    public void displayResult(int value, int index) {
        if (index >= 0) {
            System.out.println("Found " + value + " at index: " + index);
        } else {
            System.out.println("Not found " + value + " in array");
        }
    }
}
