package ex05ArraysMediums;
import java.util.*;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    public static List<List<Integer>> pascal(int numRows){
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numRows; i++){

             ArrayList<Integer> current = new ArrayList<>();

            for(int j = 0; j<=i; j++ ){

                if(j == 0){
                    current.add(1);
                }else if(j<i &&  j != 0){
                    List<Integer> prev = list.get(i-1);
                   int num = prev.get(j-1) + prev.get(j);
                   current.add(num);
                }else{ // i == j
                    current.add(1);
                }
            }
            list.add(current);
        }
        return list;
    }

}
