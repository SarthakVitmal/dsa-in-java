package Arrays;

public class concatenateArrayWithReverse {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] ans = concatWithReverse(nums);
        for(int ele : ans){
            System.out.println(ele);
        }
    }

    private static int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int j = 0;
        for (int num : nums) {
            ans[j++] = num;
        }
        for (int i = nums.length-1; i >= 0; i--) {
            ans[j++] = nums[i];
        }
        return ans;
    }
}
