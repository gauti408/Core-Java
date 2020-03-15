package Practice;

public class AnagramUsingStringBuilder {

	public static void main(String[] args) {
		String a ="Java";
		String b ="avaj";
		System.out.println(amgram(a,b));
	}

	public static Boolean amgram(String str1,String str2) {
		char[] c = str1.toCharArray();
		StringBuilder str = new StringBuilder(str2);
		
		for(int i =0;i<str1.length();i++) {
			int index = str.indexOf(String.valueOf(c[i]));
			if(index!=-1) {
				str.deleteCharAt(index);
				
			}else {
				return false;
			}
			
		}
		return str.length()==0;
	}

}