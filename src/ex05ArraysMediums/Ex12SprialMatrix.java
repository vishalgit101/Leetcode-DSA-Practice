package ex05ArraysMediums;

import java.util.ArrayList;
import java.util.List;

public class Ex12SprialMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(spiral(matrix));

	}
	
	// Now for any type of grid...
	public static List<Integer> spriral3(int[][] matrix){
		int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> arr = new ArrayList<>();

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        
        while(top <=bottom && left <= right) {

	        for(int i = left; i <= right; i++) {
	        	arr.add(matrix[top][i]);
	        }
	        
	        top ++;
	        
	        for(int i = top; i <= bottom; i++) {
	        	arr.add(matrix[i][right]);
	        }
	        
	        right--;
	        
	     // check boundaries again (in case of single row/col left)
	        if (top <= bottom) {
	            // ← bottom row
	            for (int i = right; i >= left; i--) {
	                arr.add(matrix[bottom][i]);
	            }
	            bottom--;
	        }
	        
	        if (left <= right) {
	            // ↑ left col
	            for (int i = bottom; i >= top; i--) {
	                arr.add(matrix[i][left]);
	            }
	            left++;
	        }
        }
        
        return arr;
		
	}
	
	// With Multiple for loops...
    public static List<Integer> spiral2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> arr = new ArrayList<>();

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        // instead of hardcoding multiple "layers", loop until we cover all
        while (top <= bottom && left <= right) {
            // -->
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;

            // ↓
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            // <--
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // ↑
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
	
	// With Multiple for loops...
    // would only work with matrix/grid where m is odd
	public static List<Integer> spiral(int [] [] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		
		//int[][] arr = new int[m][n];
		List<Integer> arr = new ArrayList<>();
		
		// -->
		for(int i = 0; i< n; i++) {
			int num = matrix[0][i];
			arr.add(num);
		}
		
		for(int i = 1; i < m; i++) {
			int num = matrix[i][n-1];
			arr.add(num);
		}
		
		for(int i = n-1-1; i >= 0; i--) {
			int num = matrix[m-1][i];
			arr.add(num);
		}
		
		// Now go up till m/2
		for(int i = m-1-1; i >= m/2; i--) {
			int num = matrix[i][0];
			arr.add(num);
		}
		
		for(int i = 1; i < n-1; i++) {
			int num = matrix[m/2][i];
			arr.add(num);
		}
		
		return arr;
	}

}
