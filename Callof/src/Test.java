

public class Test {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		swap(a, b);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
	
	public static void swap(int a, int b) {
		int imsi = 0;
		imsi = a; //a = 10, b = 20, imsi = 10
		a = b; //a =20, b =20 imsi = 10
		b = imsi; //a = 20, b= 10;
	}
}
