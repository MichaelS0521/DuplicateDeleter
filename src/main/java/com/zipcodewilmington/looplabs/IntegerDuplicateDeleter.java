package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (Integer integer : array) {
            newMap.put(integer, newMap.getOrDefault(integer, 0) + 1);
        }

        List<Integer> newlist = new ArrayList<>();

        for (Integer integer : array) {
            if (newMap.get(integer) < maxNumberOfDuplications) {
                newlist.add(integer);
            }
        }
        return newlist.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (Integer integer : array) {
            newMap.put(integer, newMap.getOrDefault(integer, 0) + 1);
        }

        List<Integer> newlist = new ArrayList<>();

        for (Integer integer : array) {
            if (newMap.get(integer) != exactNumberOfDuplications) {
                newlist.add(integer);
            }
        }
        return newlist.toArray(new Integer[0]);
    }
}
