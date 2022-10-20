package com.mennomuller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lenses {
    public static List<Integer> lens1(int[] inputs) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : inputs) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.get(i) * 2);
            list.remove(i + 1);
        }
        return list;
    }

    public static List<Integer> lens2(int[] inputs) {
        return Arrays.stream(inputs).filter(i -> i % 2 == 0)
                .sorted().map(i -> i * 2).collect(Collectors.toList());

    }
}
