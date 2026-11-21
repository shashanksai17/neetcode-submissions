class Solution {
    public int[] findErrorNums(int[] nums) {
       // List<Integer>a=new ArrayList<>();
        Set<Integer>a=new HashSet<>();
        Arrays.sort(nums);
        int res[]=new int[2];
        int k=0;
        for(int i:nums){
            if(a.contains(i)){
                res[k]=i;
                k+=1;
               // res[k++]=i+1;
            }
            a.add(i);
        }
        for(int i=1;i<=nums.length;i++){
           if(!a.contains(i)) {
            res[k]=i;
            break;
           }
        }
        return res;
    }
}