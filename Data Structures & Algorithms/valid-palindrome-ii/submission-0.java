class Solution {
    public boolean find(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            String temp="";
            if(i==0){
             temp=s.substring(i+1);
            }
            else{
            temp=s.substring(0,i)+s.substring(i+1);
            }
            if(find(temp))return true;
        }
        return false;
    }
}