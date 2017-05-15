package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 */
public class C extends B {
    public C() {
        Demo.greet(this.getClass());
    }

    public C(char lBdr, char rBdr) {
        Demo.greet(this.getClass(), this.getClass().getSuperclass(), lBdr, rBdr);
    }
}
