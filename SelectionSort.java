public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionSort = {3, 5, 4, 7, 1, 10, 31, 42, 0};
        int smallestElement;
        int locationOfSmallestElement = 0;
        int temp;


        for(int k = 0; k < selectionSort.length; k++){

            smallestElement = selectionSort[k];

            for(int i = k+1; i < selectionSort.length; i++){

                if(selectionSort[i] < smallestElement){
                    smallestElement = selectionSort[i];
                    locationOfSmallestElement = i;
                }
            }

            temp = selectionSort[k];
            selectionSort[k] = selectionSort[locationOfSmallestElement];
            selectionSort[locationOfSmallestElement] = temp;
        }

        System.out.print("[");
        for (int number : selectionSort) {
            System.out.print(number + " ");
        }
        System.out.print("]");
    }
}
