class Solution {
    int sum=0;
    public void find(int nums[],int idx,int val){
        if(idx==nums.length){
            sum+=val;
            return;
        }
        find(nums,idx+1,val^nums[idx]);
        find(nums,idx+1,val);
    }
    public int subsetXORSum(int[] nums) {
        sum=0;
        find(nums,0,0);
        return sum;    
    }
}