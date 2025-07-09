package Leetcode.LogicalQuestion.DesignHashSet_705;

import java.util.*;

public class MyHashSet {
    
    List<Integer> keySet = new ArrayList<>();

    public MyHashSet() {
        
    }

    public void add(int key) {
        if (!keySet.contains(key)) {
            keySet.add(key);
        }
    }

    public void remove(int key) {
        for (int i = 0; i < keySet.size(); i++) {
            if (keySet.get(i) == key) {
                keySet.remove(i);
                break;
            }
        }
    }

    public boolean contains(int key) {
        for (int i = 0; i < keySet.size(); i++) {
            if (keySet.get(i) == key) {
                return true;
            }
        }
        return false;
    }
}
