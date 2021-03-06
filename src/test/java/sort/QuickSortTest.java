package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class QuickSortTest {

    @Test
    public void exampleDataShouldBeSorted() {
        int[] table = new int[] {4,2,6,9,3,10,5};
            QuickSort qs = new QuickSort();
            qs.sort(table,0,table.length-1);

            for (int j = 0; j < table.length-1; j++) {
                Assert.assertTrue(table[i] <= table[i+1]);
            }

        }

    @Test
    public void randomDataShouldBeSorted() {
        Random rand = new Random();
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);

            QuickSort qs = new QuickSort();
            qs.sort(table,0,table.length-1);

            for (int j = 0; j < table.length-1; j++) {
                Assert.assertTrue(table[i] <= table[i+1]);
            }

        }
    }
}
