package com.alapertelmezett.warmup2;

import java.sql.PreparedStatement;

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

    //arrayCount9
    /*Given an array of ints, return the number of 9's in the array.*/
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (num == 9) {
                counter++;
            }
        }
        return counter;
    }

    //arrayFront9
    /*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.*/
    public boolean arrayFront9(int[] nums) {
        int i = 0;
        while (i < 4 && i < nums.length) {
            if (nums[i] == 9)
                return true;
            i++;
        }
        return false;
    }

    //array123
    /*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.*/
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    //stringMatch
    /*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place
    in both strings.*/
    public int stringMatch(String a, String b) {
        int counter = 0;
        int minimumLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minimumLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }

    //stringX
    /*Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.*/
    public String stringX(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < (str.length() - 1) && str.charAt(i) == 'x')) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    //altPairs
    /*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".*/
    public String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            int last = i + 2;
            if (last > str.length()) {
                last = str.length();
            }
            result.append(str, i, last);
        }
        return result.toString();
    }

    //stringYak
    /*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.*/
    public String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    //array667
    /*Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.*/
    public int array667(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
                counter++;
            }
        }
        return counter;
    }
}
