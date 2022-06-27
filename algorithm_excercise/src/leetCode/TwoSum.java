package leetCode;

public class TwoSum {
  class Solution {
    public int[] twoSum(int[] nums, int target) {
      int[] result = new int[]{};
      for(int i = 0; i<nums.length;i++){
        int second = target - nums[i];
        for(int j = 1; j<nums.length;j++){
          if(second == nums[j]&&i<j){
            result= new int[]{i,j};
            break;
          }
        }
      }
      return result;
    }

  }

}
