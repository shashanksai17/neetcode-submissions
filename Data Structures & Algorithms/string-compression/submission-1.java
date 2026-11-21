class Solution {
    public int compress(char[] chars) {
        String s="";
        int n=chars.length;
        int i=0,j=0;
        while(i<n &&j<n && i<=j){
            while(i<n &&j<n &&chars[i]==chars[j]){
                j++;
            }
            if(j-i==1){
                s+=chars[i];
            }
            else{
            s+=chars[i]+""+(j-i);
            }
            i=j;
        }
        System.out.println(s);
        char a[]=s.toCharArray();
        int idx=0;
        for(char ch:a){
            if(idx==n){
                break;
            }
            chars[idx]=ch;
            idx++;
        }
        return idx;
    }
}