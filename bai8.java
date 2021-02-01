import java.util.Scanner;
public class bai8 {

	public static void main(String[] args) {
		int n;
		int a;
		int sum = 0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		n = sc.nextInt();
		System.out.print("Bạn nhập tiếp "+ n + " số nguyên: \n");
		for (int i= 1; i <= n; i++){
			a = sc.nextInt();
			sum += a;
		}
		avg = sum / n;
		System.out.println("Trung bình cộng của " + n +" số nguyên vừa nhập là: "+ avg);
		// TODO Auto-generated method stub

	}

}
