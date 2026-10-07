public class reverseArr {

  static void reverseArray(int arr[]) {
    int n = arr.length;
    int i = 0;
    int j = n -1;

    while(i <= j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      i++;
      j--;
    }

    for(int k : arr) {
    System.out.println(k);
  }

  }

  
  static void main() {
      int arr[] = {2, 4, 5, 6 ,8, 9};

      reverseArray(arr);
  }
  
}
