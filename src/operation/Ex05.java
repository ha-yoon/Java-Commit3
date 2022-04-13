package operation;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
				
		Scanner scan = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;
		
		System.out.print("동전으로 교환할 돈 : ");
		money = scan.nextInt();
		
			
		c500 = money / 500; 
		money = money % 500; 
		
		c100 = money / 100;
		money = money % 100;
		
		c50 = money / 50;
		money = money % 50;
		
		c10 = money / 10;
		money = money % 10;

		
		System.out.println("오백원 동전 : " + c500 + "개");
		System.out.println("백원 동전 : " + c100 + "개");
		System.out.println("오십원 동전 : " + c50 + "개");
		System.out.println("십원 동전 : " + c10 + "개");
		System.out.println("남은 돈 : " + money + "원");
		
		
		

	}

}
