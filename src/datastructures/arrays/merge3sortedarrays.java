package datastructures.arrays;

import java.util.Arrays;

public class merge3sortedarrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3},array2 = {0,4,7}, array3 = {-1,5,2};
        System.out.println(Arrays.toString(merge(array1,array2,array3)));
    }
    public static int[] merge(int[] array1,int[] array2,int[] array3 ) {

        int[] ans = new int[array1.length + array2.length +array3.length];
        int pointer1 = 0,pointer2 = 0,pointer3 = 0;

        for (int i = 0; i < ans.length; i++) {

            if ( pointer1 < array1.length && array1[pointer1] < array2[pointer2]){
                if (array1[pointer1] < array3[pointer3]){
                    ans[i] = array1[pointer1++];
                }else {
                    ans[i] = array3[pointer3++];
                }
            }else if ( pointer2 < array2.length){
                if (array2[pointer2] < array3[pointer3]){
                    ans[i] = array2[pointer2++];
                }else if (pointer1 < array3.length){
                    ans[i] = array3[pointer3++];
                }
            }else if (pointer3 < array3.length){
                ans[i] = array3[pointer3++];
            }

        }

        return ans;

    }
}
