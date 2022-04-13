package condition;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력 : ");
		int a = scan.nextInt();
		
		System.out.print("첫번째 수를 입력 : ");
		int b = scan.nextInt();
		
		
		if(a > b) {
			System.out.println("a가 b보다 큽니다.");
		}else if(b > a) {
			System.out.println("b가 a보다 큽니다.");
		}else {
			System.out.println("a와 b는 같습니다.");
		}
	}

}
