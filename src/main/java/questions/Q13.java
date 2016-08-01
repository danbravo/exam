package questions;

import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("asdasd", 123);
        map.put("a12asd", 3);
        map.put("attttt", 87878);
        map.put("aa", 1);
        map.put("RRRRR", 700);
        map.put("jujuju", 1111111);

        map.forEach((s, i) -> {
            System.out.println("key: "+s+" value: "+i);
            //and some actions here
        });
    }
}
