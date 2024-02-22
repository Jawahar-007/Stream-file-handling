package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxandMin {
    List<Integer > num = Arrays.asList(1,54,65,23,23,65);
    int max = num.stream()
            .distinct()
            .sorted()
            .findFirst()
            .orElse(0);

    Integer min = num.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .findFirst()
            .orElse(null);

}
