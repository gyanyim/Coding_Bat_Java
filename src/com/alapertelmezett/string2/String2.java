package com.alapertelmezett.string2;

import java.util.Locale;

public class String2 {

    //doubleChar
    /*Given a string, return a string where for every char in the original, there are two chars.*/
    public String doubleChar(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            result = result + c + c;
            i++;
        }
        return result;
    }

    //countHi
    /*Return the number of times that the string "hi" appears anywhere in the given string.*/
    public int countHi(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                counter++;
            }
        }
        return counter;
    }

    //catDog
    /*Return true if the string "cat" and "dog" appear the same number of times in the given string.*/
    public boolean catDog(String str) {
        int catCounter = 0;
        int dogCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                catCounter++;
            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                dogCounter++;
            }
        }
        return catCounter == dogCounter;
    }

    //countCode
    /*Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.*/
    public int countCode(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) != ' ' && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }
        return counter;
    }

    //endOther
    /*Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
    upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.*/
    public boolean endOther(String a, String b) {
        if (a.length() > b.length()) {
            return a.toLowerCase().substring(a.length() - b.length()).equals(b.toLowerCase());
        } else if (b.length() > a.length()) {
            return b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase(Locale.ROOT));
        } else {
            return a.toLowerCase().substring(a.length() - b.length()).equals(b.toLowerCase())
                    || b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase());
        }
    }

    //xyzThere
    /*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by
    a period (.). So "xxyz" counts but "x.xyz" does not.*/
    public boolean xyzThere(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("xyz"))
            return true;

        for (int i = 1; i < str.length() - 2; i++) {
            if (str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")) {
                return true;
            }
        }

        return false;
    }

    //bobThere
    /*Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.*/
    public boolean bobThere(String str) {
        boolean result = false;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                result = true;
            }
        }
        return result;
    }

    //xyBalance
    /*We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
    later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
    Return true if the given string is xy-balanced.*/
    public boolean xyBalance(String str) {
        int y = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') {
                y = i;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' && i > y) {
                return false;
            }
        }
        return true;
    }

    //mixString
    /*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
    the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.*/
    public String mixString(String a, String b) {
        String result = "";
        int length = Math.max(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            if (i <= a.length() - 1) {
                result += a.substring(i, i + 1);
            }
            if (i <= b.length() - 1) {
                result += b.substring(i, i + 1);
            }
        }
        return result;
    }

    //repeatEnd
    /*Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    You may assume that n is between 0 and the length of the string, inclusive.*/
    public String repeatEnd(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }

    //repeatFront
    /*Given a string and an int n, return a string made of the first n characters of the string, followed by the first
    n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive
    (i.e. n >= 0 and n <= str.length()).*/
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(0, n - i);
        }
        return result;
    }

    //repeatSeparator
    /*Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
    separated by the separator string.*/
    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word).append(sep);
        }
        return result.substring(0, result.length() - sep.length());
    }

    //prefixAgain
    /*Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
    somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().*/
    public boolean prefixAgain(String str, int n) {
        String find = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(find)) {
                return true;
            }
        }
        return false;
    }

    //xyzMiddle
    /*Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of
    chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.*/
    public boolean xyzMiddle(String str) {
        int start = str.length() / 2 - 1;
        if (str.length() > 2) {
            if (str.length() % 2 == 0) {
                return str.substring(start, start + 3).equals("xyz") || str.substring(start - 1, start + 2).equals("xyz");
            } else {
                return (str.substring(start, start + 3).equals("xyz"));
            }
        }
        return false;
    }


}
