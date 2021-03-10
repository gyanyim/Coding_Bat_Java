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

    //lastChars
    /*Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.*/
    public String lastChars(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1).concat(b.substring(b.length() - 1));
        } else if (a.isEmpty() && b.length() > 0) {
            return "@".concat(b.substring(b.length() - 1));
        } else if (a.length() > 0) {
            return a.substring(0, 1).concat("@");
        } else {
            return "@@";
        }
    }

    //concat
    /* Given two strings, append them together (known as "concatenation") and return the result. However,
    if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".*/
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
            return (a.substring(a.length() - 1).equals(b.substring(0, 1)))
                    ? a.concat(b.substring(1))
                    : a.concat(b);
        } else {
            return a.concat(b);
        }
    }

}
