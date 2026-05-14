package PRACTICE;

import java.util.Scanner;
class GradeEx {
	int math;
	int science;
	int english;
	GradeEx(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	int average(int math, int science, int english) {
		int sum = math + science + english;
		int result = sum/3;
		return result;
	}
}

public class Grade {

	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   GradeEx me = new GradeEx(math, science, english);
		   System.out.println("평균은 "+me.average(math, science, english)); // average()는 평균을 계산하여 리턴
		   
		   sc.close();
		}

}
