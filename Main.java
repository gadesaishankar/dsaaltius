import java.util.*;
public class Main {
    public static int lts(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int len = 0; 
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num; 
            if (i == len) {
                len++;
            }
        }   
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int[] nums = new int[l];
        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Length of Longest Increasing Subsequence:" + lts(nums));
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println("LIS length for [10,9,2,5,3,7,101,18]: " + lts(nums1));
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println("LIS length for [0,1,0,3,2,3]: " + lts(nums2));
        
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println("LIS length for [7,7,7,7,7,7,7]: " + lts(nums3));
    }
} 