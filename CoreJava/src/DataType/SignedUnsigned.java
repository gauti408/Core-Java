package DataType;

public class SignedUnsigned {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println(Integer.compare(a, b));
		System.out.println(Integer.compareUnsigned(a, b));

	}

}
