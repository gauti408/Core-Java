package Practice;

public class CountingOfEachWord {

	public static void main(String[] args) {
		String s ="hello word";
		String a ="";
		
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
		
		while(i< s.length() && ch[i]!=' ') {
			a=a+ch[i];
			i++;
			
		}if(s.length()>0) {
		System.out.println(a+" "+a.length());
		}
		}
		
		}

	}


