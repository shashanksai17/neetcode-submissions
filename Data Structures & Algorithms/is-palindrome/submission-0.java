class Solution {
    public boolean isPalindrome(String s) {
      String m="";
      for(char i:s.toCharArray()){
        if(i==' ')continue;
        if(i>='A' && i<='Z'){
            m+=Character.toLowerCase(i);
        }
        else if(Character.isDigit(i)||(i>='a' && i<='z')){
            m+=i;
        }
      }
      System.out.println(m);
      StringBuilder br=new StringBuilder(m);
      if(br.reverse().toString().equals(m)){
        return true;
      }
      return false;
    }
}
