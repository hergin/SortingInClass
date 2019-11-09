package sorters;

import java.util.Collections;
import java.util.List;

public class EzSorter implements NumberSorter {

    @Override
    public void sort(List<Integer> list){
        Collections.sort(list);
    }
}
