package Ch04;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		//1) 1 ~ 45 까지숫자를 6개를 랜덤으로 받아(Random클래스를이용) set에 저장 / 출력
		Random random = new Random();
		Set<Integer> set = new HashSet();
		 
		int i=0;
		for(i=0;set.size()<6; i++) {
			set.add(random.nextInt(45)+1);
	
		}
		
		set.forEach(System.out::println);
		
		System.out.println("-----------");
		
		//2) [추가]저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수사용 )
		//2-1)
//		List<Integer> tmpset = new ArrayList<>(set);
//		Collections.sort(tmpset);
//		tmpset.forEach(System.out::println);

		//2-2)
		List<Integer> tmpset =set.stream().sorted().collect(Collectors.toList());
		tmpset.forEach(System.out::println);
	}

}
