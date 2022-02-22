/*
using one of sorting algorithms (bubble, insertion, selection, merge), create a sort(List<Integer> numbers) method that will return sorted list e.g.
sort([1,5,3,2]) -> [1,2,3,5]
*/

package algorithms;

public class BubbleSort {

    public int[] sort(int[] array) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
//            System.out.println("Iteration " + (i + 1) + ": " + Arrays.toString(array));
        }
        return array;
    }
}
