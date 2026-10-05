public class ZeroAndOne {

  static int[] zeroAndOneCount(int arr[]) {
    int zero = 0;
    int one = 0;

    for (int i = 0; i< arr.length; i++ ) {
      if(arr[i] == 0){
        zero++;
      } else {
        one++;
      }
    }
    int ans[] = {zero, one};

    return ans;
  }

  static void main() {
      int arr[] = {1, 0, 1, 0, 0, 1, 0, 0 };

      int ans[] = zeroAndOneCount(arr);

      System.out.println("Zero count" + ans[0]);
      System.out.println("One count" + ans[1]);
  
      
  }
  
}
