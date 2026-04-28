package CH04;

//다음 2개의 static 가진 ArrayUtils 클래스를 만들어보자. concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.
class ArrayUtils {

	   public static int[] concat(int[] a, int[] b) {
	        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
		   int result[] = new int[a.length + b.length];
		   for(int i=0; i<a.length;i++) {
			   result[i] = a[i];
		   }
		   for(int j=0;j<b.length;j++) {
			   result[j+a.length] =b[j];
		   }
		   
//		   System.arraycopy(a, 0, result, 0, a.length);
//	       System.arraycopy(b, 0, result, a.length, b.length);
		   return result;
	   }  
	   public static void print(int [] a) {
		   /* 
		    * 배열내 모든 요소 1행으로 띄어쓰기 단위로 출력
		    * ex. a [] = {10,20,30,40}
		    * 출력 : 10 20 30 40
		    *  */
		   for(int i=0; i<a.length;i++) {
			   System.out.print(a[i] + " "  ); 
		   }
	   }
	   
}

public class C04Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtils.concat(array1, array2);
		ArrayUtils.print(array3);
		
	}
}
