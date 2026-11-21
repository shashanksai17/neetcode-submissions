class Solution {
    public void find(int nums[],int i,int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        find(nums,0,nums.length-k-1);
        find(nums,nums.length-k,nums.length-1);
        find(nums,0,nums.length-1);

       return ;
    }

}