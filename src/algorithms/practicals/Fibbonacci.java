package algorithms.practicals;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println(printFibbonacciR(4));
    }

    static void printFibbonacci(int n){
        int counter = 0;
        int start = 0;
        int second = 1;
        System.out.println(start);

        while (counter < Math.floor(n/2)){
            start = start + second;
            System.out.println(start);
            second =  start + second;
            System.out.println(second);
            counter ++;
        }
    }
//    0,1,1,2,3

////    n is 1 we should return 0
//    if n == 2 return 1
//
//    3-2 + 3 -1 3

    static int printFibbonacciR(int n){
        if(n < 0){
            return -1;
        }
            if (n == 1){
                return 0;
            }
            if(n == 2){
                return 1;
            }
//        System.out.println(n);
            return printFibbonacciR(n - 2) + printFibbonacciR(n -1) ;
    }

}
