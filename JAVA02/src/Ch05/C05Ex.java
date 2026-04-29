package Ch05;


class TV{
	String brandName;
	int year;
	int inch;
	
	public TV (String brandName, int year, int inch){
		this.brandName = brandName;
		this.year = year;
		this.inch = inch;
	}
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", this.brandName, this.year, this.inch);
	}
}
class ColorTV extends TV{
	String color;
	public ColorTV(String brandName, int year, int inch, String color) {
		super(brandName, year, inch);
		this.color = color;
		
	}
	public void printProperty() {
		System.out.printf("%s에서 만든 %d년형 %d인치 %s", this.brandName, this.year, this.inch,this.color);
	}
	
}

public class C05Ex {
	
	public static void main(String[] args) {

		ColorTV myTV = new ColorTV("삼성", 2026, 32,"검정"); 
		myTV.printProperty();//삼성에서 만든 2026년형 32인치 검정이 나오면 해결!

	}
}

//
//--------------------------------------------
//문제 - 이것이자바다
//--------------------------------------------
//https://scksk.tistory.com/6
//
//클래스 기본문제
//1~7번 확인하기 
//
//12번-16번 확인하기

//--------------------------------------------
//--추가(명품자바)
//--------------------------------------------
//https://security-nanglam.tistory.com/213
//
//
//--------------------------------------------
//--추가
//--------------------------------------------
//https://iu-corner.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%97%B0%EC%8A%B5-%EB%AC%B8%EC%A0%9C-%EB%AA%A8%EC%9D%8C-1
//


