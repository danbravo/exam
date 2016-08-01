package questions;

import org.apache.commons.lang3.ArrayUtils;
import java.util.*;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q15 {
    public static void main(String[] args) {
        String[] s = {"James", "Adelle", "SubZero", "KungLao", "Robert", "Barbara", "Turtle"};

        Arrays.sort(s);
        ArrayUtils.reverse(s);
        System.out.println(Arrays.toString(s));
    }
}
