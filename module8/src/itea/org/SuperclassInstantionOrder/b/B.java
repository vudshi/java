package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 */
public class B extends A {
    public B() {
        Demo.greet(this.getClass());
    }
    public B(char lBdr, char rBdr) {
        Demo.greet(this.getClass(), this.getClass().getSuperclass(), lBdr, rBdr);
    }
}
