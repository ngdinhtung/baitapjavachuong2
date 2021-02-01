import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = sc.nextInt();

        int A[][] = new int[m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
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