class Solution {
    public void moveZeroes(int[] nums) {
      int n=nums.length;
      int j=0;
      for(int i=0;i<n;i++){
        if(nums[i]==0){
            j=i;
            while(j<n && nums[j]==0){
                if(nums[j]!=0){
                    break;
                }
                j++;
            }
            if(j<n){
            nums[i]=nums[j];
            nums[j]=0;
            }
        }
      }
        
    }
}