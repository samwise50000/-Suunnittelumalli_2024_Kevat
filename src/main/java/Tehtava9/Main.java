package Tehtava9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Item1", "Item2", "Item3", "Item4", "Item5");

        ListConverterContext context = new ListConverterContext(new Strategy1());
        System.out.println("Strategy 1:");
        System.out.println(context.convertListToString(list));

        context.setStrategy(new Strategy2());
        System.out.println("Strategy 2:");
        System.out.println(context.convertListToString(list));

        context.setStrategy(new Strategy3());
        System.out.println("Strategy 3:");
        System.out.println(context.convertListToString(list));
    }
}
