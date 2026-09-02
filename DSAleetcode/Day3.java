//Q-100. Find the maximum and minimum number in an array

package DSAleetcode;

public class Day3 {
  public static void main(String[] args) {
    int [] arr = {12, 23, 50, 67,20,45,99};

    int max = arr[0];
    int min = arr[0];

    for(int i = 1; i < arr.length; i++) {

      if(arr[i] > max) {
        max = arr[i];
      }

      if(arr[i] < min) {
        min = arr[i];
      }

    }

    // System.out.println("Maximum: " + max);  // first check
    // System.out.println("Minimum: " + min);  

    System.out.println( max +" " + min);  // second check 

  }

  
  
}
