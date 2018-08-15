public class QuickSort {
    // select a pivot (any element in list)
    // divide array into two parts
    // first partition less than equal than pivot
    // second partition greater than equal to pivot
    // recursively apply selection pivot and dividing
    public void quickSort(int[] list) {
        quickSort(list, 0 , list.length-1);
    }

    public void quickSort(int[] list, int first , int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex-1);
            quickSort(list, pivotIndex+1, last);
        }
    }

    private int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first+1;
        int high = last;
        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low<=high && list[high] > pivot) {
                high--;
            }
            if (high> low) {
                swap(list, high, low);
            }
        }
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }

    private void swap(int array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}