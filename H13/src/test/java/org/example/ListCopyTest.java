package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCopyTest {

    @Test
    void testIfGenericListsOfTheSameTypeAreAppendedToEachOther() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Dit is tekst in lijst 1");
        list2.add("Dit is ook tekst maar dan in lijst 2");

        List<String> mergedList = ListCopy.copy(list2, list1);

        assertEquals(list1.size() + list2.size(), mergedList.size());
    }
}