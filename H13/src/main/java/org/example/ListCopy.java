package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListCopy {

    public static <T> List<T> copy(List<T> fromList, List<T> toList) {
        List<T> mergedList = new ArrayList<>();

        mergedList.addAll(toList);
        mergedList.addAll(fromList);

        return mergedList;
    }
}
