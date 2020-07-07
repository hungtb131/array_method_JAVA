package array_method_Java;

import java.util.Scanner;

public class remove_elements {
    public static void main(String[] args) {
        int n, i, c;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = sc.nextInt();
        }

        System.out.println("Nhập số nguyên k: ");
        int k = sc.nextInt();
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }

        n = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
