package seaBatll;

public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';

        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'x';
    }

    void doShoot(int shoot) {
        switch (cells[shoot]) {
            case '.':
                System.out.println("промах");
                cells[shoot] = '*';
                break;
            case 'x':
                System.out.println("корабль потоплен");
                cells[shoot] = '+';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("стреляли");
                cells[shoot] = '-';
                System.out.println(cells);
                break;
            default:
                System.out.println();
        }
    }

    void show() {
        System.out.print(cells);
    }

  boolean isNotGameOver() {
      return cells[ship.position] == 'x';

    }
}
