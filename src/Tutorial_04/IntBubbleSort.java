package Tutorial_04;

public class IntBubbleSort extends IntSort {

    public IntBubbleSort(int[] array) {
        super(array);
        name = "Bubble Sort";
    }

    public void sort() {
        sortedArray = array.clone();
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
    }
}


