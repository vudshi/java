package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 */
public class E extends D {
    public E() {
        Demo.greet(this.getClass());
    }

    public E(char lBdr, char rBdr) {
        Demo.greet(this.getClass(), this.getClass().getSuperclass(), lBdr, rBdr);
    }
}
