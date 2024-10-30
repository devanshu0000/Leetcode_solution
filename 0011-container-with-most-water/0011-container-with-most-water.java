class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int c=0;
        while(left<right){
            int min=Math.min(height[left],height[right]);
            c=Math.max(c,(min*(right-left)));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }


        }
        return c;
        
    }
}