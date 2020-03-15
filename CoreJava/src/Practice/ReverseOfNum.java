package Practice;

public class ReverseOfNum {

	public static void main(String[] args) {
		int a= 123;
		String b =String.valueOf(a);
		String c="";
		for(int i =b.length()-1;i>=0;i--) {
			c=c+b.charAt(i);
		}
		System.out.println(Integer.parseInt(c));

	}

}
