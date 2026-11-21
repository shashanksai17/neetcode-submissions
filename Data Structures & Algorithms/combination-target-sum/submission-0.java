class Solution {
    Set<List<Integer>>res=new HashSet<>();
    public void find(int nums[],int target,int idx,List<Integer>temp){
        if(target==0){
            res.add(new ArrayList<>(temp));
        }
        if(target<0 || idx>=nums.length){
            return;
        }

        temp.add(nums[idx]);
        find(nums,target-nums[idx],idx,temp);
        temp.remove(temp.size()-1);
        find(nums,target,idx+1,temp);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        find(nums,target,0,new ArrayList<>());
        return  new ArrayList<>(res);
    }
}
