package sorters;

import java.util.List;

public class BubbleSorter implements NumberSorter
{
    @Override
    public void sort(List<Integer> items)
    {
        for (int i = 0; i < items.size(); i++)
        {
            for (int j = 0; j < items.size(); j++)
            {
                if (items.get(j) > items.get(i))
                {
                    var temp = items.get(i);
                    items.set(i, items.get(j));
                    items.set(j, temp);
                }
            }
        }
    }
}
