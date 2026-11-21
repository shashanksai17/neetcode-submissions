class Solution {
    int sum=0;
    public void find(int nums[],int idx,int check){
        if(idx==nums.length){
            sum+=check;
            return ;
        }
         find(nums,idx+1,check^nums[idx]) ;
         find(nums,idx+1,check);
    }
    public int subsetXORSum(int[] nums) {
        int ans=0;
       find(nums,0,0);
        return sum;
    }
}