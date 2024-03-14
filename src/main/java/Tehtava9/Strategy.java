package Tehtava9;

import java.util.List;

// Concrete strategy implementing strategy 1
class Strategy1 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String item : list) {
            result.append(item).append("\n");
        }
        return result.toString();
    }
}

// Concrete strategy implementing strategy 2
class Strategy2 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if (i % 2 == 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}

// Concrete strategy implementing strategy 3
class Strategy3 implements ListConverter {
    @Override
    public String listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if ((i + 1) % 3 == 0) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
