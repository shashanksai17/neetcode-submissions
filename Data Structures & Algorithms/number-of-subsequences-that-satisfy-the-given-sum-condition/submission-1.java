class Solution {
    public int numSubseq(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0,j=n-1;
        int mod=1000000007;
        int count=0;
        int pow[]=new int[n];
        pow[0]=1;
        for(int k=1;k<n;k++){
            pow[k] = (int)(((long)pow[k - 1] * 2) % mod);
        }
        while(i<=j){
            while(i<=j&& nums[i]+nums[j]>target){
                j--;
            }
            if(i<=j){
                count=(count+(pow[j-i]))%mod;
                i++;
            }
        }
        return count;
    }
}