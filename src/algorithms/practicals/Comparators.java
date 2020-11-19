package algorithms.practicals;

import java.util.*;

public class Comparators {
    public static void main(String[] args) {

        List<Jobs> jobs = new ArrayList<Jobs>();
        jobs.add(new Jobs("A",2,100));
        jobs.add(new Jobs("B",1,19));
        jobs.add(new Jobs("C",2,27));
        jobs.add(new Jobs("D",1,25));
        jobs.add(new Jobs("E",3,15));
        Collections.sort(jobs);
        System.out.println(Arrays.toString(jobs.toArray()));
    }


}

class Jobs implements Comparable<Jobs> {

    String name;
    int dealine;
    int profit;

    public Jobs(String name, int dealine, int profit) {
        this.name = name;
        this.dealine = dealine;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "[name='" + name + ", dealine=" + dealine + ", profit=" + profit + "]\n";
    }

    @Override
    public int compareTo(Jobs o) {
        if (o.profit < profit){
            return -1;
        }
        return 1;
    }
}