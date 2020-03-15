package String;

public class Unicode {

	public static void main(String[] args) {
		String a = "Hello";
		System.out.println(a.codePointAt(2)+" "+a.codePointAt(1));
		System.out.println(a.codePointBefore(2));
		System.out.println(a.codePointCount(1, 5));
		

	}

}
