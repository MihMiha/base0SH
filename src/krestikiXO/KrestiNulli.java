package krestikiXO;

import java.util.Random;
import java.util.Scanner;

public class KrestiNulli {
    private static final char HUMON_DOT = 'X';
    private static final char PC_DOT = 'O';
    private static final char EMPTY_DOT = '+';
    private static final int MAP_SIZE_Y = 3;
    private static final int MAP_SIZE_X = 3;
    private static final Scanner sc = new Scanner(System.in);
    private static final char[][] map = new char[MAP_SIZE_Y][MAP_SIZE_X];

    private static final Random rand = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {

            humanTrun();
            printMap();

            if (checkWin(HUMON_DOT)) {
                System.out.println("выиграл игрок");
                break;
            }
            if (isMapFull()) {
                System.out.println("ничиья");
                break;
            }
            aiTurn();
            printMap();

            if (checkWin(PC_DOT)) {
                System.out.println("выиграл комп");
                break;
            }

            if (isMapFull()) {
                System.out.println("ничиья");
                break;
            }
        }

    }

    private static void initMap() {//инит полязаполняем его
        for (int i = 0; i < MAP_SIZE_Y; i++) {
            for (int j = 0; j < MAP_SIZE_X; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printMap() {//показать поле
        for (int i = 0; i <= MAP_SIZE_X; i++)
            System.out.print(i + " ");

        System.out.println();
        for (int i = 0; i < MAP_SIZE_Y; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < MAP_SIZE_X; j++) {

                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void aiTurn() {//хот компа
        int x;
        int y;
        do {

            x = rand.nextInt(MAP_SIZE_X);
            y = rand.nextInt(MAP_SIZE_Y);

        } while (!isEmptyCell(x, y));

        map[y][x] = PC_DOT;
    }

    private static boolean isMapFull() { //проверка заполнено ли поле ходами

        for (int i = 0; i < MAP_SIZE_Y; i++) {
            for (int j = 0; j < MAP_SIZE_X; j++) {
                if (map[i][j] == EMPTY_DOT)
                    return false;

            }
        }
        return true;
    }


    private static boolean checkWin(char c) {//проверка на выигрыщь
       //по горизантали
        if (map[0][0] == c && map[0][1] == c && map[0][2] == c ) return true;
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c  ) return true;
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c  ) return true;

       // по вертикали

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c  ) return true;
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c  ) return true;
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c  ) return true;

        //по диоганали
        if (map[0][0] == c && map[1][1] == c && map[2][2] == c  ) return true;
        if (map[2][0] == c && map[1][1] == c && map[0][2] == c  ) return true;


        return false;
    }


    private static void humanTrun() {//хот человека


        int x;
        int y;
        do {
            System.out.println("Введите координаты Х и У");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y) || !isEmptyCell(x, y));

        map[y][x] = HUMON_DOT;
    }

    private static boolean isCellValid(int x, int y) {
        return x >= 0 && x < MAP_SIZE_X && y >= 0 && y < MAP_SIZE_Y;
    }

    private static boolean isEmptyCell(int x, int y) {
        return map[y][x] == EMPTY_DOT;
    }
}
