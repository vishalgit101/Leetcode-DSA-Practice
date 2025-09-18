package ex05ArraysMediumsRevision;

import java.util.ArrayList;
import java.util.List;

public class Ex11SpiralMatrix {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] [] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.println(spiral(matrix));

	}

	private static List<Integer> spiral(int[][] matrix) {
	    int m = matrix.length;
	    int n = matrix[0].length;

	    List<Integer> result = new ArrayList<>();

	    int top = 0, bottom = m - 1;
	    int left = 0, right = n - 1;

	    while (top <= bottom && left <= right) {
	        // Traverse left → right
	        for (int i = left; i <= right; i++) {
	            result.add(matrix[top][i]);
	        }
	        top++;

	        // Traverse top → bottom
	        for (int i = top; i <= bottom; i++) {
	            result.add(matrix[i][right]);
	        }
	        right--;

	        if (top <= bottom) {
	            // Traverse right → left
	            for (int i = right; i >= left; i--) {
	                result.add(matrix[bottom][i]);
	            }
	            bottom--;
	        }

	        if (left <= right) {
	            // Traverse bottom → top
	            for (int i = bottom; i >= top; i--) {
	                result.add(matrix[i][left]);
	            }
	            left++;
	        }
	    }

	    return result;
	}


}
