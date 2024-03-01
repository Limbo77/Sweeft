package FourthTask;

import java.util.HashMap;
import java.util.Map;

public class Intersection {
    public static int[] findIntersection(int[] nums1, int[] nums2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        for(int num : nums2){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        int count = 0;
        for(int num : map.values()){
            if(num > 1) count++;
        }
        int[] ans = new int[count];
        int i = 0;
        for(int num : map.keySet()){
            if(map.get(num) > 1) ans[i++] = num;
        }
        return ans;
    }
}
