package test;

public class Test {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		method(a, b);
		System.out.println(a);
		System.out.println(b);
	}

	public static void method(Integer a, Integer b) {

		a = new Integer(500);
		b = new Integer(400);
		// System.out.println("a:"+a+",b:"+b);

	}

}
