package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		
		
		if(a % 2 == 0) {
			System.out.println("짝수입니다.😊");
		}else if(a % 2 == 1) {
			System.out.println("홀수입니다.😊");
		}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요~");
		}

	}

}
