package Tehtava9;

import java.util.List;

public class ListConverterContext {
    private ListConverter strategy;

    public ListConverterContext(ListConverter strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ListConverter strategy) {
        this.strategy = strategy;
    }

    public String convertListToString(List<String> list) {
        return strategy.listToString(list);
    }
}