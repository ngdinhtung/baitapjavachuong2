import java.util.Scanner;
public class bai2 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao 1 so nguyen: ");
		a = sc.nextInt();
		String s = (a % 2 == 0) ? "So vua nhap la so chan!" : "So vua nhap la so le!";
		System.out.println(s);
	}

}
