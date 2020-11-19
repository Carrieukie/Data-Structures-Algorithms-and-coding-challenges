package algorithms.practicals;

public class recursion {
    public static void main(String[] args) {
        System.out.println(fun(6,0));
    }

    static int fun(int n, int cont){
        if( n < 1){
            return cont * 7 + 1;
        }
        return fun(n-2, ++ cont);
    }


}
