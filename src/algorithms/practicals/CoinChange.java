package algorithms.practicals;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(getChange(100));
    }

    private  static int  getChange(int amount){
        if ( amount < 0){
            return 0;
        }
        if (amount == 0 || amount == 1){
            return 1;
        }

        return getChange(amount - 5) + getChange(amount - 3) + getChange( amount - 1);
    }

}
