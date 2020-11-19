package datastructures.arrays;

public class removeduplicatessortedarray {
    public static void main(String[] args) {
        int[] sortedArray = {1,2,2,3,2};
        System.out.println(rvDuplicates(sortedArray));
    }

//    [1,2,2,3] -> [1,2]

    private static int rvDuplicates(int[] sortedArray){
        int pointer1 = 0;
        int pointer2 = 1;
        for (int i = 0; i < sortedArray.length; i++) {
            if (pointer2 == sortedArray.length){
                return pointer1 + 1;
            }
            if(sortedArray[pointer1] != sortedArray[pointer2]){
                pointer1++;
                sortedArray[pointer1] = sortedArray[pointer2];
                pointer2++;
            }else {
                pointer2 ++;
            }

        }
        return pointer1 + 1;
    }
}
