public class MagicMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] sihirliKare = new int[n][n];

        int i = 1;
        int x = 0, y = n/2;

        do {

            sihirliKare[x][y] = i;

            if(i % n == 0){
                x++; if(x == n) x = 0;
            }else {
                x -= 1; if(x < 0) x = n - 1;
                y += 1; if(y == n) y = 0;
            }

            i++;

        }while (i <= n*n);

        for(int[] row: sihirliKare){
            for(int col: row){

                System.out.printf("%3d",col);

            }

            System.out.println();
        }
    }
}
