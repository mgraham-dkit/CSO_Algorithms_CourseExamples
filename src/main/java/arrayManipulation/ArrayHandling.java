package arrayManipulation;

import java.util.Arrays;

public class ArrayHandling {
    public static int shiftInsert(int [] nums, int value, int pos){
        int eliminated = nums[nums.length-1];

        for(int i = nums.length - 2; i >= pos; i--){
            nums[i+1] = nums[i];
        }

        nums[pos] = value;

        return eliminated;
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Eliminated value: " + shiftInsert(nums, 55, 0));
        System.out.println("Final array: " + Arrays.toString(nums));
    }
}
