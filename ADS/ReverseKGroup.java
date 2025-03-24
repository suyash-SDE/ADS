public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        
        // Check if there are at least k nodes left
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        
        if (count == k) {
            // Reverse first k nodes
            ListNode prev = reverseKGroup(curr, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
            head = prev;
        }
        return head;
    }
}
