package ThirdTask;
public class ReversedLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedHead;
    }
}
