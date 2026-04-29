package Ch05;

class Parent{
	void Func1() {System.out.println("Parent's Func1() Call!");}
	void Func2() {System.out.println("Parent's Func2() Call!");}
}
class Son extends Parent{
	//재정의
	void Func2() {System.out.println("Son's Func2() Call!");}
	
	//추가(확장)
	void Func3() {System.out.println("Son's Func3() Call!");}
}

public class C08UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting
		Parent ob1 = new Parent();
		ob1.Func1();
		ob1.Func2();
//		System.out.println();
//		Son ob2 = new Son();
//		ob2.Func1();
//		ob2.Func2();
//		ob2.Func3();
//		System.out.println();
		
		//UpCasting
		Parent ob3 = new Son();
		ob3.Func1();
		ob3.Func2();
		
		//UPCASTING된(상위클래스형 참조변수 = 하위클래스형 객체) 상태에서
		//상위클래스형 참조변수는 연결된 하위클래스형객체의 추가된 멤버에 접근이 가능하다? x ->DownCasting 필요
		//상위클래스형 참조변수는 연결된 하위클래스형객체의 추가된 재정의된 멤버메서드에 접근이 가능하다? o
	}

}
