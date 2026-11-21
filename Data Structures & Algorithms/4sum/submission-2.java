class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>res=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Map<Integer,Integer>map=new HashMap<>();
                List<Integer>a=new ArrayList<>();
                for(int k=j+1;k<n;k++){
                    long sum=(long)target-nums[i]-nums[j]-nums[k];
                   if (sum >= Integer.MIN_VALUE &&
    sum <= Integer.MAX_VALUE &&
    map.containsKey((int) sum)){
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        a.add((int)sum);
                        Collections.sort(a);
                        res.add(a);
                        a=new ArrayList<>();
                    }
                    else{
                        map.put(nums[k],1);
                    }
                }
            }
        }
      List<List<Integer>> ans = new ArrayList<>(res);

Collections.sort(ans, (a, b) -> {
    for (int i = 0; i < 4; i++) {
        if (!a.get(i).equals(b.get(i))) {
            return Integer.compare(a.get(i), b.get(i));
        }
    }
    return 0;
});

return ans;
    }
}