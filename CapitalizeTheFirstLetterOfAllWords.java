public class CapitalizeTheFirstLetterOfAllWords {
    public static void main(String[] args) {
        String metin = "vErilEn bir meTnin tüM KelimElerinin İlk harfleri BüYük DiğEr HArfleri KÜÇük " +
                "OlaCak Şekilde DüzEnleYiniz";

        boolean isSpace = true;

        String harf;
        StringBuilder yeniMetin = new StringBuilder();

        for(int i = 0; i < metin.length(); i++){

            harf = metin.substring(i, i+1);

            if(isSpace){
                harf = harf.toUpperCase();
            }else {
                harf = harf.toLowerCase();
            }

            if(harf.equals(" ")){
                isSpace = true;
            }else {
                isSpace = false;
            }

            yeniMetin.append(harf);
        }

        System.out.println(yeniMetin);
    }
}
