/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Dorothy Zhang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        System.out.println(add(3, 8));
        System.out.println(add(3, 8, 4, 9));

        System.out.println(morningGreeting("Toby Fox"));
        System.out.println(afternoonGreeting("Mac Miller"));

        System.out.println(triple("oohbaby"));
        System.out.println(half(8));
        System.out.println(roundPositiveValueToNearestInteger(8.5));
        System.out.println(roundNegativeValueToNearestInteger(-8.5));
    }

    // 1. add

    public static int add(int a, int b) {
        return a + b;
        
    }
    
    // 2. add

    public static int add(int a, int b, int c, int d) {
        int x = add(a, b);
        int y = add(c, d);
        return add(x, y) ;
    }

    // 3. morningGreeting   morningGreeting(“Toby Fox”) → 早上好, Toby Fox!

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }
    
    // 4. afternoonGreeting

    public static String afternoonGreeting(String naame) {
        return "下午好, " + naame + "!";
    }

    // 5. triple triple(“oohbaby”) → oohbabyoohbabyoohbaby
    
    public static String triple(String ohh) {
        return ohh + ohh + ohh;
    }

    // 6. half
    
    public static int half(int e) {
        return e/2;
    }

    // 7. roundPositiveValueToNearestInteger

    public static double roundPositiveValueToNearestInteger(double f) {
        double y = f + 0.5;
        int x = (int)y;
        return x;
    }

    // 8. roundNegativeValueToNearestInteger

    public static double roundNegativeValueToNearestInteger(double g) {
        double y = g - 0.5;
        int x = (int) y;
        return x; 
    }

}
