package CH03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {
		//5개의 정수값을 입력받아 int형 배열에 저장하고
		//최대값, 최소값, 전체합을 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		int arr1 [] = new int[5];
//		for(int i=0;i<arr1.length;i++)
//			 arr1[i] = sc.nextInt();
////		arr1[0] = sc.nextInt();
////		arr1[1] = sc.nextInt();
////		arr1[2] = sc.nextInt();
////		arr1[3] = sc.nextInt();
////		arr1[4] = sc.nextInt();
//		
//		System.out.println(Arrays.stream(arr1).sum());
//		System.out.println(Arrays.stream(arr1).max().getAsInt());
//		System.out.println(Arrays.stream(arr1).min().getAsInt());
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
//		
		//5명의 학생에 국영수점수를 입력받아 2차원배열 저장
		//각 학생의 국영수 점수의 합/평균 구하고
		//각 과목당 합 /평균 구해보세요
//		int row = sc.nextInt();
//		int col = sc.nextInt();
		
		Scanner sc = new Scanner(System.in);
		int [][] scores = new int[5][3]; //행 (0-4) 학생, 열(0-2), 국(0)영(1)수(2)
		
		//입력
		for(int i=0;i<scores.length;i++) {
			//각 학생마다 반복
			System.out.printf("%d 번째 학생 국영수 점수 입력 : ", i);
			for(int j=0;j<scores[i].length;j++) {
				scores[i][j] = sc.nextInt();
			}
		}
		
		//학생별 평균 총점
		int students_sum[] = new int [5]; //0-4 
		double students_avg[] = new double [5]; //
		for(int i=0;i<scores.length;i++) {
			int sum=0;
			double avg=0.0;
			for(int j=0;j<scores[i].length;j++) {
				sum+= scores[i][j];
			}
			avg = (double)sum/ scores.length;
			
			students_sum[i]=sum;
			students_avg[i]=avg;
		}
		
		//과목별 총점 평균
		int 과목별총점[] = new int[3]; //0 국어총점,1 영어총점,2 수학총점
		for(int i=0;i<scores[i].length;i++) {
			과목별총점[0]+= scores[i][0];
			과목별총점[1]+= scores[i][1];
			과목별총점[2]+= scores[i][2];
			}
		sc.close();
		}
	
	}


