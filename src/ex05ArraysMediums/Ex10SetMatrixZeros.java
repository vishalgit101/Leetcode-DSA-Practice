package ex05ArraysMediums;

import java.util.Arrays;

public class Ex10SetMatrixZeros {
	//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's
	public static void main(String[] args) {
		int [] [] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		
		System.out.println(Arrays.deepToString(matrix));
		
		setZeros(matrix);
		
		System.out.println(Arrays.deepToString(matrix));
	}
	
	// Do the Optimal Later as I'm currently tired.
	
	// Brute force...
	// First Mark the row and columns as -1 where zero occur. Except for the places which are zeros already...
	public static void setZeros(int[][] matrix) {
		// m * n 
		// Row * Columns..
		int m = matrix.length;
		int n = matrix[0].length;
		
		for(int i = 0; i < m; i++) {
			
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					markRows(i, n, matrix);
					markColumns(j,m,matrix);
				}
			}
				
		}
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++) {
				if(matrix[i][j]== -1) {
					matrix[i][j] = 0;
				}
			}
		}
			
}
	public static void markRows(int i, int n, int[][] matrix) {
		// iterate over columns...
		for(int j = 0; j<n; j++) {
			
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}
	
	public static void markColumns(int j, int m, int[][] matrix) {
		// iterate over rows...
		for(int i = 0; i< m; i++) {
			if(matrix[i][j] != 0) {
				matrix[i][j] = -1;
			}
		}
	}

}
