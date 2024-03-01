package FifthTask;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static int lenOfLongSubarr(int[] array, int k){
        int[][] dp = new int[array.length + 1][k + 1];

        for (int i = 0; i <= array.length; i++) {
            dp[i][0] = 0;
        }

        for (int i = 1; i <= array.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (array[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], 1 + dp[i - 1][j - array[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[array.length][k];
    }

}

