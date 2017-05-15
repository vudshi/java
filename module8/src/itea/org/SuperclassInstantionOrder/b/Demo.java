package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 * new D()
 */
public class Demo {
    public static void greet(Class clazz) {
        Class dummy = clazz;
        if (dummy.getSuperclass() != null) {
            if (!dummy.getSimpleName().equals(dummy.getSuperclass().getSimpleName())) {
                greet(clazz.getSuperclass());
                System.out.print(dummy.getSimpleName());
            } else {
                System.out.print(dummy.getSimpleName());
            }
        }
    }

    public static void greet(Class clazz, Class owner, char lBdr, char rBdr) {
        Class dummy = clazz;
        if (!dummy.getSuperclass().getSimpleName().equals(Object.class.getSimpleName())) {
            greet(clazz.getSuperclass(), clazz.getSuperclass(), lBdr, rBdr);
            System.out.print(dummy.getSimpleName());
            if (clazz.getSuperclass().getSimpleName().equals(owner.getSimpleName())) {
                System.out.println(rBdr);
            }
        } else {
            System.out.print(lBdr);
            System.out.print(dummy.getSimpleName());
            if (owner.getSimpleName().equals(Object.class.getSimpleName())) {
                System.out.println(rBdr);
            }
        }
    }
}
