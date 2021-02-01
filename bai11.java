import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("   Nhập phần tử thứ " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        System.out.print("Mảng số ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        int temp = A[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (A[i] > A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        System.out.print("\nMảng đã sắp xếp theo thứ tự tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
