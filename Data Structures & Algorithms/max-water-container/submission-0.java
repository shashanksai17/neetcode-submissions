class Solution {
    public int maxArea(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        int max=0;
        while(i<j)
        {
            max=Math.max(max,Math.min(nums[i],nums[j])*(j-i));
            if(nums[i]>nums[j]){
               j--;
            }
            else if(nums[i]<=nums[j]){
               i++;
            }
        }
        return max;
    }
}
