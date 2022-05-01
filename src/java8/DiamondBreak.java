package java8;

 interface I1
{
    default String getGreeting() {
        return "Good Morning!";
    }
}

 interface I2
{
    default String getGreeting() {
        return "Good Afternoon!";
    }
}
public class DiamondBreak implements I1, I2
{
    public static void main(String[] args)
    {
        System.out.println(new DiamondBreak().getGreeting());
    }

    /*If a class is implementing 2 interfaces which have default methods of same signature
    * then if we want to invoke the implementation of either of the interface methods
    * we need to override the method as a fix of compilation error and use
    * <interfaceName>.super.<method>*/

    @Override
    public String getGreeting() {
        return I2.super.getGreeting();
    }
}
