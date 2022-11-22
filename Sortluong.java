package sort;

import btvn.nv;

import java.util.Comparator;

public class Sortluong implements Comparator<nv> {
    @Override
    public int compare(nv o1, nv o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
