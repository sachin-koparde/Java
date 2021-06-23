package code.java.other;

import java.lang.*;

public class Pattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                char c = (char)(j+64);
                System.out.print(c);
            }
            System.out.println();

        }
    }


}
