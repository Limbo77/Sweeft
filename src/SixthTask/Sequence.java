package SixthTask;

public class Sequence {
    public static boolean isValidSequence(int[] array, int[] sequence){
        //i - index for arr, j - index for sequence
        int i=0, j=0;
        while (i < array.length && j < sequence.length) {
            if (array[i] == sequence[j]) {
                j++;
            }
            i++;
        }
        return j==sequence.length;
    }
}
