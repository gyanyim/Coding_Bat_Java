package com.alapertelmezett.String1;

public class String1 {

    //twoChar
    public String twoChar(String str, int index) {
        return  (index < 0 || index > str.length()-2) ? str.substring(0,2) : str.substring(index, index+2);

    }


}
