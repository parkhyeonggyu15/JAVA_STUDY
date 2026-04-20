package CH03;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홍길동 님의 나이를 입력하세요? ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("홍길동 님의 주소를 입력하세요? ");
		String adr1 = sc.nextLine();
		System.out.println("홍길동 님의 나이는 " +num1 + "세"+ " 주소는 " + adr1 + " 입니다");
		sc.close();
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다	
	}

}
