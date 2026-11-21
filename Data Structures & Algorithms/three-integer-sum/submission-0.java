class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Set<List<Integer>>sol=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Map<Integer,Integer>map=new HashMap<>();
            List<Integer>temp=new ArrayList<>();
            for(int j=i+1;j<n;j++){
                int  sum=-(nums[i]+nums[j]);
                if(map.containsKey(sum)){
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(sum);
                    Collections.sort(temp);
                    sol.add(new ArrayList<>(temp));
                    temp=new ArrayList<>();
                }
                else{
                    map.put(nums[j],1);
                }
            }
        }
        return new ArrayList<>(sol);
    }
}
