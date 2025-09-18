package ex05ArraysMediumsRevision;

import java.util.Arrays;

public class Ex10RotateImage {

	public static void main(String[] args) {
		
		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate(matrix);
		
	}

	private static void rotate(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int [][] temp = new int[m][n];
		
		int x = n-1;
		int y = 0;
		for(int i = 0; i < m; i++) {
			
			for(int j = 0; j <n;j++) {
				temp[y][x] = matrix[i][j];
				y++;
			}
			y=0;
			x--;
		}
		
		
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j< n; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
		
	}

}
