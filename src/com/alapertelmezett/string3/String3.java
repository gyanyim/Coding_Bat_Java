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
}
