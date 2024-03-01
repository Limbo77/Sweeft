package ThirdTask;

import java.util.LinkedList;

public class ReversedLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        while(current != null){
            ListNode next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }
}
