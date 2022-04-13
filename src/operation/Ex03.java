package operation;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		int a, b;
		int result;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("첫번째 숫자 입력 : ");
		a = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		b = scan.nextInt();
		
		result = a + b;
		System.out.println(a + "+" + b + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);
		
		result = a * b;
		System.out.println(a + "*" + b + "=" + result);
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);
		
		scan.close();
		
	}

}
