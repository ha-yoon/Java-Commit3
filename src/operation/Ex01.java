package operation;

public class Ex01 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		a = 100;
		b = a + 100;
		c = b + 200;
		
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		a = b = c = 100;
		
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		
		a += 100; 
		b -= 100; 
		c *= 100; 
		System.out.printf("a, b, c의 값 : %d, %d, %d\n\n", a, b, c);
		
		a = b = 10;
		
		System.out.printf("a, b의 값 : %d, %d\n\n", a, b);
		
		a /= 5; 
		b %= 3; 
		
		
		
	}

}
