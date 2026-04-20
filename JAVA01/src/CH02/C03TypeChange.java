package CH02;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129; //10000001
		int num2 = 130; //10000010
		
		byte ch1 = (byte)num1; //10000001
		byte ch2 = (byte)num2; //10000010
		
		System.out.printf("%d\n", ch1);
		System.out.printf("%d\n", ch2);
		
	}

}
