package com.alapertelmezett.logic2;

public class Logic2 {

    //makeBricks
    /*We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
    big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops.*/
    public boolean makeBricks(int small, int big, int goal) {
        return goal <= (big * 5 + small) && goal % 5 <= small;
    }

    //loneSum
    /*Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
    it does not count towards the sum.*/
    public int loneSum(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && a != c) {
            return c;
        } else if (a != b && a == c) {
            return b;
        } else if (a != c) {
            return a;
        } else {
            return 0;
        }
    }

    //luckySum
    /*Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards
    the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.*/
    public int luckySum(int a, int b, int c) {
        if (a != 13 && b != 13 && c != 13) {
            return a + b + c;
        } else if (a != 13 && b != 13) {
            return a + b;
        } else if (a != 13) {
            return a;
        } else {
            return 0;
        }
    }
}
