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
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp= dummy;
        while(l1!=null && l2!=null){
            if(l1.val< l2.val){
                temp.next = l1;
                l1= l1.next;
                temp = temp.next;
            }
            else {
                temp.next = l2;
                l2 = l2.next ;
                temp= temp.next ;
            }
        }

        if(l1 != null){
            temp.next = l1;
        }
        else if(l2!=null){
            temp.next = l2;
        }
        
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        
               ArrayList<ListNode> LLlist = new ArrayList<>();

               for(int i=0;i<lists.length ;i++){
                    LLlist.add(lists[i]);
               }

               while(LLlist.size()>1){
                 ListNode l1 = LLlist.get(0);
                 ListNode l2 = LLlist.get(1);
                 LLlist.remove(1);
                 LLlist.remove(0);
                 if(l1 == null ){
                    LLlist.add(l2);
                    continue;
                 } 
                 else if (l2 == null){
                    LLlist.add(l1);
                    continue;
                 }
                 else if(l1 == null && l2 == null){
                    continue;
                 }
                 ListNode l3 =mergeTwoLists(l1, l2);
                 LLlist.add(l3);
               }

                // if(LLlist.size()==0){
                //     return null;
                // }
               return LLlist.get(0);

    }
}
