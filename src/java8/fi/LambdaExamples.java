package java8.fi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main(String[] args) {
        Comparator<String> stringCompare = String::compareTo;
        System.out.println(stringCompare.compare("abc", "cba"));
Function<Integer,Integer> f = t -> (t*t);
        System.out.println(f.apply(3));
        BiConsumer<Integer, Integer> bs = (i1, i2) -> System.out.println(i1 + i2);
        bs.accept(3, 5);
        Consumer<Double> cd = (d) -> System.out.println(d);
        cd.accept(10d);
        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        isEven.test(5);
        PMaxFuncInterface p = (int[] arr) -> {
            int n = arr.length;
            int[] pMax = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    pMax[i] = arr[i];
                } else {
                    pMax[i] = Math.max(pMax[i - 1], arr[i]);
                }
            }
            return pMax;
        };
        int[] max = p.getMax(new int[]{5, 4, 1, 2, 3, 56, 87});
        System.out.println(Arrays.toString(max));
        LambdaExamples l = new LambdaExamples();
        PMaxFuncInterface p2 = l::getArrayPrefixMax;
        int[] max1 = p2.getMax(new int[]{5, 4, 1, 288, 3, 56, 87});
        System.out.println(Arrays.toString(max1));
    }

    private  int[] getArrayPrefixMax(int[] arr) {
        int n = arr.length;
        int[] pMax = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                pMax[i] = arr[i];
            } else {
                pMax[i] = Math.max(pMax[i - 1], arr[i]);
            }
        }
        return pMax;
    }
}
