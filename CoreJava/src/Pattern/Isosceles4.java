package Pattern;

public class Isosceles4 {

	public static void main(String[] args) {
		for(int i =1;i<=4;i++) {
			for(int j =4;j>=i;j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print("*");
			}for(int a=2;a<=i;a++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
