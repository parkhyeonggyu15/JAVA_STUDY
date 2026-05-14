package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03FunctionalInterfaceMain {

	//
	public static Function<Integer,Integer> func1 = x-> x*x;
	
	//
	public static Function<Integer,Integer> func2 = x-> x+x;
	//
	public static Function<List<Integer>,Integer> func3 = x->x.stream().reduce(0,(sum,el)->sum+el);
	//
	public static Function<List<Object>, List<String>> func4 = x->x.stream().filter(el -> el instanceof String)
																			   .map(el->(String)el)
																			   .collect(Collectors.toList());
	
	public static void main(String[] args) {
		System.out.println("(1) 제곱 : " + func1.apply(10));
		System.out.println("(2) + 한번더 : " + func2.apply(10));
		System.out.println("(3) 누적합 : " + func3.apply(Arrays.asList(10, 20, 30, 50)));
		System.out.println("(4) String만 꺼내기 : " + func4.apply(Arrays.asList(11, 10.5, "TEST", true, new StringBuffer("HI"),20, 40)));

	}

}
