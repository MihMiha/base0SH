package nachlo;

import java.util.Arrays;

public class TableYmnogeniya {
    public static void main(String[] args) {
        int[] w = {1, 11, 1, 1, 10, 0, 0, 0, 0};
        for (int i = 0; i < w.length; i++) {
            if (w[i] == 1) {
                w[i] = 0;
            } else if (w[i] == 0) {
                w[i] = 9;

            }


        }System.out.println(Arrays.toString(w));
    }
}
