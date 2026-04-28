//package CH05;
//
//class Super {
//	//오버로딩
//	int sum(int x, int y) {
//		return x + y;
//	}
//	//오버로딩
//	int sum(int x, int y, int z) {
//		return x + y + z;
//	}
//
//}
//
//class Sub extends Super {
//	//오버라이딩
//	int sum(int x, int y) {
//		return x + y + 1;
//	}
//	//오버라이딩
//	int sum(int x, int y, int z) {
//		return x + x + y + y + z + z;
//	}
//	//오버로딩
//	int sum(int x, int y, int z, int h) {
//		return x + y + z + h;
//	}
//	//오버로딩
//	double sum(int x, double y , double z) {
//		return x+y;
//	}
//}
//
//public class C04OverloadingriddingMain {
//
//	public static void main(String[] args) {
//		Sub ob = new Sub();
//		ob.sum(1, 2);
//	}
//
//}
