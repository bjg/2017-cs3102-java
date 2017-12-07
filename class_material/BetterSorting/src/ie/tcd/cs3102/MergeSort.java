package ie.tcd.cs3102;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by brian on 16/02/2016.
 */
public class MergeSort {
    public static void sort(String[] words) {
        if (words.length <= 1) { return; }

        String[] left = new String[words.length / 2];
        String[] right = new String[words.length - left.length];

        // Copy left and right array segments
        for (int i = 0; i < left.length; i++) {
            left[i] = words[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = words[left.length + i];
        }
        System.err.println(
                "sort=" + Arrays.toString(words) +
                        " left=" + Arrays.toString(left) +
                        " right=" + Arrays.toString(right)
        );

        sort(left);
        sort(right);
        merge(left, right, words);
    }

    private static void merge(String[] left, String[] right, String[] words) {
        int iLeft = 0;
        int iRight = 0;
        int j = 0;

        while (iLeft < left.length && iRight < right.length) {
            if (left[iLeft].compareTo(right[iRight]) < 0) {
                words[j] = left[iLeft++];
            } else {
                words[j] = right[iRight++];
            }
            j++;
        }
        while (iLeft < left.length) {
            words[j++] = left[iLeft++];
        }
        while (iRight < right.length) {
            words[j++] = right[iRight++];
        }
        System.err.println(
                "merged=" + Arrays.toString(words)
        );
    }
}
