import FirstTask.StrExpEval;
import SecondTask.HappyString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Test Case for FirstTask
        /*
        String exp = "3 + 4 * 2";
        System.out.println(StrExpEval.evaluateExpression(exp));
        */


        //Test Case For SecondTask
        List<String> list = new ArrayList<>();
        list.add("abbcc");
        list.add("abc");
        list.add("abcabc");
        list.add("cabcbb");
        System.out.println(HappyString.numberOfHappyStrings(list));
    }
}