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

    //hasBad
    /*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
    "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.*/
    public boolean hasBad(String str) {
        int length = str.length();
        if (length == 3 && str.equals("bad")) {
            return true;
        } else if (length >= 4) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
            return str.substring(1, 4).equals("bad");
        } else {
            return false;
        }
    }

    //atFirst
    /*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@'
    for the missing chars.*/
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

}
