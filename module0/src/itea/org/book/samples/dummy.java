package itea.org.book.samples;


/**
 * Created by lsm on 12.05.2017.
 */
public class dummy {
    public static void main(String[] args) {
        int a = 1;
        boolean b = true;
        outer:
        while (true) {
            mark:
            switch (a) {
                case 0:
                    System.out.println("switch 0;");
                    a = 3;
                    //continue mark;
                case 1:
                    System.out.println("switch 1;");
                case 2:
                    System.out.println("switch 2;");
                case 3:
                    System.out.println("switch 3;");
                    break outer;
                default:
                    System.out.println("switch default;");
                    break outer;
            }
        }
    }


}
