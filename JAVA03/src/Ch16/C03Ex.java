package Ch16;

import java.util.ArrayList;
import java.util.List;

interface Calculator{
	int calculate(int num1, int num2);
}
public class C03Ex {

	public static void main(String[] args) {
		
		Calculator add = (a,b)->{return a+b;};
		Calculator sub = (a,b)->{return a-b;};
		Calculator mul = (a,b)->{return a*b;};
		Calculator div = (a,b)->{return a/b;};
		
		//결과
		System.out.println(add.calculate(10,20));//덧셈
		System.out.println(sub.calculate(30,10));//뺄셈
		System.out.println(mul.calculate(10,20));//곱셈
		System.out.println(div.calculate(100,5));//나눗셈
		//출력결과
//		30
//		20
//		200	
//		20

		

	}

}
