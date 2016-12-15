/**
Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column is set to 0.

**/

public class SetAllElementsOfAMatrixToZero {
	public static void main(String[] args) {
		int M[][] = new int[][] { { 0, 1, 1, 0 }, { 1, 1, 1, 0 },
				{ 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		setZero(M);
	}

	public static void setZero(int[][] Matrix) {
		// 1 2 3---------------Matrix[0]
		boolean row[] = new boolean[Matrix.length];
		boolean column[] = new boolean[Matrix[0].length];
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				if (Matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[i].length; j++) {
				if (row[i] || column[j]) {
					Matrix[i][j] = 0;
					System.out.println(Matrix[i][j]);
				}
			}
		}
	}
}
