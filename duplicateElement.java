public class duplicateElement {
    public static void main(String[] args) {
        int []nums={1,1,1,3,3,4,3,2,4,2};

        boolean ans= containsDuplicate(nums);
        System.out.println(ans);
    }
      static boolean containsDuplicate(int[] nums) {
            for (int i = 0; i <nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) 
                    if (nums[i] == nums[j])
                        return true;


                    else if  (nums[nums.length-1-i] == nums[nums.length-1-j]) return true;
            }
            return false ;
        }

    }


