import java.util.Arrays;
import java.util.Random;

/**
 * The class Task
 */
public class Task {

    /**
     *
     * It is a constructor.
     *
     * @param n  the n - column length.
     * @param m  the m. - row length
     */
    public Task(int n, int m) {

        int[][] array1 = new int[n][m];
        Random random = new Random();
        array1 = Arrays.stream(array1)
                .map(row -> Arrays.stream(row)
                        .map(item -> random.nextInt(0, 100))
                        .toArray()).toArray(int[][]::new);
        array = array1;
    }

    private final int[][] array;


    /**
     *
     * Output array
     * This function for printing array on screen.
     *
     */
    private void OutputArray(){
        for (int[] row : array){
            System.out.println(Arrays.toString(row));
        }
    }


    /**
     *
     * Public function ReplaceRow
     * This function is finding max sum in rows.
     */
    public void MaxSumInRow(){
        OutputArray();
        int[] sums = new int[array.length];
        int i = 0;
        for (int[] row : array){
            System.out.println("Row["+(i+1)+"] - "+Arrays.stream(row).sum());
            sums[i]=Arrays.stream(row).sum();
            i++;
        }
        System.out.println("Max sum of row: " + Arrays.stream(sums).max().getAsInt());
    }
}