import java.util.Scanner;
public class bai3 {

	public static void main(String[] args) {
		int a;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ten cua ban: ");
		name = sc.next();
		System.out.println("Nhap tiep nam sinh cua ban: ");
		a = sc.nextInt();
		int tuoi = 2020 - a;
		if (tuoi < 16) {
			System.out.println("Ban "+name+" o do tuoi vi thanh nien!");
		}
		else if(tuoi > 18) {
			System.out.println("Ban "+name+" da gia!");
		}
		else {
			System.out.println("Ban "+name+" o do tuoi truong thanh!");
		}
	}

}
