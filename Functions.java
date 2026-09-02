
import java.util.Scanner;

public class Functions {

    // public static int calculateSum(int a, int b) {
    //   int sum = a + b;
    //   return sum; // 1 return type is int 
    public static int calculateProduct(int a, int b) {
      return a * b;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // System.out.println("sum of 2 numbers is: " + calculateSum(a, b));
        System.out.println("product of 2 numbers is: " + calculateProduct(a, b));
    }

}
