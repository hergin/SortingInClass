package exporters;

import java.util.List;

public abstract class NewExporter implements NumberExporter
{
    @Override
    public void export(List<Integer> list)
    {
        System.out.println("Sorted numbers:" + list);

    }
}
