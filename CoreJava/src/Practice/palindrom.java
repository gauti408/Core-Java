package Practice;

public class palindrom {

	public static void main(String[] args) {
		String s = "dalad";
		String s2 ="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		if(s2.equals(s)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
		

	}

}
