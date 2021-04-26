package com.alapertelmezett.string3;

public class String3 {

    //countYZ
    /*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
    count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word
    if there is not an alphabetic letter immediately following it.
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)*/
    public int countYZ(String str) {
        int count = 0;

        if (str.length() == 0) {
            return count;
        }

        for (int i = 0; i <= str.length() - 2; i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if ((c == 'y' || c == 'z') && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }

        char c = Character.toLowerCase(str.charAt(str.length() - 1));
        if (c == 'y' || c == 'z') {
            count++;
        }
        return count;
    }

    //withoutString
    /*Given two strings, base and remove, return a version of the base string where all instances of the remove string
    have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".*/
    public String withoutString(String base, String remove) {
        StringBuilder fin = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length()) {
                String temp = base.toLowerCase().substring(i, i + remove.length());
                if (!temp.equals(remove.toLowerCase()))
                    fin.append(base.charAt(i));
                else {
                    i += remove.length() - 1;
                }
            } else {
                String tmp2 = base.toLowerCase().substring(i, i + 1);
                if (!tmp2.equals(remove.toLowerCase()))
                    fin.append(base.charAt(i));
            }
        }
        return fin.toString();
    }

    //equalIsNot
    /*Given a string, return true if the number of appearances of "is" anywhere in the string is equal to
    the number of appearances of "not" anywhere in the string (case sensitive).*/
    public boolean equalIsNot(String str) {
        int isCounter = 0;
        int notCounter = 0;

        if (str.length() == 0) {
            return true;
        } else if (str.length() < 3) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.startsWith("is", i)) {
                isCounter++;
            }
        }

        for (int j = 0; j < str.length() - 2; j++) {
            if (str.startsWith("not", j)) {
                notCounter++;
            }
        }
        return isCounter == notCounter;
    }

    //gHappy
    /*We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    Return true if all the g's in the given string are happy.*/
    public boolean gHappy(String str) {
        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    result = true;
                } else {
                    result = i < str.length() - 1 && str.charAt(i + 1) == 'g';
                }
            }
        }
        return result;
    }

    //countTriple
    /*We'll say that a "triple" in a string is a char appearing three times in a row.
    Return the number of triples in the given string. The triples may overlap.*/
    public int countTriple(String str) {
        int counter = 0;

        if (str.length() < 3) {
            return counter;
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                counter++;
            }
        }
        return counter;
    }

    //sumDigits
    /*Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
    Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is
    one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)*/
    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                String num = str.substring(i, i + 1);
                sum += Integer.parseInt(num);
            }

        }
        return sum;
    }

    //sameEnds
    /*Given a string, return the longest substring that appears at both the beginning and end of the string
    without overlapping. For example, sameEnds("abXab") is "ab".*/
    public String sameEnds(String string) {
        String result = "";
        String temp = "";

        for (int i = 0; i < string.length(); i++) {
            temp += string.charAt(i);
            if (i < string.length() / 2 && temp.equals(string.substring(string.length() - temp.length()))) {
                result = temp;
            }
        }
        return result;
    }

    //mirrorEnds
    /*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
    In other words, zero or more characters at the very begining of the given string, and at the very end of
    the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".*/
    public String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - i - 1))
                result.append(string.charAt(i));
            else
                break;
        }

        return result.toString();
    }

    //maxBlock
    /*Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.*/
    public int maxBlock(String str) {
        if (str.length() == 0) {
            return 0;
        }

        int largest = 0;
        int temp = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                if (temp > largest) {
                    largest = temp;
                }
                temp = 1;
            } else {
                temp++;
            }
        }
        return Math.max(largest, temp);
    }

    //sumNumbers
    /*Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
    one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)*/
    public int sumNumbers(String str) {
        int sum = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    temp.append(str.charAt(i));
                } else {
                    temp.append(str.charAt(i));
                    sum += Integer.parseInt(temp.toString());
                    temp = new StringBuilder();
                }
            }
        }
        return sum;
    }
}
