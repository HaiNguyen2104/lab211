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
 * Lớp Wallet đại diện cho ví tiền, chỉ lưu số tiền trong ví.
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
}
