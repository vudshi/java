package itea.org.oop.am_abstract;

/**
 * Created by lsm on 5/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        //Pet pet = new Cat(); // LSP
        Pet[] mypets = new Pet[]{new Cat(), new Cat(), new Dog()};
        for (Pet pet : mypets) {
            pet.weakUp();
        }
    }
}
