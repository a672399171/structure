package sort;

/**
 * Created by Administrator on 2016/10/26.
 */
public class ChooseSort extends SortBase {
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[k])) {
                    k = j;
                }
            }
            if (k != i) {
                swap(a, k, i);
            }
        }
    }

    public static void main(String[] args) {
        ChooseSort sort = new ChooseSort();
        Comparable[] a = new Integer[]{2, 9, 6, 5, 4};
        sort.sort(a);
        sort.print(a);
    }
}
