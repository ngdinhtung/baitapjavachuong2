import java.util.Scanner;
public class bai6 {

	public static void main(String[] args) {
		int a;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập vào 1 số nguyên dương: ");
			a = sc.nextInt();
			for (int i = 1; i <= a; i++) {
				b *= i;
			
			}
			System.out.println("\n\t"+ a +"! = " + b);
		
		}
		while (a <= 0);
		// TODO Auto-generated method stub

	}

}
