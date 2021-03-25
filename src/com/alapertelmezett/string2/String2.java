package com.alapertelmezett.string2;

public class String2 {

    //doubleChar
    /*Given a string, return a string where for every char in the original, there are two chars.*/

    public String doubleChar(String str) {
        String result="";
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            result = result + c + c;
            i++;
        }
        return result;
    }
}
