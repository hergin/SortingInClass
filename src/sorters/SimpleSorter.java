package sorters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SimpleSorter implements NumberSorter{
    @Override
    public void sort(List<Integer> items) {
        Collections.sort(items);
    }
}
