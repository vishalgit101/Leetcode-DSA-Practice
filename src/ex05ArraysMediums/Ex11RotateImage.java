package ex05ArraysMediums;

import java.util.Arrays;

public class Ex11RotateImage {

	public static void main(String[] args) {
		
		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		rotate(matrix);

	}
	
	// Brute force approach... with extra space
	public static void rotate(int [] [] matrix) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		int[] [] arr = new int[m][n];
		
		
		int x = 0;
		int y = n-1;
		for(int i = 0; i < m ; i++) {
			
			for(int j = 0; j < n; j++) {
				arr[x][y] = matrix[i][j];
				x++;
			}
			x=0;
			y--;
			
			//System.out.println(Arrays.deepToString(arr));
		}
		
		//System.out.println(Arrays.deepToString(arr));
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = arr[i][j];
			}
		}
		
		//System.out.println(Arrays.deepToString(matrix));
		
	}

}
