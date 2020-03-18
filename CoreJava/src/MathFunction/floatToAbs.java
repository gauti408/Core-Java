package MathFunction;

public class floatToAbs {

	public static void main(String[] args) {
		float f =-1523.1554f;
		float abs = (f>0) ? f : -f;
		System.out.println(abs);
		System.out.println(Math.floor(f)+" "+ Math.ceil(f));

	}

}
