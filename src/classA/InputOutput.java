package classA;

import java.io.FileInputStream;
import java.util.Scanner;

public class InputOutput {
    private static final String FNAME_OUT = "c:\\pass.txt";

    public static void main(String[] args) {
        System.out.println(FNAME_OUT);
        try {
          //  PrintStream printStream = new PrintStream(FNAME_OUT);

            //            FileOutputStream outputStream = new FileOutputStream(FNAME_OUT,true);
//            outputStream.write(100);
//            printStream.println("hello world");
//            printStream.flush();
//            printStream.close();
//
//            FileInputStream in = new FileInputStream(FNAME_OUT);
//
//
//            int b = in.read();
//            while (b!=-1) {
//                System.out.print(b + " ");
////                b = in.read();
//            }
//in.close();


            Scanner sc = new Scanner(new FileInputStream(FNAME_OUT));
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();




        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
