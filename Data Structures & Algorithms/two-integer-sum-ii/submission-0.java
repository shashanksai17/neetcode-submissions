class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res[k++]=i+1;
                    res[k++]=j+1;
                    break;
                }
            }
        }
        return res;
    }
}
