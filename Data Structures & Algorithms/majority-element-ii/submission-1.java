class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int check=nums.length/3;
        for(int i:map.keySet()){
            if(map.get(i)>check){
                res.add(i);
            }
        }
        return res;
    }
}