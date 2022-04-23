package java8.streams;


import java.util.Arrays;
import java.util.OptionalInt;

public class StreamsExample {
    public static void main(String[] args) {
        int[] arr1 = {11, 45, 12, 4, 5, 8, 6, 5, 8, 9, 5, 2, 3, 52, 100, 1, 4, 5};
        Integer[] arr = {11, 45, 12, 4, 5, 8, 6, 5, 8, 9, 5, 2, 3, 52, 100, 1, 4, 5};

        int max1 = Arrays.stream(arr1).max().getAsInt();
        System.out.println(max1);
        OptionalInt max2 = Arrays.asList(arr).stream().mapToInt(v -> v)
                .max();
        System.out.println(max2.getAsInt());

    }

}
