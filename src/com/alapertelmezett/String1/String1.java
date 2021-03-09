package com.alapertelmezett.String1;

public class String1 {

    //twoChar
    /*Given a string and an index, return a string length 2 starting at the given index. If the index is too big or
     too small to define a string length 2, use the first 2 chars. The string length will be at least 2.*/
    public String twoChar(String str, int index) {
        return (index < 0 || index > str.length() - 2) ? str.substring(0, 2) : str.substring(index, index + 2);
    }

    //middleThree
    /*Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    The string length will be at least 3.*/
    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

}
