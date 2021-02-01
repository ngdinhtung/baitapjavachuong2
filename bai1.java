import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		a = sc.nextInt();
		System.out.println("Nhap so b: ");
		b = sc.nextInt();
		int tong, hieu, tich, du;
		float thuong;
		tong = a + b;
		hieu = a - b;
		tich = a * b;
		thuong = a / b;
		du = a % b;
		System.out.println("Toan tu 2 so: ");
		System.out.println("\tTong a + b: "+ tong);
		System.out.println("\tHieu a - b: "+ hieu);
		System.out.println("\tTich a * b: "+ tich);
		System.out.println("\tThuong a / b: "+ thuong);
		System.out.println("\tChia du a % b: "+ du);
		System.out.println("So sanh 2 so: ");
		if (a < b) {
			System.out.println("\tSo a nho hon so b!");
		}
		else if (a == b) {
			System.out.println("\tSo a bang so b!");
		}
		else {
			System.out.println("\tSo a lon hon so b!");
		}
	}

}
