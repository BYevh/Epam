package ua.epam.javacore.hometask06;

import java.util.ArrayList;

public class MyHashMap {
    private ArrayList<Integer> arrayList;

    public MyHashMap() {
        this.arrayList = new ArrayList<Integer>(1000000);
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(-1);
        }

    }

    public void put(int key, int value) {
        arrayList.set(key, value);
    }

    public Integer get(int key) {
        return arrayList.get(key);
    }

    public void remove(int key) {
        arrayList.set(key, -1);
    }

}
