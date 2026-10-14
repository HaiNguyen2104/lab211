/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp giao diện nhập dữ liệu và hiển thị kết quả.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package view;

import util.Validation;

/**
 * Lớp ShoppingView chịu trách nhiệm nhập và xuất dữ liệu, không phụ thuộc Model.
 */
public class ShoppingView {

    private final Validation validation;

    public ShoppingView() {
        this.validation = new Validation();
    }

    public void displayTitle() {
        System.out.println("======= Shopping program ==========");
    }

    /**
     * Nhập số lượng hóa đơn (ít nhất 1).
     */
    public int inputNumberOfBills() {
        return validation.checkInputInt("input number of bill:", 1);
    }

    /**
     * Nhập giá trị từng hóa đơn (phải lớn hơn 0).
     *
     * @param number Số lượng hóa đơn
     * @return Mảng giá trị các hóa đơn
     */
    public int[] inputBills(int number) {
        int[] bills = new int[number];
        for (int i = 0; i < number; i++) {
            bills[i] = validation.checkInputInt("input value of bill " + (i + 1) + ":", 1);
        }
        return bills;
    }

    /**
     * Nhập số tiền trong ví (không âm).
     */
    public int inputWalletAmount() {
        return validation.checkInputInt("input value of wallet:", 0);
    }

    public void displayTotal(int total) {
        System.out.println("this is total of bill:" + total);
    }

    public void displayPayResult(boolean canPay) {
        if (canPay) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }
    }
}
