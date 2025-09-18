package ex05ArraysMediumsRevision;

import java.util.Arrays;

public class Ex09SetMatrixZeros {

	public static void main(String[] args) {
		
		int [] [] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		
		System.out.println(Arrays.deepToString(matrix));
		
		setZeros(matrix);
		
		System.out.println(Arrays.deepToString(matrix));

	}

	private static void setZeros(int[][] matrix) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int [][] temp = new int[m][n];
		
		for(int i = 0; i < m;i++) {
			
			for(int j = 0; j< n; j++) {
				
				if(matrix[i][j] == 0) {
					markRows(matrix, i);
					markCols(matrix, j);
				}

			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;j++) {
				if(matrix[i][j] == -1) {
					matrix[i][j] = 0;
				}
			}
		}
		
	}
	
	public static void markRows(int[][] matrix, int i ) {
		for(int j = 0; j< matrix.length; j++) {
			matrix[i][j] = -1;
		}
	}
	
	public static void markCols(int[][] matrix, int j) {
		for(int i = 0; i< matrix.length; i++) {
			matrix[i][j] = -1;
		}
	}

}
