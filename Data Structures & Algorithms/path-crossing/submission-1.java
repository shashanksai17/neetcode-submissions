class Solution {
    public boolean isPathCrossing(String path) {
       Set<String> set =new HashSet<>();
       int x=0;
       int y=0;
       set.add(0+"#"+0);
        for(char i:path.toCharArray()){
            if(i=='N'){
                y++;
            }
            else if(i=='S'){
              y--;
            }
            else if(i=='E'){
                x++;
            }
            else{
                x--;
            }
            String str = x+"#"+y;
            if(set.contains(str)){
                return true;
            }
            set.add(str);
        }
        return false;
    }
}