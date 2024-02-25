public class NumberOfPairsOfSocks {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 6, 3, 3, 4, 3, 2, 1, 4, 5};

        int greatestValue = arr[0];

        int numberOfPairs = 0;

        for (int value : arr) {
            if (value > greatestValue) {
                greatestValue = value;
            }
        }

        int[] arr2 = new int[greatestValue + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[arr[i]]++;
        }

        for (int i : arr2) {

            numberOfPairs += i / 2;
        }

        System.out.println("Number of pairs: " + numberOfPairs);
    }
}
