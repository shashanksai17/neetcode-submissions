class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int j=0,i=0;
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        while(j<n){
            while(j-i+1>k){
                i++;
            }
       if(j-i+1==k) ans=Math.min(ans,nums[j]-nums[i]);
            j++;
        }
        return ans;
    }
}