import FourthTask.Intersection;
import ThirdTask.ListNode;
import ThirdTask.ReversedLinkedList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
public class Main {

    //In this branch, I will be doing the same tasks but with built-in java tools or different solutions
    public static void main(String[] args)  {
        //TestCase for FirstTask
        /*
        String exp = "3 + 4 * 2";
        try{
           FirstTask.evaluateExpression(exp);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
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

        //Test Case For FourthTask
        int nums1[] = new int[]{1,2,3,3,4,5};
        int nums2[] = new int[]{3,4,4,5,6,7};
        int[] arr = Intersection.findIntersection(nums1,nums2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}