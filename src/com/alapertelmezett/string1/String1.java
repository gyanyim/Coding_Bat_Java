package com.alapertelmezett.string1;

public class String1 {

    //helloName
    /*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    //makeAbba
    /*Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".*/
    public String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);
    }

    //makeTags
    /*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
    the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
    create the HTML string with tags around the word, e.g. "<i>Yay</i>".*/
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

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

    //lastTwo
    /*Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
    so "coding" yields "codign".*/
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2)
                    + str.charAt(str.length() - 1)
                    + str.charAt(str.length() - 2);
        }
    }

    //seeColor
    /*Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.*/
    public String seeColor(String str) {
        if (str.length() < 3) {
            return "";
        } else if (str.length() == 3 && str.equals("red")) {
            return "red";
        } else if (str.length() > 3 && str.startsWith("red")) {
            return "red";
        } else if (str.length() > 3 && str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    //frontAgain
    /*Given a string, return true if the first 2 chars in the string also appear at the end of the string,
    such as with "edited".*/
    public boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    //minCat
    /*Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string so it is the same length
    as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.*/
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).concat(b);
        } else if (a.length() < b.length()) {
            return a.concat(b.substring(b.length() - a.length()));
        } else {
            return a + b;
        }
    }

    //extraFront
    /*Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    The string may be any length. If there are fewer than 2 chars, use whatever is there.*/
    public String extraFront(String str) {
        return (str.length() > 1) ? str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2) : str + str + str;
    }

    //without2
    /* Given a string, if a length 2 substring appears at both its beginning and end, return a string
    without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself,
    so "Hi" yields "". Otherwise, return the original string unchanged.*/
    public String without2(String str) {
        return (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2)))
                ? str.substring(2)
                : str;
    }

    //deFront
    /*Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
    and keep the second char if it is 'b'. The string may be any length. Harder than it looks.*/
    public String deFront(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else if (str.charAt(0) == 'a') {
            return "a".concat(str.substring(2));
        } else if (str.charAt(1) == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

    //startWord
    /*Given a string and a second "word" string, we'll say that the word matches the string if it appears
    at the front of the string, except its first char does not need to match exactly. On a match,
    return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi"
    returns "hi" and "xip" returns "hip". The word will be at least length 1.*/

    public String startWord(String str, String word) {
        return ((str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))))
                ? str.substring(0, word.length()) : "";
    }

    //withoutX
    /*Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
    and otherwise return the string unchanged.*/

    public String withoutX(String str) {
        if (str.length() > 1) {
            if (str.charAt(0) == 'x' && str.endsWith("x")) {
                return str.substring(1, str.length() - 1);
            }
            if (str.charAt(0) == 'x') {
                return str.substring(1);
            }
            if (str.endsWith("x")) {
                return str.substring(0, str.length() - 1);
            } else {
                return str;
            }
        } else {
            return "";
        }
    }

    //withoutX2
    /*Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
     and otherwise return the string unchanged. This is a little harder than it looks.*/

    public String withoutX2(String str) {
        if (str.length() > 1) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            } else {
                return str;
            }
        }
        return "";
    }
}
