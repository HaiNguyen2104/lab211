/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp điều khiển luồng sinh mảng, sắp xếp và tìm kiếm nhị phân.
 * Ngày tạo file: 04/11/2026
 * Ngày cập nhật cuối: 04/11/2026
 */

package controller;

import java.util.Arrays;
import java.util.Random;
import view.SearchView;

/**
 * Lớp SearchController điều phối View và thực hiện thuật toán tìm kiếm nhị phân.
 */
public class SearchController {

    private final SearchView view;
    private final Random random;

    public SearchController() {
        this.view = new SearchView();
        this.random = new Random();
    }

    /**
     * Thực thi luồng chương trình: nhập, sinh mảng, sắp xếp, tìm kiếm, hiển thị.
     */
    public void run() {
        // Function 1: nhập dữ liệu
        int size = view.inputArraySize();
        int searchValue = view.inputSearchValue();

        // Function 2: sinh mảng ngẫu nhiên, sắp xếp rồi tìm kiếm
        int[] array = generateArray(size);
        Arrays.sort(array);
        view.displaySortedArray(array);

        int index = binarySearch(array, searchValue);
        view.displayResult(searchValue, index);
    }

    /**
     * Sinh mảng các số nguyên ngẫu nhiên trong khoảng từ 0 đến size - 1.
     *
     * @param size Số phần tử của mảng
     * @return Mảng ngẫu nhiên chưa sắp xếp
     */
    private int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }
        return array;
    }

    /**
     * Tìm kiếm nhị phân (lặp) trên mảng đã sắp xếp tăng dần.
     *
     * @param array Mảng đã sắp xếp
     * @param value Giá trị cần tìm
     * @return Chỉ số của giá trị trong mảng, -1 nếu không tìm thấy
     */
    private int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
