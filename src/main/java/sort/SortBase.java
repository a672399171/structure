package sort;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/10/26.
 */
public abstract class SortBase {
    public boolean less(Comparable a, Comparable b) {
        if (a == null) {
            return false;
        }
        return a.compareTo(b) < 0;
    }

    public void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void swap(Comparable a, Comparable b) {
        Comparable temp = a;
        a = b;
        b = temp;
    }

    public void print(Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }

    public abstract void sort(Comparable[] a);
}
