package questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q14 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ADadsds");
        list.add("RRRRRRRRRRR");
        list.add("opapa");
        list.add("SSupadupa");
        list.add("gomunkul");
        list.add("alalala");
        list.add("SSS");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("S")) {
                iterator.remove();
                iterator = list.iterator();
            }
        }
        System.out.println(list.toString());
    }
}
