import java.util.Scanner;

public class PrintTheNumberWithItsPronunciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] numbers = {{"1", "yüz", " on", " bir"},
                {"2", "iki yüz", " yirmi", " iki"},
                {"3", "üç yüz", " otuz", " üç"},
                {"4", "dört yüz", " kırk", " dört"},
                {"5", "beş yüz", " elli", " beş"},
                {"6", "altı yüz", " altmış", " altı"},
                {"7", "yedi yüz", " yetmiş", " yedi"},
                {"8", "sekiz yüz", " seksen", " sekiz"},
                {"9", "dokuz yüz", " doksan", " dokuz"}};

        System.out.print("Sayı giriniz: ");
        String gelenSayi = input.next();

        String okunus = "";

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                if(gelenSayi.substring(0,1).equals(numbers[i][0])){
                    okunus += numbers[i][1];
                    break;
                }
            }
        }

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                if(gelenSayi.substring(1,2).equals(numbers[i][0])){
                    okunus += numbers[i][2];
                    break;
                }
            }
        }

        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers[i].length; j++){

                if(gelenSayi.substring(2,3).equals(numbers[i][0])){
                    okunus += numbers[i][3];
                    break;
                }
            }
        }

        System.out.println(okunus);
    }
}
