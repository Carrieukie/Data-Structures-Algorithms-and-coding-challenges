package algorithms.practicals;

import java.util.Arrays;

public class str{
    public static void main(String[] args)  {

        System.out.println("1".hashCode());
        System.out.println("b".hashCode());
    }

    public String findCharacters(char[] array, String str){
//        xyyzxyxyx
        String ans = "";
        Arrays.sort(array);
        StringBuilder arrayHash = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            arrayHash.append(array[i]);
        }

        int pointer1 = 0;
        int pointer2 = array.length - 1;
        for (int i = 0; i < str.length(); i++) {
            
        }

        return ans;
    }
}
