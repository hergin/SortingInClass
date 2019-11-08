package sorters;

import java.util.List;

public class QuickSorter implements NumberSorter {

    @Override
    public void sort(List<Integer> items) {
        for (int i = 1; i < items.size(); i++) {
            int current = items.get(i);
            int j = i - 1;
            while(j >= 0 && current < items.get(j)) {
                items.set(j+1, items.get(j));
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            items.set(j+1, current);
        }
    }
}
