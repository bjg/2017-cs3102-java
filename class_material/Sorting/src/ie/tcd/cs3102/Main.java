package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] unsorted = new int[]{3, 7, 1, 8, 4, 2, 10, 9, 11, 21, 14, 56};

        sort(unsorted);
        for (int n: unsorted) {
            System.out.println(n);
        }
    }

    static void sort(int[] unsorted) {
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

    static int findMinIndex(int[] numbers, int startIndex, int minIndex)
            throws Exception {
        if (startIndex >= numbers.length || minIndex >= numbers.length) {
            throw new ArrayIndexOutOfBoundsException("startIndex=" + startIndex);
        }

        for (int i = startIndex; i < numbers.length; i += 1) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }
}
