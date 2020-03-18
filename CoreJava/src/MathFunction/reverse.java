package MathFunction;

public class reverse {

	public static void main(String[] args) {
		int a = 1245;
		String b = String.valueOf(a);
		char[] c = new char[b.length()-1];
		String d="";
		for(int i =b.length()-1;i>=0;i--) {
			 d=d+b.charAt(i);
		}System.out.println(d);

	}

}
