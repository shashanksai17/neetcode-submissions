class Solution {
    public int find(int nums[],int idx,int dp[]){
        if(idx>=nums.length){
            return 0;
        }
        if(dp[idx]!=-1)return dp[idx];
        int pick=0;
        pick=nums[idx]+find(nums,idx+2,dp);
        int notpick=0;
        notpick=find(nums,idx+1,dp);
        return dp[idx]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums,0,dp);
    }
}
