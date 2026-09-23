public class shiftByFirstPosition {

  static void shiftBy1(int[] arr) {
    int n = arr.length;
    int temp = arr[n-1];

    for(int i= n-1; i > 0; i--) {
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
  }


  static void main() {
    int arr[] = {1, 3, 5, 6,9};

    shiftBy1(arr);

    for(int a : arr){
      System.out.print(a + " ");
    }

    System.out.println();
      
  }
  
}
