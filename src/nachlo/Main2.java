package nachlo;

public class Main2 {
    public static void main(String[] args) {
       char[][] cells;
        cells = new char[3][4];
       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cells[j][i]='.';
            }

        }
        cells[1][1] = 'x';
        cells[2][1] = 'o';
     //   System.out.println(Arrays.deepToString(cells));
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cells[j][i]);
            }
            System.out.println();
        }

    }
}
