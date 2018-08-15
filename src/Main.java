public class Main {

    public static void main(String[] args) {
        // create array
        int arr[] = new int[] {2, 4, 7, 10, 11};
        // print arr
        for (int a  : arr) {
            System.out.print(a+ " ");
        }

                    /* ~~ Searching ~~ */
        /* Linear Search */

        LinearSearch ls = new LinearSearch();
        System.out.println("\n~~~~~LinearSearch~~~~~");
        System.out.println("Index of 7: ");
        System.out.println(ls.search(arr, arr.length, 7));

        /* Binary Search */
        System.out.println("~~~~~BinarySearch~~~~~");
        BinarySearch bs = new BinarySearch();
        System.out.println("Index of 11: ");
        System.out.println(bs.search(arr, arr.length, 11));

                    /* ~~ Sorting ~~ */
        System.out.println("~~~~~ Sorting ~~~~~");
        int unorderedArr[] = new int[] { 2, 9, 5, 4, 8, 1, 6 };
        int[] arr3 = new int[unorderedArr.length];
        System.arraycopy( unorderedArr, 0, arr3, 0, unorderedArr.length );
        /* Selection Sort */
        System.out.println("~~~~~SelectionSort~~~~~");
        SelectionSort ss = new SelectionSort();
        // Print unordered
        System.out.println("Unordered Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        ss.sortAscending(arr3);
        // print ordered
        System.out.println("\nSelection Sorted Ascending Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        // print ordered
        ss.sortDescending(arr3);
        System.out.println("\nSelection Sorted Descending Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        System.out.println("\n~~~~~InsertionSort~~~~~");
        InsertionSort is = new InsertionSort();
        System.arraycopy( unorderedArr, 0, arr3, 0, unorderedArr.length );
        System.out.println("Unordered Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        is.insertionSort(arr3);
        System.out.println("\nInsertionSort Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }

        System.out.println("\n~~~~~BubbleSort~~~~~");
        BubbleSort bubs = new BubbleSort();
        System.arraycopy( unorderedArr, 0, arr3, 0, unorderedArr.length );
        System.out.println("Unordered Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        bubs.bubbleSort(arr3);
        System.out.println("\nBubbleSort Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }

        System.out.println("\n~~~~~QuickSort~~~~~");
        QuickSort quickS = new QuickSort();
        System.arraycopy( unorderedArr, 0, arr3, 0, unorderedArr.length );
        System.out.println("Unordered Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }

        quickS.quickSort(arr3);

        System.out.println("\nQuickSort Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }

        System.out.println("\n~~~~~MergeSort~~~~~");
        System.arraycopy( unorderedArr, 0, arr3, 0, unorderedArr.length );
        MergeSort mms = new MergeSort();
        System.out.println("Unordered Array: ");
        for (int a  : arr3) {
            System.out.print(a+ " ");
        }
        mms.sort(arr3);
        System.out.println("\nMergeSort Array: ");
        for (int a:arr3){
            System.out.print(a+ " ");
        }
    }
}
