class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int sum=0;
        int n=customers.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum+=customers[i];
            }
        }
        int max=0;
        int extra=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            if(i>=k){
                if(grumpy[i-k]==1)
                extra-=customers[i-k];
            }
            max=Math.max(extra,max);
        }
        return sum+max;

    }
}