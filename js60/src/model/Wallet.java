/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp đại diện cho ví tiền của người dùng.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package model;

/**
 * Lớp Wallet lưu số tiền trong ví, tính tổng hóa đơn và kiểm tra khả năng thanh toán.
 */
public class Wallet {

    private int amount;

    public Wallet() {
    }

    public Wallet(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Tính tổng giá trị các hóa đơn.
     *
     * @param bills Mảng giá trị các hóa đơn
     * @return Tổng số tiền của các hóa đơn
     */
    public int calcTotal(int[] bills) {
        int total = 0;
        for (int bill : bills) {
            total += bill;
        }
        return total;
    }

    /**
     * Kiểm tra số tiền trong ví có đủ để thanh toán hay không.
     *
     * @param total Tổng số tiền cần thanh toán
     * @return true nếu đủ tiền, false nếu không đủ
     */
    public boolean payMoney(int total) {
        return amount >= total;
    }
}
