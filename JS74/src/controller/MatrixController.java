/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.MatrixView;
/*
 * Họ và tên: Nguyễn Trọng Đức Hải
 * Mã sinh viên: HE180930
 * Mục đích file: Lớp điều phối logic nghiệp vụ và tính toán toán học cho ma trận.
 * Ngày tạo file: 21/08/2026
 * Ngày cập nhật cuối: 21/08/2026
 */

/**
 * Lớp MatrixController đóng vai trò trung tâm điều khiển chương trình.
 */
public class MatrixController {

    // Khai báo đối tượng View để gọi các phương thức hiển thị và nhập xuất
    private MatrixView view;

    /**
     * Constructor khởi tạo Controller và liên kết đối tượng View.
     */
    public MatrixController() {
        this.view = new MatrixView(); // Khởi tạo một thể hiện của MatrixView
    }

    /**
     * Thuật toán Cộng 2 ma trận: C[i][j] = A[i][j] + B[i][j]
     */
    private int[][] additionMatrix(int[][] m1, int[][] m2) {
        int row = m1.length, col = m1[0].length; // Lấy kích thước hàng và cột
        int[][] res = new int[row][col]; // Khởi tạo mảng kết quả cùng kích thước
        
        // Vòng lặp duyệt qua từng dòng
        for (int i = 0; i < row; i++) {
            // Vòng lặp duyệt qua từng cột
            for (int j = 0; j < col; j++) {
                // Cộng hai phần tử tương ứng của m1 và m2
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res; // Trả về ma trận tổng
    }

    /**
     * Thuật toán Trừ 2 ma trận: C[i][j] = A[i][j] - B[i][j]
     */
    private int[][] subtractionMatrix(int[][] m1, int[][] m2) {
        int row = m1.length, col = m1[0].length; // Lấy kích thước hàng và cột
        int[][] res = new int[row][col]; // Khởi tạo mảng kết quả
        
        // Vòng lặp duyệt qua từng dòng
        for (int i = 0; i < row; i++) {
            // Vòng lặp duyệt qua từng cột
            for (int j = 0; j < col; j++) {
                // Trừ hai phần tử tương ứng của m1 và m2
                res[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return res; // Trả về ma trận hiệu
    }

    /**
     * Thuật toán Nhân 2 ma trận: C[i][j] = Tổng(A[i][k] * B[k][j])
     */
    private int[][] multiplicationMatrix(int[][] m1, int[][] m2) {
        int row1 = m1.length, col1 = m1[0].length, col2 = m2[0].length;
        int[][] res = new int[row1][col2]; // Ma trận tích có kích thước row1 x col2

        // Vòng lặp duyệt hàng của ma trận 1
        for (int i = 0; i < row1; i++) {
            // Vòng lặp duyệt cột của ma trận 2
            for (int j = 0; j < col2; j++) {
                // Vòng lặp thực hiện tích vô hướng giữa hàng i (m1) và cột j (m2)
                for (int k = 0; k < col1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res; // Trả về ma trận tích
    }

    /**
     * Xử lý Phép Cộng Ma Trận (Kiểm tra kích thước ngay khi nhập hàng/cột ma trận 2).
     */
    public void performAddition() {
        System.out.println("----- Addition -----");
        // Nhập kích thước và dữ liệu Ma trận 1
        int r1 = view.inputRow(1);
        int c1 = view.inputCol(1);
        int[][] m1 = view.inputMatrixElements(new int[r1][c1], 1);

        int r2, c2;
        // Vòng lặp kiểm tra điều kiện hàng/cột của Ma trận 2 ngay lập tức
        while (true) {
            r2 = view.inputRow(2);
            c2 = view.inputCol(2);

            // Cấu trúc điều kiện: Ma trận 1 và 2 phải cùng kích thước (Row1 == Row2 && Col1 == Col2)
            if (r1 == r2 && c1 == c2) {
                break; // Đúng kích thước thì thoát khỏi vòng lặp kiểm tra
            }
            // In thông báo lỗi nếu nhập sai kích thước và yêu cầu nhập lại r2, c2
            view.displayErrorMessage("Matrices must have the same dimensions for addition!");
        }

        // Tiến hành nhập các phần tử cho Ma trận 2 sau khi đã đảm bảo kích thước chuẩn
        int[][] m2 = view.inputMatrixElements(new int[r2][c2], 2);
        // Tính toán và hiển thị kết quả ra màn hình
        view.displayResult(m1, m2, additionMatrix(m1, m2), '+');
    }

    /**
     * Xử lý Phép Trừ Ma Trận (Kiểm tra kích thước ngay khi nhập hàng/cột ma trận 2).
     */
    public void performSubtraction() {
        System.out.println("----- Subtraction -----");
        // Nhập kích thước và dữ liệu Ma trận 1
        int r1 = view.inputRow(1);
        int c1 = view.inputCol(1);
        int[][] m1 = view.inputMatrixElements(new int[r1][c1], 1);

        int r2, c2;
        // Vòng lặp kiểm tra kích thước Ma trận 2
        while (true) {
            r2 = view.inputRow(2);
            c2 = view.inputCol(2);

            // Cấu trúc điều kiện: Hai ma trận phải cùng kích thước
            if (r1 == r2 && c1 == c2) {
                break; // Kích thước hợp lệ, thoát vòng lặp
            }
            // Hiển thị thông báo lỗi nếu sai kích thước
            view.displayErrorMessage("Matrices must have the same dimensions for subtraction!");
        }

        // Nhập các phần tử Ma trận 2
        int[][] m2 = view.inputMatrixElements(new int[r2][c2], 2);
        // Tính toán và hiển thị kết quả
        view.displayResult(m1, m2, subtractionMatrix(m1, m2), '-');
    }

    /**
     * Xử lý Phép Nhân Ma Trận (Kiểm tra điều kiện c1 == r2 ngay khi nhập hàng/cột ma trận 2).
     */
    public void performMultiplication() {
        System.out.println("----- Multiplication -----");
        // Nhập kích thước và dữ liệu Ma trận 1
        int r1 = view.inputRow(1);
        int c1 = view.inputCol(1);
        int[][] m1 = view.inputMatrixElements(new int[r1][c1], 1);

        int r2, c2;
        // Vòng lặp bắt lỗi điều kiện nhân ma trận
        while (true) {
            r2 = view.inputRow(2);
            c2 = view.inputCol(2);

            // Cấu trúc điều kiện nhân: Số cột Ma trận 1 phải bằng Số hàng Ma trận 2 (c1 == r2)
            if (c1 == r2) {
                break; // Thỏa mãn điều kiện nhân thì thoát vòng lặp
            }
            // Hiển thị báo lỗi nếu không khớp điều kiện nhân
            view.displayErrorMessage("Column of Matrix 1 must be equal to Row of Matrix 2!");
        }

        // Nhập các phần tử cho Ma trận 2
        int[][] m2 = view.inputMatrixElements(new int[r2][c2], 2);
        // Thực hiện tính nhân ma trận và hiển thị kết quả
        view.displayResult(m1, m2, multiplicationMatrix(m1, m2), '*');
    }

    /**
     * Phương thức kích hoạt chương trình và duy trì vòng lặp hiển thị Menu.
     */
    public void run() {
        int mainChoice= view.displayMainMenu();
        if(mainChoice==4){
            System.exit(0);
        }
        switch(mainChoice){
            case 1: 
                    performAddition();
                case 2:
                    performSubtraction();
                case 3:
                    performMultiplication();
        }
        
        while(true){
            int option = view.displayChoiceMenu();
            switch(option){
                case 1: 
                    performAddition();
                case 2:
                    performSubtraction();
                case 3:
                    performMultiplication();          
            }
            if(!view.askToContinue()){
                break;
            }
        }
    }
}
