package algorithms.practicals;

public class firstDuplicate {
    public static void main(String[] args) {
        int[] array = { 1,2,3,4,5,6};
        System.out.println(firstDuplicate(array));
    }

//    	[3,2,4,5,2,4] -> 2
    public static int firstDuplicate(int[] array){

        //leave a mark....taking an index-1
        // check if the number at index-1 is negative, if it is return i else -> continue
        // make the digit at index-1 negative

        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            if (array[Math.abs(index) - 1] < 0){
                return i;
            }else {
                array[index-1] = -array[index -1];
            }
        }
        return -1;
    }

}
