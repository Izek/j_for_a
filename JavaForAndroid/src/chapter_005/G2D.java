package chapter_005;

public class G2D {

	/*
	 * private Matrix xform;
	 * 
	 * public G2D() { xform = new Matrix(); xform.a = 1.0; xform.e = 1.0;
	 * xform.i = 1.0; }
	 * 
	 * private class Matrix { double a, b, c; double d, e, f; double g, h, i; }
	 */

	class Matrix {
		private int size;

		private double[][] xform;

		public Matrix() {

			size = 3;

			xform = new double[size][size];

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (i == j) {
						xform[i][j] = 1.0D;
					} else {
						xform[i][j] = 0.0D;
					}
				}
			}
		}

		public Matrix(int s) {
			this.size = s;

			xform = new double[size][size];

			for (int i = 0; i < s; i++) {
				for (int j = 0; j < s; j++) {
					if (i == j) {
						xform[i][j] = 1.0D;
					} else {
						xform[i][j] = 0.0D;
					}
				}
			}
		}

		public int getMatrixSize() {
			return size;
		}

		public void displayMatrix() {

			System.out.println("Displaying matrix which has "
					+ this.getMatrixSize() + " elements...");

			for (int i = 0; i < size; i++) {
				System.out.print(" +");
				for (int k = 0; k < size; k++) {
					System.out.print("-----+");
				}

				System.out.println();

				System.out.print(" | ");
				for (int j = 0; j < size; j++) {
					System.out.print(xform[i][j] + " | ");
				}
				System.out.println();
			}

			System.out.print(" +");
			for (int k = 0; k < size; k++) {
				System.out.print("-----+");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		G2D c = new G2D();

		Matrix m = c.new Matrix();
		m.displayMatrix();
		System.out.println();

		Matrix l = c.new Matrix(5);
		l.displayMatrix();
		System.out.println();

		Matrix k = c.new Matrix(10);
		k.displayMatrix();
		System.out.println();
	}

}
