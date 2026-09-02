package DSAleetcode;

public class Dsa {
  public static void main(String[] args) {
    int [] arr = {12, 23, 50, 67,20};

    int largest = arr[0];

    for(int i = 1; i < arr.length; i++) {

      if(arr[i] > largest) {
        largest = arr[i];
      }

    }

    System.out.println(largest);
  }
}
