class Solution {
    public String longestCommonPrefix(String[] strs) {
        String check="";
        int ans=strs[0].length();
        int idx=-1;
        int k=0;
        for(String i:strs){
            if(i.length()<=ans){
                idx=k;
                ans=i.length();
                check=i;
            }
            k++;
        }
        int min=Integer.MAX_VALUE;
        String res=check;
        k=0;
        System.out.println(idx);
        for(String i:strs){
            if(i=="")return "";
            if(idx==k)
            {
                k++;
                continue;
            }
            int a=0,b=0;
            String temp="";
            while(a<i.length() && b<check.length()){
                if(i.charAt(a)==check.charAt(b)){
                    temp+=i.charAt(a);
                }
                else{
                    break;
                }
                a++;
                b++;
            }
            System.out.println(temp);
          
           
                if(res.length()>temp.length()){
                    res=temp;
                }
            
            k++;
        }
        return res;
    }
}