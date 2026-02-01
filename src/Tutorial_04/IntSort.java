package Tutorial_04;

import java.util.Arrays;

public class IntSort {

    protected String name;
    protected int[] array;
    protected int[] sortedArray;

    public IntSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        sortedArray = array.clone();
        Arrays.sort(sortedArray);
    }

    public boolean isSorted() {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] > sortedArray[i + 1]) ;
            return false;
        }
        return true;
    }

    public String toString() {
        return Arrays.toString(sortedArray);
    }
}

