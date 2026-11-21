class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0,j=0;
        int n1=word.length();
        int n2=abbr.length();
        while(i<n1 && j<n2){
            char ch1=word.charAt(i);
            char ch2=abbr.charAt(j);

            if(Character.isDigit(ch2)){
                String num="";
                int k=j;
                    if(abbr.charAt(k)=='0')return false;
                while(k<n2 && Character.isDigit(abbr.charAt(k))){
                    num+=abbr.charAt(k);
                    k++;
                }
                i+=Integer.parseInt(num+"");
                j=k;
            }
            else if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j++;
            }
        }
        if(i==n1 && j==n2)return true;
        return false;
    }
}