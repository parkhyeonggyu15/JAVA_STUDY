package CH06;

import java.util.Scanner;

public class C04FOR {

	public static void main(String[] args) {

//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}

//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//		}
		// 02while.java 의 while 문을 모두 for문으로 바꾸세요
		// 2 - 9 단 출력
//		for(int dan = 2;dan<10;dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}

		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int dan = n;dan<10;dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		sc.close();

		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		// 유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		while ((n >= m) || (n < 2 || n > 9) || (m <= 2 || m >= 10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		for(int dan = n;dan<(m+1);dan++) {
//			for(int i=1;i<10;i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		sc.close();

		// N - M 단 출력 거꾸로 9 x 9 , 9 x 8 ....
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		for(int dan = m;dan>n-1;dan--) {
//			for(int i=9;i>0;i--) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		sc.close();
		
		// 1) 고정높이
		// *****
		// *****
		// *****
		// *****
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
		
		// 2)
		// 높이 : 4
		// *****
		// *****
		// *****
		// *****
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();
		
		// 3) 고정높이
		// *
		// **
		// ***
		// ****
		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
//		
//		// 4)
//		// 높이 : 4
//		// *
//		// **
//		// ***
//		// ****
//		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
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
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<=(h-1)-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		sc.close();

		// 6)
		// 높이 : 4
		//    *
		//   ***
		//  *****
		// *******

//		for(int i=0;i<4;i++) {	
//			for(int j=0;j<3-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<=i*2;k++) {
//				System.out.print("*");
//			}		
//			System.out.println();
//			
//		}

// 높이  : h		
//		i(행)		j(공백)			k(별)
//		0			0~(h-2)-0		0~0
//		1			0~(h-2)-1		0~2
//		2			0~(h-2)-2		0~4
//		3			0~(h-2)-3		0~6
//		...
//		h-1			0~(h-2)-(h-1)
//		------------------------------------
//		i=0			j=0				k=0	
//		i++			j++				k++
//		i<h			j<(h-1)-i		k<=i*2

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		for(int i=0;i<h;i++) {	
//			for(int j=0;j<(h-1)-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<=i*2;k++) {
//				System.out.print("*");	
//			}		
//			System.out.println();
//		}
//		sc.close();

		// 7)
		// 높이 : 4
		// *******
		//  *****
		//   ***
		//    *

		// 고정높이
//		i(행)		j(공백)		k(별)
//		0			x			0-6
//		1			0-0			0-4
//		2			0-1			0-2
//		3			0-2			0-0
//		---------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<4			j<=i-1		k<=(3*2)-2*i

		
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<=i-1;j++) {			
//				System.out.print(" ");
//			}	
//			for(int k=0;k<=(3*2)-2*i;k++) {
//				System.out.print("*");
//			}	
//			System.out.println();
//		}

		// 높이 : h

//		i(행)		j(공백)		k(별)
//		0			x			0-((h-1)*2)-2*0
//		1			0-0			0-((h-1)*2)-2*1
//		2			0-1			0-((h-1)*2)-2*2
//		3			0-2			0-0
//		...
//		h-1
//		---------------------------------------
//		i=0			j=0			k=0
//		i++			j++			k++
//		i<h			j<i-1		k<=((h-1)*2)-2*i

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for(int i=0;i<h;i++) {
//			for(int j=0;j<=i-1;j++) {			
//				System.out.print(" ");
//			}
//			
//			for(int k=0;k<=((h-1)*2)-2*i;k++) {
//				System.out.print("*");
//				
//			}	
//			System.out.println();
//			
//		}
//		sc.close();

		// 8) 고정높이
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *

//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		---------------------------------------
//		i<4			j=0			k=0
//					j++			k++
//					j<3-i		k<=2*i
//			
//		---------------------------------------
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		---------------------------------------
//		i>=4		j=0			k=0
//					j++			k++
//					j<=i-4		k<=(6*2)-i*2
//		---------------------------------------
//		i=0
//		i++
//		i<7

		
//		for(int i=0;i<7;i++) {
//			
//			if(i<4) {
//				
//				for(int j=0;j<3-i;j++) {
//					System.out.print(" ");
//					
//				}
//				
//				for(int k=0;k<=2*i;k++) {
//					System.out.print("*");
//					
//				}
//				
//			}else {
//		
//				for(int j=0;j<=i-4;j++) {
//					System.out.print(" ");
//				}
//				for(int k=0;k<=(6*2)-i*2;k++) {
//					System.out.print("*");
//					
//				}
//				
//			}
//			
//			
//			System.out.println();
//			
//			
//		}

		// 9)
		// 높이 : 7
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *

//		높이 : h
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		---------------------------------------
//		i<=h/2		j=0			k=0
//					j++			k++
//					j<(h/2)-i	k<=2*i
//			
//		---------------------------------------
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		---------------------------------------
//					j=0			k=0
//					j++			k++
//					j<i-h/2		k<=((h-1)*2)-i*2
//		---------------------------------------
//		i=0
//		i++
//		i<h
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		//h%2==1 && h>1
//		//h%2==0 || h<=1
//		while(h%2==0 || h<=1) {
//			System.out.print("다시 입력(홀수) : ");
//			h=sc.nextInt();
//		}
//		
//		
//		for (int i = 0;i<h;i++) {
//			if (i<=h/2) {
//
//				for(int j = 0;j<(h/2)-i;j++) {
//					System.out.print(" ");
//				}				
//				for(int k = 0;k <= 2 * i;k++) {
//					System.out.print("*");
//				}
//			} else {
//				
//				for(int j = 0;j<i-h/2;j++) {
//					System.out.print(" ");
//				}
//				
//				for(int k = 0;k<=((h-1)*2)-i*2;k++) {
//					System.out.print("*");
//					
//				}
//			}
//			System.out.println();
//			
//
//		}
//		sc.close();
		
		// 10)
		// 높이 : 7
		// *******
		//  *****
		//   ***
		//    *
		//   ***
		//  *****
		// *******
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		h = h / 2 + 1;
		for(int i = 0;i<h;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			
			for(int k = 0;k<2 * (h - i) - 1;k++) {
				System.out.printf("*");
			}
			System.out.println();
			
		}
		for(int i = 1;i<=h-1;i++) {
			for(int j=0;j<(h-i)-1;j++) {
				System.out.printf(" ");
			}
			for(int k = 0;k<i*2+1;k++) {
				System.out.printf("*");
				
			}
			System.out.println();
			
		}
		sc.close();
	}

}
