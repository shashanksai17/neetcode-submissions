class Solution {
    public int numUniqueEmails(String[] emails) {
       Set<String>res=new HashSet<>();
       for(String i:emails){
        String arr[]=i.split("@");
        String name=arr[0];
        String domain=arr[1];
            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));
            }

        name=name.replace(".","");
        res.add(name+"@"+domain);
       }
       return res.size();
    }
}