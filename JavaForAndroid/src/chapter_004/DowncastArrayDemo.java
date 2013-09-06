package chapter_004;

class PointAD {
	private int x, y;

	PointAD(int x, int y) {
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

class ColoredPointAD extends PointAD {
	private int color;

	ColoredPointAD(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	int getColor() {
		return color;
	}
}

public class DowncastArrayDemo {
	public static void main(String[] args) {
		ColoredPointAD[] cptArray = new ColoredPointAD[1];
		
		cptArray[0] = new ColoredPointAD(10, 20, 5);
		PointAD[] ptArray = cptArray;
		
		System.out.println(ptArray[0].getX()); // Output: 10
		System.out.println(ptArray[0].getY()); // Output: 20
		
		// System.out.println(ptArray[0].getColor()); // Illegal
		if (ptArray instanceof ColoredPointAD[]) {
			ColoredPointAD cp = (ColoredPointAD) ptArray[0];
			System.out.println(cp.getColor());
		}
	}
}
