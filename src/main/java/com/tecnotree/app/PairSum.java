package com.tecnotree.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {

    public static int getNumPairs(List<Integer> list, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;

        for (int i : list) {
            if (map.containsKey(sum-i)) {
                count += map.get(sum - i);
                if (sum - i == i) {
                    count--;
                }
            }
        }

        return count/2;
    }

}
