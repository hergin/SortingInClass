package sorters;

import java.util.List;

public class LinearSort implements NumberSorter {

    @Override
    public void sort(List<Integer> items) {
        for(int i=0; i<items.size(); i++ ){
            for(int j=i+1; j<items.size(); j++){
                if(items.get(i)>items.get(j)){
                    int temp = items.get(i);
                    items.set(i, items.get(j));
                    items.set(j, temp);
                }
            }

        }
    }
}
