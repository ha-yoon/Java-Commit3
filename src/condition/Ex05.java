package condition;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int a = scan.nextInt();
		
		
		if(a % 3 == 0 && a % 5 == 0) {
			System.out.println("a는 3과 5의 배수입니다~😜");
		}else {
			System.out.println("a는 3과 5의 배수가 아닙니다~😜");
		}
		

	}

}
