package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        final int N =  numbers.length;

        // Operations
        //
        // 1. Random access (i.e. reading at an index)
        //
        // O(N) = 1
        //
        // 2. Search of unsorted (looking for the presence or position of a value)
        //
        // O(N) = N/2
        //
        // 3. Search of sorted (looking for the presence or position of a value)
        //
        // O(N) = log(N)
        //
        // 4. Sorting with selection (in-order place of elements (e.g. ascending order))
        //
        // O(N) = N * N
        //
        // 5. Sorting with merge (in-order place of elements (e.g. ascending order))
        //
        // O(N) = N * log(N)

        System.out.println(
            new SinglyLinkedList()
                .remove(100)
                .push(10)
                .remove(10)
                .push(10)
                .push(20)
                .remove(20)
        );

        System.out.println(
            new SinglyLinkedList()
                .insert(10)
                .insert(20)
                .insert(30)
                .insert(5)
                .insert(15)
                .insert(40)
                .insert(35)
                .insert(0)
        );
    }
}
