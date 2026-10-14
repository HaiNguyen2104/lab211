/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp đại diện cho người dùng, sở hữu một chiếc ví.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package model;

/**
 * Lớp Person đại diện cho người dùng, bên trong có đối tượng Wallet.
 */
public class Person {

    private Wallet wallet;

    public Person() {
    }

    public Person(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
