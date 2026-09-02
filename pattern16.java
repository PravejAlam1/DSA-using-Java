public class pattern16 {

  public static void main(String args[]) {
  //  int n = 4; // first pattern
  int n = 5;// second pattern

   for(int row =1; row <= n; row++) {
    

    for(int s = 1; s <= n - row; s++) { 
       System.out.print(" ");
     }

     for(int star = 1; star <= row + row - 1; star++) { // second star formula = 2*row - 1
       System.out.print("*");
     }

     System.out.println();
    }
  
  }

  
}
