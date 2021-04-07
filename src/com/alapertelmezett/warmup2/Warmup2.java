package com.alapertelmezett.warmup2;

public class Warmup2 {

    //stringTimes
    /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.*/
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    //frontTimes
    /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;*/
    public String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() > 2) {
                result.append(str.substring(0, 3));
            } else {
                result.append(str);
            }
        }
        return result.toString();
    }

    //countXX
    /*Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".*/
    int countXX(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                counter++;
            }
        }
        return counter;
    }

    //doubleX
    /*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".*/
    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }

    //stringBits
    /*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".*/
    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    //stringSplosion
    /*Given a non-empty string like "Code" return a string like "CCoCodCode".*/
    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }
        return result.toString();
    }

    //last2
    /*Given a string, return the count of the number of times that a substring length 2 appears in the string and
    also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).*/
    public int last2(String str) {
        int counter = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(str.length() - 2).equals(str.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }


}
