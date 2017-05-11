package itea.org.oop.am_abstract;

/**
 * Created by lsm on 5/10/2017.
 */
public class Dog extends Pet {

    // implementation specific to Dog
    public void voice() {
        System.out.println("Gav.!");
    }

    // implementation specific to Dog
    public void doMorningExercises() {
        System.out.println("dog go for a walk..");
    }
}