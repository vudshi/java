package itea.org.oop.am_abstract;

/**
 * Created by lsm on 5/10/2017.
 */
public class Hamburger implements Food {
    private int meat = 120; //g
    private int bread = 50; //g
    private int cucumber = 20; //g

    public int getKKal() {
        return (int) (meat + bread + cucumber * 2.5);
    }

    @Override
    public String toString() {
        return "{tasty hamburger with chiiiiiiizzzz}";
    }
}