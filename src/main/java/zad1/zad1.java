package zad1;

import java.util.Random;

public class zad1 {
    public static void main(String[] args) {


        Random random = new Random();
        int max = 0;
        int[] tab = new int[10];
        int tmp = 0;

        for (int i = 0; i < tab.length; i++) {
            System.out.print(random.nextInt(20) + " ");
        }
        System.out.println();


//        for (int i = 1; i < tab.length; i++) {
//            if (tab[i]>max){
//                 max = tab[i];
//            }
//            return max;
//
//
//        }
    }
}
