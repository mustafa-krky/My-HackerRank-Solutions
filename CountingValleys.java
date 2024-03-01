public class CountingValleys {
    public static void main(String[] args) {

        String path = "DUUDUD";
        char[] steps = path.toCharArray();
        int level = 0;
        int valley = 0;
        int previousStep;

        for(char step: steps){

            previousStep = level;

            if(step == 'D'){
                level--;
            }else {
                level++;
            }

            if(level == 0 && previousStep < 0){
                valley++;
            }
        }

        System.out.println("Number of valleys crossed: "+valley);
    }
}