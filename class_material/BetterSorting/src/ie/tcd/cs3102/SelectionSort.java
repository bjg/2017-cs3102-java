package ie.tcd.cs3102;

public class SelectionSort {
    static void sort(String[] unsorted) {
        // 0. Set ith element to index 0
        // 1. From the ith + 1 element
        // 2. Find the minimum value of the ith and jth element
        // 3. Swap ith and jth indexes
        // 4. Advance i (not greater then len -1 )
        // 5. Goto step 1

        for (int i = 0; i < unsorted.length; i += 1) {
            try {
                int j = findMinIndex(unsorted, i+1, i);
                swap(unsorted, i, j);
            } catch (Exception e) {
                // Do nothing because we are done
                System.err.println(e);
                return;
            }
        }
    }

    static int findMinIndex(String[] words, int startIndex, int minIndex)
            throws Exception {
        if (startIndex >= words.length || minIndex >= words.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex=" + startIndex);
        }

        for (int i = startIndex; i < words.length; i += 1) {
            if (words[i].compareTo(words[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(String[] words, int i, int j) {
        String tmp = words[i];
        words[i] = words[j];
        words[j] = tmp;
    }
}
