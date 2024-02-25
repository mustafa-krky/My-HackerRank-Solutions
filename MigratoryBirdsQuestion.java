import java.util.ArrayList;
import java.util.Arrays;

public class MigratoryBirdsQuestion {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 2, 4));

        int temp;
        int counter;
        int enCokOlanAdedi = 0;
        int enCokOlanKusTuru = 0;

        for (int i = 0; i < arr.size(); i++) {

            temp = arr.get(i);
            counter = 1;

            for (int k = i + 1; k < arr.size(); k++) {

                if (temp == arr.get(k)) {
                    counter++;
                }
            }

            if (enCokOlanAdedi < counter) {
                enCokOlanAdedi = counter;
                enCokOlanKusTuru = temp;
            }

        }

        System.out.println("En çok olan kuş türü: " + enCokOlanKusTuru);
    }
}
