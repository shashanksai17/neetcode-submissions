class Solution {
    public void reverseString(char[] s) {
        StringBuilder br=new StringBuilder(new String(s));
        br.reverse();
        for(int i=0;i<br.length();i++){
            s[i]=br.charAt(i);
        }
        return;
    }
}