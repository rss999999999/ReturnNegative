/*

In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

    Examples
    Kata.makeNegative(1);  // return -1
    Kata.makeNegative(-5); // return -5
    Kata.makeNegative(0);  // return 0

*/

import java.lang.Math;
public class Kata {

    public static int makeNegative(final int x) {

        return Math.abs(x) * -1;

    }

}