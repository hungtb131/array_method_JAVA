package array_method_Java;

import java.util.Scanner;

public class max_elements_Array2d {
    public static void main(String[] args) {
    // khai báo dòng,cột
        int m, n;

    Scanner sc = new Scanner(System.in);

    System.out.println("Nhập vào số dòng của ma trận: ");
    m = sc.nextInt();
    System.out.println("Nhập vào số cột của ma trận: ");
    n = sc.nextInt();
    //mảng có m dòng,n cột
    int A[][] = new int[m][n];

    System.out.println("Nhập các phần tử cho ma trận: ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = sc.nextInt();
        }
    }
    //loop tìm max
    int max = A[0][0];

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (max < A[i][j]) {
                max = A[i][j];
            }
        }
    }

    System.out.println("Phần tử lớn nhất trong ma trận = " + max);
}



}