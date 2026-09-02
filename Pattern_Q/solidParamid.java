package Pattern_Q;

public class solidParamid {
  public static void main(String[] args) {
    int n = 4;

    for (int row = 1; row <= n; row++) {

      for (int s = 1; s <= row - 1; s++) {  // spaces
        System.out.print("  ");
      }

      for (int col = 1; col <= 2*n-2*row+1; col++) {
        System.out.print("* ");
      }

      System.out.println();

    }
  }
  
}
