package SecondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HappyString {
    public static int numberOfHappyStrings(List<String> strings){
        if(strings == null) return 0;
        int happyStr = 0;
        for(String s : strings){
            int count=0;
            boolean isHappy = true;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    isHappy = false;
                    break;
                }
            }
            if(isHappy) happyStr++;
        }
        return happyStr;
    }
}
