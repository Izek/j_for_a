package chapter_004;

class Point_002 implements Drawable {
	private int x, y;

	Point_002(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public void draw(int color) {
		System.out.println("Point_002 drawn at " + toString() + " in color "
				+ color);
	}
}

public class Circle_002 extends Point_002 implements Drawable {
	private int radius;

	Circle_002(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "" + radius;
	}

	@Override
	public void draw(int color) {
		System.out.println("Circle_002 drawn at " + super.toString()
				+ " with radius " + toString() + " in color " + color);
	}

	public static void main(String[] args) {
		Drawable[] drawables = new Drawable[] { new Point_002(10, 20),
				new Circle_002(10, 20, 30) };
		for (int i = 0; i < drawables.length; i++)
			drawables[i].draw(Drawable.GREEN);
	}

}
