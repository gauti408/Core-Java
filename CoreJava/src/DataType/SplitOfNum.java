package DataType;

public class SplitOfNum {

	public static void main(String[] args) {
		int a = 12345;
		String b= String.valueOf(a);
		String c="";
		for(int i=0;i<b.length();i++) {
			c+=b.charAt(i)+" ";
		}
		System.out.println(c);

	}

}
