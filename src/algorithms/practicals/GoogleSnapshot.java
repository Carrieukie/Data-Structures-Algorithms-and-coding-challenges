package algorithms.practicals;

import java.util.*;

public class GoogleSnapshot {
    public static void main(String[] args) {
        int[] array = { 1,2,7,8,3,45};
        System.out.println(solution(array));
    }
//[0,0,1,1,1,2,2,3,3,4]
    public int removeDuplicates(int[] nums) {
       int pointer1 = 0, pointer2 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[pointer1] == nums[pointer2]){
                   
            }
        }
        return nums.length;
    }

    public static int solution(int[] A){
        if (A.length <= 3){
            return A.length;
        }
        Map<Integer, Integer> occurences = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
           if (occurences.containsKey(A[i])){
               occurences.put(A[i],occurences.get(A[i]) + 1);
           }else {
               occurences.put(A[i],1);
           }
        }
        int ans = 0;
        for (int key : occurences.keySet()){
            int startpointer = 0;
            int endpointer = A.length -1;
            //align pointers
            while (true){
                if (A[startpointer] == key && A[endpointer] == key){
                    break;
                }
                if (!(A[startpointer] == key)){
                    startpointer ++;
                }
                if (!(A[endpointer] == key)){
                    endpointer--;
                }

            }
            int arraysize = endpointer - startpointer + 1;
            int localmax = arraysize - (arraysize - occurences.get(key) ) + 3;
            ans = Math.max(localmax,ans);
        }
        return  ans;
    }

    public static int solution1(String T) {
        int validTimes = 1;
        char[] cleanTime =  T.replace(":","").toCharArray();
        for (int i = 0; i < cleanTime.length; i++) {
            if (cleanTime[i] == '?' && i == 0){
                validTimes *= 2;
            }
            if (cleanTime[i] == '?' && i == 1){
                if (cleanTime[0] == '2'){
                    validTimes *= 4;
                }else {
                    validTimes *= 10;
                }

            }
            if (cleanTime[i] == '?' && i == 2){
                validTimes *= 6;
            }
            if (cleanTime[i] == '?' && i == 3){
                validTimes *= 10;
            }
        }
        return validTimes == 1 ? 0 : validTimes;
    }
}
