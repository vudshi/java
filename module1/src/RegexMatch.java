/**
 * Created by lsm on 4/23/2017.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

    public static void main(String args[]) {
        // String to be scanned to find the pattern.
        /*String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";*/
        String line = "1, 2, 3";//"borders and step -5, 10 -2";
        //String pattern = "(-?\\d+)([^0-9-]+)(-?\\d+)([^0-9-]+)(-?\\d+)(.|\\z)";
        //String pattern = "(-?\\d+)(\\G-?\\d+)(\\G-?\\d+)(.|\\z)";
        String pattern = "-?\\d+";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m;// = r.matcher(line);
        for (int j = 0; j <= 2; j++) {
            m = r.matcher(line);
            if (m.find()) {

                System.out.println(String.format("Found value %d %s(%d %d)", j, m.group(0), m.start(0), m.end(0)));

            } else {
                System.out.println("NO MATCH");
            }
            line = line.substring(m.end(0));
        }
    }
}
