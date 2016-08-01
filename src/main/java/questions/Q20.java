package questions;

import java.io.InvalidObjectException;
import java.util.Scanner;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q20 {
    private static int num;

    //or method throws InvalidObjectException
    public static void aaa() {
        Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            if (t<=0) {
                throw new InvalidObjectException("nooooooo! num must be > 0");
            } else {
                System.out.println(t);
            }
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        aaa();
    }
}
