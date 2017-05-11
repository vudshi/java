package itea.org.oop.am_abstract;

/**
 * Created by lsm on 5/10/2017.
 */
public class Cat extends Pet {

    // implementation specific to Cat
    public void voice() {
        System.out.println("Meaaaw");

    }

    // implementation specific to Cat
    public void doMorningExercises() {
        System.out.println("cat doing exercises..");
    }

}
