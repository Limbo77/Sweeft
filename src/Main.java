import FifthTask.SubArray;
import FirstTask.StrExpEval;
import FourthTask.Intersection;
import SecondTask.HappyString;
import SixthTask.Sequence;
import ThirdTask.ListNode;
import ThirdTask.ReversedLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
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


        //Test Case For FourthTask
        /*
        int nums1[] = new int[]{1,2,3,3,4,5};
        int nums2[] = new int[]{3,4,4,5,6,7};
        int[] arr = Intersection.findIntersection(nums1,nums2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

         */

        //Test Case for FifthTask
        /*
        int[] array = {6, 2, 2, 3, 4, 1};
        int k = 8;
        System.out.println(SubArray.lenOfLongSubarr(array, 8));
        int[] array1 = {6, 2, 2, 3, 4, 1, 1, 1, 1, 1};
        System.out.println(SubArray.lenOfLongSubarr(array1, 8));
        int[] array2 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(SubArray.lenOfLongSubarr(array2, 8));

         */


        //Test Case for SixthTask
        /*
        int[] arr = new int[]{5,1,22,25,6,-1,8,10};
        int[] arr1 = new int[]{1,6,-1,10};
        System.out.println(Sequence.isValidSequence(arr, arr1));
        int[] arr3 = new int[]{5,1,22,25,6,-1,8,10};
        int[] arr4 = new int[]{1,1,6,-1,10};
        System.out.println(Sequence.isValidSequence(arr3, arr4));

         */
    }
}