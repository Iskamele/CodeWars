package Kyu7.T07_ListFiltering;

import java.util.List;

public class NewKata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
            .filter(Integer.class::isInstance)
            .toList();
    }
}
