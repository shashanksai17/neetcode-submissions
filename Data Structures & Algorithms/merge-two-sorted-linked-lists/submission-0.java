/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      

        List<Integer>a=new ArrayList<>();
        while(list1!=null){
            a.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            a.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(a);
        if(a.size()==0)return null;
          ListNode temp=null;
        temp=new ListNode(a.get(0));
        ListNode ans=temp;
        for(int i=1;i<a.size();i++){
           temp.next=new ListNode(a.get(i));
           temp=temp.next;
        }
        return ans;



    }
}