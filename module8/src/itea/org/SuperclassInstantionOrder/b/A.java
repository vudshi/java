package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 */
public class  A {
    public A() { Demo.greet(this.getClass());}
    public A(char lBdr, char rBdr) {
        Demo.greet(this.getClass(), this.getClass().getSuperclass(), lBdr, rBdr);
    }
}
