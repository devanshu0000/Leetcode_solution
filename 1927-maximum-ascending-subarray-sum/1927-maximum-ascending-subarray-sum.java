class Solution {
    public int maxAscendingSum(int[] nums) {
        int temp=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                temp+=nums[i];
            }
            else{
                temp=nums[i];
            }
            maxsum=Math.max(maxsum,temp);
        }
        return maxsum;
    }
}