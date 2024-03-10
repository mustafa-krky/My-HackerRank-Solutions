public class CircularArrayRotation {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 1, 6};
        int[] queries = {2,3};
        int k = 3;

        int[] regulatedArray = new int[a.length];

        k = k % a.length;
        int selectedElement = a.length - k;

        for(int i = 0; i < a.length; i++){

            if(selectedElement == a.length){
                selectedElement = 0;
            }

            regulatedArray[i] = a[selectedElement];
            selectedElement++;
        }

        System.out.print("[");
        for(int i: regulatedArray){
            System.out.print(i+" ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("[");
        for(int j = 0; j < queries.length; j++){
            int index = queries[j];
            System.out.print(regulatedArray[index]+" ");
        }
        System.out.print("]");
    }
}
