package code.java.generics;

import java.util.Arrays;
import java.util.List;

public class GenericDemo1 {

    public static void main(String[] args) {

        List<Integer> lists = Arrays.asList(1, 2, 3);
        int sum = 0;
        for (int list : lists) {
            sum += list;
        }

        Integer myInt = new Integer(23); //Auto-boxing

//        also

        Integer myInt1 = Integer.valueOf(34); // Auto-boxing

        int myInt2 = myInt; // Unboxing

        //int is a primitive type and Integer is a wrapper class



    }

}
