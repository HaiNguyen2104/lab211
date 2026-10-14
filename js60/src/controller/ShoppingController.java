/*
 * Copyright (c) 2026. All rights reserved.
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp điều khiển luồng chương trình mua sắm.
 * Ngày tạo file: 14/10/2026
 * Ngày cập nhật cuối: 14/10/2026
 */

package controller;

import model.Person;
import model.Wallet;
import view.ShoppingView;

/**
 * Lớp ShoppingController điều phối View và Model.
 */
public class ShoppingController {

    private final ShoppingView view;

    public ShoppingController() {
        this.view = new ShoppingView();
    }

    /**
     * Thực thi luồng chương trình: nhập dữ liệu, tính tổng, kiểm tra thanh toán.
     */
    public void run() {
        // Function 1: hiển thị và nhập dữ liệu
        view.displayTitle();
        int number = view.inputNumberOfBills();
        int[] bills = view.inputBills(number);
        int walletAmount = view.inputWalletAmount();

        // Controller tạo Model từ dữ liệu thô do View trả về
        Person person = new Person(new Wallet(walletAmount));

        // Function 2: tính tổng và kiểm tra thanh toán
        int total = person.getWallet().calcTotal(bills);
        view.displayTotal(total);
        view.displayPayResult(person.getWallet().payMoney(total));
    }
}
