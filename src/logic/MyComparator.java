package logic;

import java.util.Comparator;

/**
 * Created by KlauS on 01.08.2015.
 */
public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } if (o1 < o2) {
            return +1;
        } return 0;
    }
}
