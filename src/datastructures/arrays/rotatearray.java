package datastructures.arrays;

import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        rotate(array,3);
    }
//    [1,2,3,4,5,6,7], k = 1 -> [5,6,7,1,2,3,4]

    public static void rotate(int[] nums, int k) {
        int counter = 0;
        int beingSwapped = 0;
        while (counter < k){
            beingSwapped = nums[nums.length -1];

        }
        System.out.println(Arrays.toString(nums));
    }
}
