package String;

public class hashcode {

	public static void main(String[] args) {
		String a = "The quick brown dog jump over lazy fox                              ";
		String b = "is Ram";
		int hashcode = a.hashCode();
		System.out.println(hashcode);
		Boolean c = a.regionMatches(0, b, 6, 8);
		System.out.println(c);
		String e =a.replace('a', 'm');
		System.out.println(e);
		System.out.println(a.replaceAll("dog", "Cat"));
		
		System.out.println(a.startsWith("The"));
		System.out.println(a.substring(1, 10));
		System.out.println(a.trim());

	}

}
