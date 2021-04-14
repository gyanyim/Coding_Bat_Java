package com.alapertelmezett.array1;

public class Array1 {

    //firstLast6
    /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.*/
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    //sameFirstLast
    /*Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.*/
    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length-1]);
    }

}
