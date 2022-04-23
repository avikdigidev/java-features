package java8.fi;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
    public static void main(String[] args) {
        Supplier<String> s = ()-> "Hi";
        System.out.println(s.get());

    }
}
