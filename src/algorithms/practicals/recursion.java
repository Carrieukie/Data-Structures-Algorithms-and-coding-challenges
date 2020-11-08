public class recursion {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int number){
        if (number <= 0){
            return ;
        }
        print(number - 1);
        System.out.println(number);
    }
}
