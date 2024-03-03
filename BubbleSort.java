public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSort = {3, 5, 4, 7, 1, 10, 31, 42, 0};
        int temp;

        for (int k = 1; k < bubbleSort.length; k++) {

            for (int i = 0; i < bubbleSort.length - k; i++) {

                temp = bubbleSort[i];

                if (bubbleSort[i] > bubbleSort[i + 1]) {
                    bubbleSort[i] = bubbleSort[i + 1];
                    bubbleSort[i + 1] = temp;
                }

            }
        }

        System.out.print("[");
        for (int number : bubbleSort) {
            System.out.print(number + " ");
        }
        System.out.print("]");
    }
}
