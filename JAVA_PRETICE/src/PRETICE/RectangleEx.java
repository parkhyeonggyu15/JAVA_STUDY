package PRETICE;

class Rectangle {
	int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	int square() {
		int result = width*height;
		return result;
	}

	void show() {
		System.out.println(this.width*this.height);
	}

	boolean contains(Rectangle r) {
		if(this.width*this.height>r.width*r.height) {
			return true;	
		}else {
			return false;
		}
		
	}
}

public class RectangleEx {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s를 포함합니다.");

	}

}
