package CH03;

import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {
		//5개의 정수값을 입력받아 int형 배열에 저장하고
		//최대값, 최소값, 전체합을 출력합니다.
		Scanner sc = new Scanner(System.in);
//		int arr1 [] = new int[5];
//		arr1[0] = sc.nextInt();
//		arr1[1] = sc.nextInt();
//		arr1[2] = sc.nextInt();
//		arr1[3] = sc.nextInt();
//		arr1[4] = sc.nextInt();
//		int max = arr1[0];
//		int min = arr1[0];
//		int sum = 0;
//		for(int i=0; i<arr1.length;i++) {
//			 sum += arr1[i];
//			 
//		}
//		System.out.println("전체합 : " + sum);
//		for(int el : arr1) {
//			if(el>max) {
//				max=el;
//			}
//		}
//		System.out.println("최대값 : " + max);
//		for(int el : arr1) {
//			if(el<min) {
//				min=el;
//			}
//		}
//		System.out.println("최소값 : " + min);
		
		//5명의 학생에 국영수점수를 입력받아 2차원배열 저장
		//각 학생의 국영수 점수의 합/평균 구하고
		//각 과목당 합 /평균 구해보세요
//		int row = sc.nextInt();
//		int col = sc.nextInt();
		int [][]arr = new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	
	}

}
