package Leetcode.LogicalQuestion.DesignHashMap_706;

import java.util.*;

public class MyHashMap {

    List<Integer> KeySet = new ArrayList<>();
    List<Integer> ValueSet = new ArrayList<>();

    public MyHashMap() {

    }

    public void put(int key, int value) {
        if (KeySet.contains(key)) {
            for (int i = 0; i < KeySet.size(); i++) {
                if (KeySet.get(i) == key) {
                    ValueSet.remove(i);
                    ValueSet.add(i, value);
                }
            }

        } else {
            KeySet.add(key);
            ValueSet.add(value);
        }
    }

    public int get(int key) {
        for (int i = 0; i < KeySet.size(); i++) {
            if (KeySet.get(i) == key) {
                return ValueSet.get(i);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < KeySet.size(); i++) {
            if (KeySet.get(i) == key) {
                ValueSet.remove(i);
                KeySet.remove(i);
                break;
            }
        }
    }
}
