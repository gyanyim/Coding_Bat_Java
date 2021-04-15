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
        return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }

    //makePi
    /*Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.*/
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    //commonEnd
    /*Given 2 arrays of ints, a and b, return true if they have the same first element or
    they have the same last element. Both arrays will be length 1 or more.*/
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    //sum3
    /*Given an array of ints length 3, return the sum of all the elements.*/
    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    //rotateLeft
    /*Given an array of ints length 3, return an array with the elements "rotated left"
    so {1, 2, 3} yields {2, 3, 1}.*/
    public int[] rotateLeft3(int[] nums) {
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = last;
        return nums;
    }

    //reverse3
    /*Given an array of ints length 3, return a new array with the elements in reverse order,
    so {1, 2, 3} becomes {3, 2, 1}.*/
    public int[] reverse3(int[] nums) {
        int last = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            nums[i - 1] = nums[i + 1];
        }
        nums[nums.length - 1] = last;
        return nums;
    }

    //maxEnd3
    /*Given an array of ints length 3, figure out which is larger, the first or last element in the array,
    and set all the other elements to be that value. Return the changed array.*/
    public int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }

    //sum2
    /*Given an array of ints, return the sum of the first 2 elements in the array.
    If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.*/
    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return sum;
        } else if (nums.length == 1) {
            sum += nums[0];
        } else {
            sum = Integer.sum(nums[0], nums[1]);
        }
        return sum;
    }

    //middleWay
    /*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.*/
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    //makesEnds
    /*Given an array of ints, return a new array length 2 containing the first and last elements from the
    original array. The original array will be length 1 or more.*/
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }
}
