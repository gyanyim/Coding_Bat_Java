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
}
