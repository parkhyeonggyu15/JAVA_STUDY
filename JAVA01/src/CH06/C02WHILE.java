package CH06;

import java.util.Scanner;

public class C02WHILE {

	public static void main(String[] args) {

		// 2 - 9 단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}

		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(n<10) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", n,i , n*i);
//				i++;
//			}
//			System.out.println();
//			n++;
//		}
//		 N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();

		// 유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		 (N>=M) || (N<2 || N>9) || (M<=2 || M>=10)
//		while ((n >= m) || (n < 2 || n > 9) || (m <= 2 || m >= 10)) {
//			System.out.println("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//
//		int dan = n;
//		while (dan < m + 1) {
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", n, i, n * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// N - M 단 출력 거꾸로 2 x 9 , 2 x 8 ....
//		int dan = n;
//		while (dan < m + 1) {
//			int i = 1;
//			while (i < 10) {
//				System.out.printf("%d x %d = %d\n", n, i, n * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 1) 고정높이
		// *****
		// *****
		// *****
		// *****

//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<5) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// 2)
		// 높이 : 4
		// *****
		// *****
		// *****
		// *****

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<5) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

//		sc.close();
		// 3) 고정높이
		// *
		// **
		// ***
		// ****
//		
//		int i = 0;
//		while(i<4) {
//			int j=0;
//			while(j<=i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		// 4)
		// 높이 : 4
		// *
		// **
		// ***
		// ****
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<=i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		// 5)
		// 높이 : 4
		// ****
		// ***
		// **
		// *

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = h;
//		while(i>0) {
//			int j=0;
//			while(j<i) {
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
//		sc.close();

		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******

// 높이(h : 4)
//		i(행)		j(공백)			k(별)
//		0			0~(h-2)			0~0
//		1			0~(h-2)-1		0~2
//		2			0~(h-2)-2		0~4
//		3			0~(h-2)-3		0~6
//		...
//		h-1			0~(h-2)-(h-1)
//		-------------------------------------
//		i=0			j=0				k=0
//		i++			j++				k++
//		i<h			j<(h-1)-i		k<=i*2

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=1;
//			while(j<=h-i-1) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=(i*2)) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *

//		i(행)		j(공백)		k(별)
//		0			0-0				0-6
//		1			0-1				0-4
//		2			0-2				0-2
//		3			0-3				0-0
//		-------------------------------------
//		i=0			j=0				k=0
//		i++			j++				k++
//		i<h			j<i				k<2 * (h - i) - 1
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j=0;
//			while(j<i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<2 * (h - i) - 1) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *

		
//		int h = 5;
//		int i = 1;
//		while(i<h) {
//			int j=0;
//			while(j<h-i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<i*2 - 1) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		i = h-2;
//		while(i>=1) {
//			int j=0;
//			while(j<h-i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<i*2 - 1) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i--;
//		}
		

		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		h = h / 2 + 1;
//		int i = 1;
//		while(i<=h) {
//			int j=0;
//			while(j<h-i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<i*2 - 1) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		i = h-1;
//		while(i>=1) {
//			int j=0;
//			while(j<h-i) {
//				System.out.printf(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<i*2 - 1) {
//				System.out.printf("*");
//				k++;
//			}
//			System.out.println();
//			i--;
//		}
//		sc.close();
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		h = h / 2 + 1;
		int i = 0;
		while(i<h) {
			int j=0;
			while(j<i) {
				System.out.printf(" ");
				j++;
			}
			int k = 0;
			while(k<2 * (h - i) - 1) {
				System.out.printf("*");
				k++;
			}
			System.out.println();
			i++;
		}
		i = 1;				//h=4
		while(i<=h-1) {
			int j=0;
			while(j<(h-i)-1) {
				System.out.printf(" ");
				j++;
			}
			int k = 0;
			while(k<i*2+1) {
				System.out.printf("*");
				k++;
			}
			System.out.println();
			i++;
		}
		sc.close();
		
	}

}
