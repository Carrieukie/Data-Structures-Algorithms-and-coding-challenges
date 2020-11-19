package algorithms.practicals;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


//        Integer array[] = new Integer[]{5,4,3,6};
//        System.out.println(solution(array));
//        Integer loads[] = new Integer[]{1,2,3,4,5};
//        System.out.println(loads(loads));
//        squareroot(25);
    }

    static void squareroot(int n){
        int p = 0;
        //02
        //1
        for (int i = 1; p <=n ; i++) {
            System.out.println("p is " + p + " i is " + i);
            p = p + i;
        }
    }
//    nums = [2,7,11,15], target = 9
//    static int[] target(Integer[] nums, int target){
//        int ans[] = new int[2];
//        HashMap<Integer,Integer> complements = new HashMap<>();
//        for (int i = 0; i < nums.length ; i++) {
//            int complement = target - nums[i];
//            if (complements.containsValue(complement)){
//                ans[0] = i;
//                ans[1] =
//            }else {
//                complements.put(i,complement);
//            }
//        }
//
//        return null;
//    }

    static int loads(Integer[] loads) {
        int server1Time = 0;
        int server2Time = 0;
        int pointer1 = 0;
        int pointer2 = loads.length -1;
        while(pointer1 < pointer2){
            if (server1Time < server2Time){
                server1Time += loads[pointer1];
                pointer1++;
            }else {
                server2Time += loads[pointer2];
                pointer2--;
            }
        }
        return Math.abs(server1Time - server2Time);
    }

    static int solution(Integer[] A) {
        int ans = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest){
                largest = A[i];
                ans++;
            }
        }
        return ans;
    }
}
