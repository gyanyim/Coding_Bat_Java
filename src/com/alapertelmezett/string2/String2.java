package com.alapertelmezett.string2;

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
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i+2) == 't') {
                catCounter++;
            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i+2) == 'g') {
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
        for (int i = 0; i < str.length()-3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i+2) != ' ' && str.charAt(i+3) == 'e') {
                counter++;
            }
        }
        return counter;
    }


}
