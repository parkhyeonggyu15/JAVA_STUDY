package CH06;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class C01WHILE {

	public static void main(String[] args) {
		// 00 기본 문법
		
//		while(조건식) {
//			조건식이 true인 동안 실행되는 종속문장
//		}
		
		//01 HELLOWORLD 10회 출력
		//탈출용 변수	: i
		//탈출 조건식 : i
		//탈출 연산식	: i++
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
		//02 HELLOWORLD N회 출력(N>0)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<0) {
//			System.out.println("N은 0보다 커야 합니다.");
//			System.exit(-1);
//		}
//		
//		int i=0;
//		while(i<n) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
//		sc.close();
		
		//03 1부터 10까지 합 구하기
		
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+ i);
//			sum += i;
//			i++;
//		}
//		System.out.println("%d부터 %d까지 합 : %d\n", 1,10,sum);
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//SWAP
		if(N>M) {
			int tmp = M;
			M = N;
			M = tmp;
		}
		
//		//1부터 N까지의 합
//		int n = 1;
		int sum = 0;
//		while(n<=N) {
//			sum += n;
//			n++;
//		}
//		//N부터 M까지의 합(N<M)
//		int i = N;
//		while(i<M){
//			sum += i;
//			i++;
//		}
		//N부터 M까지의 범위에서 짝수의 합과 홀수의 합 구해서 출력(N<M)
//		int i = N;
//		int sum1 = 0; 
//		int sum2 = 0; 
//		while(i<M){
//			if(i%2==0) {
//				sum1+=i;
//			}else {
//				sum2+=i;
//			}
//			i++;
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);
		// 구구단 2 x 1 =1 , 2 x 9 = 18 찍기
		int i = 1;
		while(i<10) {
			System.out.printf("2 x %d = %d\n" , i, 2*i);
			i++;
		}
	}

}
