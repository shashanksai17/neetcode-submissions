class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public void find(int nums[],int idx,List<Integer>temp){
        if(idx==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        find(nums,idx+1,temp);
        temp.remove(temp.size()-1);
        find(nums,idx+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        find(nums,0,new ArrayList<>());
        return res;
    }
}
