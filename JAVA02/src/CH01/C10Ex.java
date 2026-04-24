package CH01;

class Person{
	
}
public class C10Ex {
	public static void func1(int num) //파라미터: Primitive(데이터값 저장)
	{
		System.out.println(num);
	}
	public static void func2(Object obj) //파라미터:Reference(주소값 저장)
	{
		System.out.println(obj);
	}
	
	public static Object func3(String name, int age) {
		return new Person(name,age);
	}
	
	public static void main(String[] args) 
	{
		func1(10);
		func2(new Person("홍길동",10));
		Object ob=func3("티모",100);
		
		
	}
}
