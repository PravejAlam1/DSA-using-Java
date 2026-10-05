public class getPosAndNeg {

  static int[] getPosAndNegNumber(int arr[]) {
    int posSum = 0;
    int negSum = 0;

    for(int i = 0; i < arr.length; i++) {
      if(arr[i] > 0) {
        posSum = posSum + arr[i];
      } else {
        negSum = negSum+ arr[i];
      }
    }

    int ans[] = {posSum, negSum};
    return ans;

  }

  static void main() {
      int arr[] = {2, -3, -5, -7, 8, 9};

      int ans[] = getPosAndNegNumber(arr);

      System.out.println("Positive  Number " + ans[0]);
      System.out.println("Negetive  Number " + ans[1]);

      
  }
  
}
