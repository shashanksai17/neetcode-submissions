class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        while(j<n){
            int count=1;
            while(j+1<n && nums[j]==nums[j+1]){
                j++;
                count++;
            }
            for(int k=0;k<Math.min(2,count);k++){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}