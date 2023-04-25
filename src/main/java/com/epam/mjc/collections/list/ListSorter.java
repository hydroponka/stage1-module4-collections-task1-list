package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator listComparator = new ListComparator();
        sourceList.sort(listComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return funcX(a) - funcX(b);
    }

    private int funcX(String s){
        int x = Integer.parseInt(s);
        return (int) (5*(Math.pow(x,2))+3);
    }
}
