package providers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RandomNumberProviderTest {

    @Test
    void provideNumbers() {
        var theSeed = 1;
        var provider = new RandomNumberProvider(theSeed);
        var expectedArray = new Object[]{88, 47, 13, 54, 4, 34, 6, 78, 48, 69, 73, 17, 63, 62, 34};
        var actualArray = provider.provideNumbers().toArray();
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void provideNumbers2() {
        var theSeed = 0;
        var provider = new RandomNumberProvider(theSeed);
        var expectedArray = new Object[]{48, 29, 47, 15, 53, 91, 61, 19, 54, 77};
        var actualArray = provider.provideNumbers().toArray();
        assertArrayEquals(expectedArray, actualArray);
    }
}