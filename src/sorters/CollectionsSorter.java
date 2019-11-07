package sorters;

import java.util.Collections;
import java.util.List;

public class CollectionsSorter implements NumberSorter{
    @Override
    public void sort(List<Integer> Items)
    {
        Collections.sort(Items);
    }
}
