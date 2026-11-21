class Solution {
    public int[] decrypt(int[] code, int k) {
        int res[]=new int[code.length];
        int n=code.length;
        for(int i=0;i<n;i++){
            int idx=-1;
            int sum=0;
            if(k<0){
                for(int j=i-1;j>=i+k;j--){
                    sum+=code[(n+j)%n];
                }
            }
            else if(k>0){
               for(int j=i+1;j<=i+k;j++){
                sum+=code[j%n];
               }
                
            }
            res[i]=sum;
        }
        return res;
    }
}
