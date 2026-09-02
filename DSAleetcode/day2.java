package DSAleetcode;

public class day2 {
  public static void main(String[] args) {
    int[] arr = {20, 40, 12, 45, 8, 67};

    int smallest = arr[0];

    for(int i = 1; i < arr.length; i++) {
      if(arr[i] < smallest) {
        smallest = arr[i];
      }
    }

    System.out.println(smallest);
  }
  
}
