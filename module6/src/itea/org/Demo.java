package itea.org;

import java.util.Calendar;

/**
 * Created by lsm on 03.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int dayNumber = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayNumber);
    }
}
