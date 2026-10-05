
//Ques:-  Print the Sum of Each Column in a 2D Array

import java.util.ArrayList;
import java.util.List;

public class TwoDarrayDay21 {

  public List<Integer> columnSum(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    int m = matrix.length;    
    int n = matrix.length;

    for(int c = 0; c < n; c++) {
      int sum = 0;

      for(int r =0; r <m; r++) {
        int value = matrix[r][c];

        sum = sum + value;
      }
      result.add(sum);
    }
    return result;

  }


  
}
