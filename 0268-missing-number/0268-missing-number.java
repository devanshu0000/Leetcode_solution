class Solution {
  public int missingNumber(int[] nums) {
    int a=nums.length;
    int expected_sum=a*(a+1)/2;
    int actual_sum=0;
    for(int i=0;i<nums.length;i++){
        actual_sum=actual_sum+nums[i];
        
    }
    int ans=expected_sum-actual_sum;
    return ans;
  }
}