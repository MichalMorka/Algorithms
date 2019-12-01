package timer;

import listImp.ArrayList2x;
import listImp.IList;
import listImp.ListUtilities;

import java.util.Random;

public class SortExaminator {
    public static void main(String[] args) {

        IList<Integer> list;
        Random rand = new Random();
        Stopwatch stopwatch = new Stopwatch();
        int randomBound = 100;
        int[] elementsCount = new int[]{100, 1000, 5000};
        long[] result = new long[elementsCount.length];
        int repetitions = 100;

        for (int i = 0; i < elementsCount.length; i++) {
            for (int repetition = 0; repetition < repetitions; repetitions++) {
                list = new ArrayList2x<>();
                for (int j = 0; j < elementsCount[i]; j++)
                    list.add(rand.nextInt(randomBound));
                stopwatch.Start();
                ListUtilities.insertSort(list);
                result[i] += stopwatch.Stop();
            }
            result[i] /= repetitions;
        }
            for (long time : result) {
                System.out.println(time + " ");
            }
        }
    }
