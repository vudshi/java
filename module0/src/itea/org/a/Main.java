package itea.org.a;

/**
 * Created by lsm on 11.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Constructor A");
        new A();
        System.out.println("");
        System.out.println("Constructor B");
        new B('<', '>');
        System.out.println("");
        System.out.println("Constructor C");
        new C();
        System.out.println("");
        System.out.println("Constructor D");
        new D('<', '>');
        System.out.println("");
        System.out.println("*************");
    }

}
