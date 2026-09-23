// //===Linear Search

// public class targetValue {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};
//         int target = 30;

//         int index = -1;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 index = i;
//                 break;
//             }
//         }

//         if (index != -1) {
//             System.out.println("Target found at index: " + index);
//         } else {
//             System.out.println("Target not found");
//         }
//     }
// }



//===Second


public class targetValue {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        int result = findTarget(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }

    public static int findTarget(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}


