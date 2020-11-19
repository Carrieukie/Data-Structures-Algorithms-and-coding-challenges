package algorithms.practicals;

public class leastInterval {
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks,2));
    }

//    AAABBB -> 2
    public static int leastInterval(char[] tasks, int n){
        int ans = 0;
        int left = 0;
        int right = 0;
        while (right < tasks.length  ){
            if (tasks[left] == tasks[right] ) {
                if (right + 1 != tasks.length){
                    right ++;
                }else {
                    if (n % 2 == 1){

                    }
                    ans++;
                    return ans;
                }
            }else {
                ans += (right - left + 1)/ n;
                left = right;
            }
        }

        return ans;
    }
}
