class Solution {
    public int find(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer>a=new HashSet<>();
        while(true){
            int sum=find(n);
            if(sum==1)return true;
            if(a.contains(sum))return false;
            a.add(sum);
            n=sum;
        }
        //return false;
    }
}
