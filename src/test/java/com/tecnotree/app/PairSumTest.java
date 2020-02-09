package com.tecnotree.app;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PairSumTest extends TestCase {
    protected List<Integer> list;
    int sum;

    protected void setUp() {
        list = Arrays.asList(1, 2, 3, 4, 7, 9);
        sum = 10;
    }

    public void testPairSum() {
        int ans = 2;
        assertEquals(ans, PairSum.getNumPairs(list, sum));
    }


}
