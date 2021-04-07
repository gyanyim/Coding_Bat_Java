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
}
