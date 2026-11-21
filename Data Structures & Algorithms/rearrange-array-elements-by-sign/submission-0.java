class Solution {
    public int[] rearrangeArray(int[] nums) {
        int k=1;
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                res[k]=nums[i];
                k+=2;
            }
        }
        k=0;
        for(int i:nums){
            if(i>0){
                res[k]=i;
                k+=2;
            }
        }
        return res;
    }
}