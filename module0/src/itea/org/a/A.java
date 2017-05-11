package itea.org.a;

/**
 * Created by lsm on 11.05.2017.
 */
public class A {
    public A() {
        Class dummy;
        dummy = this.getClass();
        Demo.greet(dummy);
        while (!dummy.getSuperclass().getSimpleName().equals(Object.class.getSimpleName())) {
            dummy = dummy.getSuperclass();
            Demo.greet(dummy);
        }
    }
    public A(char lBrdr, char rBrdr) {
        Class dummy;
        dummy = this.getClass();
        System.out.print(lBrdr);
        Demo.greet(dummy);
        while (!dummy.getSuperclass().getSimpleName().equals(Object.class.getSimpleName())) {
            dummy = dummy.getSuperclass();
            Demo.greet(dummy);
        }
        System.out.print(rBrdr);
    }
}
