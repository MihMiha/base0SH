package seaBatll;

import java.util.Scanner;

public class Player {
   int getShoot() {
        System.out.println("куда стрелять");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.println("вы ввели \n"+ s);
       int shoot= Integer.parseInt(s);

        return shoot;
    }
}
