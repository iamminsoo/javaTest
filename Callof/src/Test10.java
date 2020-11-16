

public class Test10 {
	public static void main(String[] args) {
		int[] a = {10, 20};
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		
		swap(a);
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		String c = "java";
		c = "c++";
	}
	
	public static void swap(int[] a) {
		int imsi = 0;
		imsi = a[0]; //a = 10, b = 20, imsi = 10
		a[0] = a[1]; //a =20, b =20 imsi = 10
		a[1] = imsi; //a = 20, b= 10;
		
		//세션 id, name "java"
		//String name = session.getAttribute("name");
		//name = "c++";
		
		//변수 name = "c++"     session.getAttribute("name")="c++"
		//session.getAttribute("name")"
	}
}
