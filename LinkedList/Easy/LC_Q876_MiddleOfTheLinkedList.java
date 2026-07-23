// Optimal approach

class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
       }
       return slow;
    }
}





// Brute Force
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ArrayList<Integer> arr= new ArrayList<>();
//         while(head!=null){
//             arr.add(head.val);
//             head=head.next;
//         }
//         int n=arr.size();
//         ListNode ans= new ListNode();
//         ListNode temp = ans;
//         for(int i=n/2;i<n;i++){
//             temp.next = new ListNode(arr.get(i));
//             temp = temp.next;
//         }
//         return ans;
//     }
// }
