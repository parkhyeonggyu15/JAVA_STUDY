package PRACTICE;

import java.util.Scanner;

class Student{
	private String name;
	private int id;

	Student(String name, int id){
		System.out.println(name + " " + id);
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
}


public class StudentEx1 {

	public static void main(String[] args) {
		/*
		 * 다음을 만족하는 Student 클래스를 작성하시오
		 * String 형의 학과와 정수형의 학번을 필드로 선언 
		 * Student 클래스의 main()메소드에서 Student 객체를 생성하여 학과와 학번 필드에 
		 * 적당한 값을 입력한 후 출력
		 * 2. 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
          필드를 모두 private로 하고, getter와 setter를 구현하고 
          Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 
			학과와 학번 필드에 적당한 값을 입력 후 출력
		 */
		Student ob = new Student("컴퓨터공학과",5628566);
		ob.setname("컴퓨터공학과");
		ob.setid(5628566);
		System.out.println(ob.getname() + " " + ob.getid());
		
		

		
		
	}

}