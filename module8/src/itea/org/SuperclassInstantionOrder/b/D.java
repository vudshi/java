package itea.org.SuperclassInstantionOrder.b;

/**
 * Created by lsm on 5/10/2017.
 */
public class D extends C {
    public D() {
        Demo.greet(this.getClass());
    }
    public D(char lBdr, char rBdr) {
        Demo.greet(this.getClass(), this.getClass().getSuperclass(), lBdr, rBdr);
    }

}
