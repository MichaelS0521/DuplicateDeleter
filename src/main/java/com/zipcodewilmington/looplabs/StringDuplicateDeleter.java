package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : array) {
            newMap.put(s, newMap.getOrDefault(s, 0) + 1);
        }

        List<String> newlist = new ArrayList<>();

        for (String s : array) {
            if (newMap.get(s) < maxNumberOfDuplications) {
                newlist.add(s);
            }
        }
        return newlist.toArray(new String[0]);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String s : array) {
            newMap.put(s, newMap.getOrDefault(s, 0) + 1);
        }

        List<String> newlist = new ArrayList<>();

        for (String s : array) {
            if (newMap.get(s) != exactNumberOfDuplications) {
                newlist.add(s);
            }
        }
        return newlist.toArray(new String[0]);
    }
}
