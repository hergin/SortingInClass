package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberProvider implements NumberProvider {

    private long seed;

    public RandomNumberProvider(long seed) {
        this.seed = seed;
    }

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();
        Random theGenerator = new Random(seed);
        int randomSize = theGenerator.nextInt(20) + 10;

        for (int i = 0; i < randomSize; i++) {
            resultingList.add(theGenerator.nextInt(100));
        }

        return resultingList;
    }
}
