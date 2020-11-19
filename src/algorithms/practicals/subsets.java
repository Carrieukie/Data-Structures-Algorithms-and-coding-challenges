package algorithms.practicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        String curr="";
        List<String> result  = new ArrayList<>();
        System.out.println(powerSet(str,0,curr, result).toString());
    }
    static List<String> powerSet(String str, int index, String curr, List<String> result) {
        if (index == str.length()) {
            result.add("[" + curr + "]");
            return result;
        }
        powerSet(str, index + 1, curr + str.charAt(index), result);
        powerSet(str, index + 1, curr,result);
        return result;
    }

}
