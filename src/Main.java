import FirstTask.StrExpEval;
import SecondTask.HappyString;
import ThirdTask.ListNode;
import ThirdTask.ReversedLinkedList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Main {
    public static void main(String[] args) {
        //Test Case for FirstTask
        /*
        String exp = "3 + 4 * 2";
        System.out.println(StrExpEval.evaluateExpression(exp));
        */


        //Test Case For SecondTask

        /*
        List<String> list = new ArrayList<>();
        list.add("abbcc");
        list.add("abc");
        list.add("abcabc");
        list.add("cabcbb");
        System.out.println(HappyString.numberOfHappyStrings(list));
         */


        //Test Case For ThirdTask
        /*
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));

        ListNode reversed = ReversedLinkedList.reverseList(head);

        assertEquals(5, reversed.getValue());
        assertEquals(4, reversed.getNext().getValue());
        assertEquals(3, reversed.getNext().getNext().getValue());
        assertEquals(2, reversed.getNext().getNext().getNext().getValue());
        assertEquals(1, reversed.getNext().getNext().getNext().getNext().getValue());
        assertNull(reversed.getNext().getNext().getNext().getNext().getNext());

         */

    }
}