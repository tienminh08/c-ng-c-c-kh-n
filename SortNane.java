package sort;

import btvn.nv;

import java.util.Comparator;

public class SortNane implements Comparator<nv> {

    @Override
    public int compare(nv o1, nv o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
