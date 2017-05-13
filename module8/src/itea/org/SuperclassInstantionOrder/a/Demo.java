package itea.org.SuperclassInstantionOrder.a;

/**
 * Created by lsm on 5/10/2017.
 * new D()
 */
public class Demo {
    public static void greet(Class clazz) {
        System.out.print(clazz.getSimpleName());
    }

    public static void greet(Class clazz, char lBdr, char rBdr) {
        System.out.print(lBdr);
        System.out.print(clazz.getSimpleName());
        System.out.print(rBdr);
    }

    /*
    public static void greet(Class clazz) {
        Object obj = new Object();
        Class dummy = clazz;
        System.out.print("[");
        while (!dummy.getSimpleName().equals(obj.getClass().getSimpleName())) {
            System.out.print(dummy.getSimpleName());
            dummy = dummy.getSuperclass();

        }
        System.out.print("]");
    }
    */
}
