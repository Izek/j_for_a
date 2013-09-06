package chapter_004;

class PointU {
	private int x, y;

	PointU(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
}

class ColoredPointU extends PointU {
	private int color;

	ColoredPointU(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	int getColor() {
		return color;
	}
}

public class UpcastArrayDemo {
	public static void main(String[] args) {
		ColoredPointU[] cptArray = new ColoredPointU[1];
		cptArray[0] = new ColoredPointU(10, 20, 5);
		PointU[] ptArray = cptArray;
		System.out.println(ptArray[0].getX()); // Output: 10
		System.out.println(ptArray[0].getY()); // Output: 20
		// System.out.println(ptArray[0].getColor()); // Illegal
	}
}