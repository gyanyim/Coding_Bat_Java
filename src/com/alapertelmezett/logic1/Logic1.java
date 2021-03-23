package com.alapertelmezett.logic1;

public class Logic1 {

    //cigarParty
    /*When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend,
     in which case there is no upper bound on the number of cigars. Return true if the party with the given values
     is successful, or false otherwise.*/

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend && cigars >= 40 || !isWeekend && cigars >= 40 && cigars <= 60;
    }

    //dateFashion
    /*You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of
     your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
     getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish,
     8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less,
     then the result is 0 (no). Otherwise the result is 1 (maybe).*/

    public int dateFashion(int you, int date) {
        if (you >= 8 && date > 2 || you > 2 && date >= 8) {
            return 2;
        } else if (you <= 2 || date <= 2) {
            return 0;
        } else {
            return 1;
        }
    }

    //squirrelPlay
    /*The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is
    between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int
    temperature and a boolean isSummer, return true if the squirrels play and false otherwise.*/

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return isSummer && temp >= 60 && temp <= 100 || !isSummer && temp >= 60 && temp <= 90;
    }

    //caughtSpeeding
    /*You are driving a little too fast, and a police officer stops you. Write code to compute the result,
    encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/

    public int caughtSpeeding(int speed, boolean isBirthday) {
        boolean speedLimitOne = speed > 60 && speed < 81;
        boolean speedLimitTwo = speed > 80;
        boolean speedLimitOneBDay = speed > 65 && speed < 86;
        boolean speedLimitTwoBDay = speed > 85;

        if (!isBirthday && speedLimitOne || isBirthday && speedLimitOneBDay) {
            return 1;
        } else if (!isBirthday && speedLimitTwo || isBirthday && speedLimitTwoBDay) {
            return 2;
        } else {
            return 0;
        }
    }

    //sortaSum
    /*Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
    so in that case just return 20.*/

    public int sortaSum(int a, int b) {
        return (a + b >= 10 && a + b <= 19) ? 20 : a + b;
    }

    //alarmClock
    /* Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
    return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
    and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00"
    and weekends it should be "off".*/

    public String alarmClock(int day, boolean vacation) {
        boolean weekend = day == 0 || day == 6;

        if (!vacation && !weekend) {
            return "7:00";
        } else if (!vacation || !weekend) {
            return "10:00";
        } else {
            return "off";
        }
    }

    //love6
    /*The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
    Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.*/

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6);
    }

    //in1To10
    /*Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case
    return true if the number is less or equal to 1, or greater or equal to 10.*/

    public boolean in1To10(int n, boolean outsideMode) {
        return !outsideMode && n >= 1 && n <= 10 || outsideMode && n <= 1 || outsideMode && n >= 10;
    }

    //specialEleven
    /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
    Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod*/

    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    //more20
    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.*/
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    //old35
    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator */
    public boolean old35(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0;
    }

    //less20
    /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
    So for example 38 and 39 return true, but 40 returns false. */

    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }

    //nearTen
    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.*/

    public boolean nearTen(int num) {
        return num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9;
    }

    //teenSum
    /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
    So if either value is a teen, just return 19.*/

    public int teenSum(int a, int b) {
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19 : a + b;
    }

    //answerCell
    /*Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
    answer if it is your mom calling. In all cases, if you are asleep, you do not answer.*/

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }

    //teaParty
    /*We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as
    0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or
    candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea
    or candy is less than 5, the party is always bad (0).*/

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea * 2 <= candy || candy * 2 <= tea) {
            return 2;
        } else {
            return 1;
        }
    }

    //fizzString
    /*Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
    If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.*/

    public String fizzString(String str) {
        if (str.charAt(0) == 'f' && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    //fizzString2
    /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use
    "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after
    division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?*/

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n+"!";
        }
    }

}
