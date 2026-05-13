package Ch17;

/* ----------------------------------------------------------
   1-Ex. [학생용 문제] filter / map 기초
   ----------------------------------------------------------
   학습 단계 : C01STREAMMAIN 학습 직후
   풀이 방법 : 각 Q 의 데이터를 스트림으로 가공해 기대 출력을 만들어 보세요.
   정답 참고 : C01ExFilterMapAns.java
   ---------------------------------------------------------- */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C01ExFilterMap {

	public static void main(String[] args) {

		// ====================================================
		// Q1. nums 에서 짝수만 골라 List<Integer> 로 만들고 출력
		//     기대 : [2, 4, 6, 8, 10]
		// ====================================================
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// TODO 답안 작성
		List<Integer> nums2 = nums.stream().filter((n)->{return n%2==0;}).collect(Collectors.toList());
		System.out.println(nums2);
		// ====================================================
		// Q2. mixed 에서 음수만 골라 절댓값으로 변환해서 출력
		//     기대 : [3, 1, 7]
		// ====================================================
		List<Integer> mixed = Arrays.asList(-3, 5, -1, 8, -7, 2);
		// TODO 답안 작성
		List<Integer> mixed1 = mixed.stream().filter((n)->{return n<0;}).map((n)->{return Math.abs(n);}).collect(Collectors.toList());
		System.out.println(mixed1);
		// ====================================================
		// Q3. 5글자 이상의 단어만 골라 모두 대문자로 변환해서 출력
		//     기대 : [APPLE, BANANA, ELEPHANT]
		// ====================================================
		List<String> words = Arrays.asList("apple", "hi", "banana", "cat", "elephant");
		// TODO 답안 작성
		List<String> words1 = words.stream().filter((el)->{return el.length()>=5;}).map((el)->{return el.toUpperCase();}).collect(Collectors.toList());
		System.out.println(words1);
		// ====================================================
		// Q4. 1~20 중 3의 배수만 골라 제곱한 결과를 출력
		//     기대 : [9, 36, 81, 144, 225, 324]
		// ====================================================
		// TODO 답안 작성
		List<Integer> nums4 = IntStream.rangeClosed(1, 20).boxed().filter((n)->{return n%3==0;}).map((n)->{return n*n;}).collect(Collectors.toList());
		System.out.println(nums4);
//		List<Integer> num4 = num.stream().filter((n)->{return n%3==0;}).map((n)->{return n*3;}).collect(Collectors.toList());
//		System.out.println(words1);
		// ====================================================
		// Q5. words2 에서 'a' 로 시작하는 것만 골라 첫 글자만 추출해서 출력
		//     기대 : [a, a, a]
		// ====================================================
		List<String> words2 = Arrays.asList("apple", "banana", "ant", "kiwi", "avocado");
		// TODO 답안 작성
		List<String> words3 = words2.stream().filter((el)->{return el.startsWith("a");}).map((el)->{return el.replace(el, "a");}).collect(Collectors.toList());
		System.out.println(words3);
	}
}
