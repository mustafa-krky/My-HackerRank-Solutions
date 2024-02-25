import java.util.Scanner;

public class ShapeFromIcons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scan.nextInt();

        String[][] simgeler = new String[n][n];

        for(int i = 0; i < simgeler.length; i++){
            for(int j = 0; j < simgeler[i].length; j++){
                simgeler[i][j] = "   ";

            }
        }

        for(int i = simgeler.length - 1; i >= 0; i--){

            for(int j = (simgeler.length - 1) - i; j < simgeler[i].length; j++){

                simgeler[i][j] = " # ";
            }
        }

        for(String[] col: simgeler){
            for(String row: col){

                System.out.print(row);

            }
            System.out.println();
        }
    }
}
