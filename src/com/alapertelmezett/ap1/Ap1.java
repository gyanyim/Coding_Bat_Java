package com.alapertelmezett.ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ap1 {

    //scoreIncreasing
    /*Given an array of scores, return true if each score is equal or greater than the one before.
    The array will be length 2 or more.*/
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //scores100
    /*Given an array of scores, return true if there are scores of 100 next to each other in the array.
    The array length will be at least 2.*/
    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    //scoresClump
    /*Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that
    differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.*/
    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] + 2 >= scores[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //scoresAverage
    /* Given an array of scores, compute the int average of the first half and the second half, and return whichever is
    larger. We'll say that the second half begins at index length/2. The array length will be at least 2. To practice
    decomposition, write a separate helper method int average(int[] scores, int start, int end) { which computes the
    average of the elements between indexes start..end. Call your helper method twice to implement scoresAverage().
    Write your helper method after your scoresAverage() method in the JavaBat text area. Normally you would compute
    averages with doubles, but here we use ints so the expected results are exact.*/
    public int scoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length / 2);
        int second = average(scores, scores.length / 2, scores.length);
        return Math.max(first, second);
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += scores[i];
        }

        return sum / (end - start);
    }

    //wordsCount
    /*Given an array of strings, return the count of the number of strings with the given length.*/
    public int wordsCount(String[] words, int len) {
        int count = 0;

        for (String word : words) {
            if (len == word.length()) {
                count++;
            }
        }
        return count;
    }

    //wordsFront
    /*Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.*/
    public String[] wordsFront(String[] words, int n) {
        String[] arrString = new String[n];

        Arrays.setAll(arrString, i -> words[i]);

        return arrString;
    }

    //wordsWithoutList
    /*Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are
    omitted. See wordsWithout() below which is more difficult because it uses arrays.*/
    public List wordsWithoutList(String[] words, int len) {

        List resultList = new ArrayList();

        for (int i = 0; i < words.length; i++) {
            if (len != words[i].length()) {
                resultList.add(words[i]);
            }

        }
        return resultList;
    }

    //hasOne
    /*Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit,
    and / to discard the rightmost digit.*/
    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1) {
                return true;
            } else {
                n /= 10;
            }
        }

        return false;
    }

    //dividesSelf
    /*We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide
    into anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit,
    and / to discard the rightmost digit.*/
    public boolean dividesSelf(int n) {
        int num = n;

        if (n % 10 == 0) {
            return false;
        } else {
            while (n != 0) {
                if (num % (n % 10) != 0) {
                    return false;
                } else {
                    n /= 10;
                }
            }
        }
        return true;
    }

    //copyEvens
    /*Given an array of positive ints, return a new array of length "count" containing the first even numbers
    from the original array. The original array will contain at least "count" even numbers.*/
    public int[] copyEvens(int[] nums, int count) {
        int size = 0;
        int[] resultArray = new int[count];

        for (int num : nums) {
            if (num % 2 == 0) {
                resultArray[size] = num;
                size++;
            }
            if (size == count) {
                return resultArray;
            }
        }
        return nums;
    }

    //copyEndy
    /*We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of
    positive ints, return a new array of length "count" containing the first endy numbers from the original array.
    Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain
    at least "count" endy numbers.*/
    public int[] copyEndy(int[] nums, int count) {
        int size = 0;
        int[] resultArray = new int[count];

        for (int num : nums) {
            if (isEndy(num)) {
                resultArray[size] = num;
                size++;
            }
            if (size == count) {
                return resultArray;
            }
        }
        return resultArray;
    }

    public boolean isEndy(int n) {

        return (n >= 0 && n <= 10 || n >= 90 && n <= 100);

    }

    //matchUp
    /*Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string
    in the other array, the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty
    and start with the same char. The strings may be any length, including 0.*/
    public int matchUp(String[] a, String[] b) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty()) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    //scoreUp
    /*The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers"
    array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and
    are the same length. Return the score for this array of answers, giving +4 for each correct answer, -1 for each
    incorrect answer, and +0 for each blank answer.*/
    public int scoreUp(String[] key, String[] answers) {
        int result = 0;

        for (int i = 0; i < key.length; i++) {

            if (key[i].equals(answers[i])) {
                result += 4;
            }
            if (!key[i].equals(answers[i]) && !answers[i].equals("?")) {
                result -= 1;
            }
        }
        return result;
    }

    //wordsWithout
    /*Given an array of strings, return a new array without the strings that are equal to the target string.
    One approach is to count the occurrences of the target string, make a new array of the correct length,
    and then copy over the correct strings.*/
    public String[] wordsWithout(String[] words, String target) {
        List resultList = new ArrayList();

        for (String word : words) {
            if (!word.equals(target)) {
                resultList.add(word);
            }
        }
        String[] resultArray = new String[resultList.size()];
        resultArray = (String[]) resultList.toArray(resultArray);

        return resultArray;
    }

    //scoresSpecial
    /*Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10,
    such as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice
    decomposition, write a separate helper method which finds the largest special score in an array. Write your helper
    method after your scoresSpecial() method in the JavaBat text area.*/
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecialScore(a) + largestSpecialScore(b);
    }

    public int largestSpecialScore(int[] nums) {
        int max = 0;

        for (int num : nums) {
            if (max < num && num % 10 == 0) {
                max = num;
            }
        }
        return max;
    }
}
