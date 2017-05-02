package org.path;

/**
 * Created by lsm on 4/26/2017.
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder  builder = new StringBuilder();
        // + build string here;
        builder.append("abc").append(123).append(true).delete(1, 3);
        builder.insert(2, "##");
        String result = builder.toString();
        System.out.println(result);
    }
}
