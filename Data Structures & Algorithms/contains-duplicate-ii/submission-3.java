class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        
        int i=0,j=1;
        int n=nums.length;
        map.put(nums[0],1);
        if(k==0 || n==1)return false;
        while(j<n){
            while(j-i>k){
                if(map.containsKey(nums[i])){
                    if(map.get(nums[i])==1){
                        map.remove(nums[i]);
                    }
                    else
                    {
                        map.put(nums[i],map.get(nums[i])-1);
                    }
                }
                i++;
            }
             if(map.containsKey(nums[j]))return true;
            else{
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
            j++;
        }
        return false;
    }
}