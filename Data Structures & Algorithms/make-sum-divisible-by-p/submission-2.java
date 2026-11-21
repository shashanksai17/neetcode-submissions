class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        int total=0;
        
        for(int i:nums){
            total+=i;
        }
        if(total%p==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            int sum=0;
          for(int j=i;j<n;j++){
            sum+=nums[j];
          if((total-sum)%p==0){
            ans=Math.min(j-i+1,ans);
          }
          }
        }
        return ans==Integer.MAX_VALUE||ans==n?-1:ans;
    }
}