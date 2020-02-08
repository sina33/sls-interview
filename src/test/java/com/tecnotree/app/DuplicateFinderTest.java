package com.tecnotree.app;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateFinderTest extends TestCase {
    protected List<Integer> list;

    protected void setUp() {
        list = Arrays.asList(1, 2, 3, 4, 3, 1);
    }

    public void testFindDuplicates() {
        List<Integer> ans = Arrays.asList(1, 3);
        assertTrue(new HashSet<>(DuplicateFinder.findDuplicates(this.list)).equals(new HashSet<>(ans)));
    }

}
