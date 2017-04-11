package Less06;

public class Main {
    public static void main(String[] args) {

        long start_time = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder("fdf");
        for (int i = 0; i < 30000; i++) {
            stringBuilder.append(i);

        }


//        }String s = "cc";
//        for (int i = 0; i < 30000; i++) {
//            s = s + i;
//
//        }
  long current_start_time= System.nanoTime();
        float msec = (current_start_time - start_time) * 0.000001f;

        System.out.println(msec);
    }

}
