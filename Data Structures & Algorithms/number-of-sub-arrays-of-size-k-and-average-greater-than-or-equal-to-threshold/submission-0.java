class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int j=0,i=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        while(j<n){
            sum+=nums[j];
            while(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                if(sum/k>=(double)threshold)count++;
            }

            j++;
        }
        return count;
    }
}