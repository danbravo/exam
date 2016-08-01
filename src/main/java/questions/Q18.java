package questions;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q18 {

    public static int rec(int n) {
        int result;
        if (n==1) {
            return 1;
        }
        result = rec(n-1)*n;
        return result;
    }
}
