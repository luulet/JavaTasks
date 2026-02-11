package Task2;

import java.util.ArrayList;

public class ThreadSafeList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String element) {
        list.add(element);
    }

    public synchronized int getSize() {
        return list.size();
    }

    public synchronized boolean remove(String element) {
        return list.remove(element);
    }
}