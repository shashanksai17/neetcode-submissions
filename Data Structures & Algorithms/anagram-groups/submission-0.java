class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
             char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String temp=new String(arr);
              map.put(temp,new ArrayList<>());
        }
       
            for(int j=0;j<strs.length;j++){
                char a[]=strs[j].toCharArray();
                Arrays.sort(a);

               map.get(new String(a)).add(strs[j]);
            
        }
        for(String i:map.keySet()){
            res.add(map.get(i));
        }
        return res;
    }
}
