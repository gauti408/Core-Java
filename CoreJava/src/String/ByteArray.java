package String;

public class ByteArray {

	public static void main(String[] args) {
		String a = "my name is";
		byte[] b = a.getBytes();
		String c = new String(b);
		System.out.println(b[0] + "    "+ c);
	}

}
