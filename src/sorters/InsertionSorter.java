package sorters;

import java.util.List;

public class InsertionSorter implements NumberSorter {
    @Override
    public void sort(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            int key = items.get(i);
            int j = i-1;
            while (j >= 0 && items.get(j) > key) {
                items.set((j+1), items.get(j));
                j -= 1;
            }
            items.set((j+1), key);
        }
    }
}
