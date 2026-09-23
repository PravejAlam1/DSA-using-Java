public class maxNumber {

  static int getMaximum(int arr[]) {
    int max = arr[0];

    for(int i = 0; i<arr.length; i++) {
      if(arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  static void main() {
      int[] arr = {3, 4, 7, 2, 6, 9, 3};
      System.out.println(getMaximum(arr));
  }
  
}
