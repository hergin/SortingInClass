package parsers;

import java.util.ArrayList;
import java.util.List;

public class NewParser implements NumberParser
{

    @Override
    public List<Integer> parseNumbers( List<String> content )
    {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < result.size(); i++)
        {
            System.out.println(result);
        }
        return result;
    }
}
