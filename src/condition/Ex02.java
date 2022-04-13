package condition;

public class Ex02 {

	public static void main(String[] args) {
		
		int a = 85; 
		
		if(a < 80) {
			System.out.println("a는 c등급 입니다.");
		}
		
		if(a >= 80 && a < 90) {
			System.out.println("a는 B등급 입니다.");
		}
		
		if(a >= 90 && a <= 100) {
			System.out.println("a는 A등급 입니다.");
		}
		
		
		
		if(a < 80) {
			System.out.println("a는 C등급 입니다.");
		}else if(a < 90) {
			System.out.println("a는 B등급 입니다.");
		}else {
			System.out.println("a는 A등급 입니다.");
		}
		
	}

}
