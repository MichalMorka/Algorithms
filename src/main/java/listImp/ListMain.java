package listImp;

import java.util.Random;

public class ListMain {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayList2x<>(); //zamiana ArrayList2x / LinkedList
        Random rand = new Random();
        int numbersCount = 10;
        for (int i = 0; i < numbersCount; i++)
            list.add(rand.nextInt(11)); // generujemy losowe liczby do listy do tego zakresu

        ListUtilities.display(list); // wyswietlam liste
//        list.add(11,2);
//        ListUtilities.display(list);
//        list.remove(9);
//        list.swap(2,5);
        ListUtilities.insertSort(list);
        ListUtilities.display(list);

    }
}
