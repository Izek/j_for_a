package chapter_004;

interface Drawable {
	int RED = 1;
	// For simplicity, integer constants are used. These constants are
	int GREEN = 2; // not that descriptive, as you will see.
	int BLUE = 3;
	int BLACK = 4;

	// static final int YELLOW = 3;

	void draw(int color);
}
