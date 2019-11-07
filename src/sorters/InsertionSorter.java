package sorters;

import java.util.List;

public class InsertionSorter implements NumberSorter{
    @Override
    public void sort(List<Integer> items) {
        int n = items.size();
        for (int i = 1; i < n; ++i) {
            int key = items.get(i);
            int j = i - 1;

            while (j >= 0 && items.get(j) > key) {
                items.set(j + 1, items.get(j));
                j = j - 1;
            }
            items.set(j + 1, key);
        }
    }
}
