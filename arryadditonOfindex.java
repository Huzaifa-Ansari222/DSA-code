/*
Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]*/
public class arryadditonOfindex {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        twoSum(nums,target);
       // System.out.println(ans);
    }

    static void twoSum(int[] nums, int target) {
        int i,j;
        for (i = 0; i <nums.length; i++) {
            for ( j = 0; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}