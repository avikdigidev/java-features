package java8.fi;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        Consumer<Integer> c = t-> System.out.println("Print input multiply *2 : " + (t*2));
        c.accept(12);
    }
}
