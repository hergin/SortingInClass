package providers;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SimpleNumberProviderTest {

    @Test
    void provideNumbers() {
        var provider = new SimpleNumberProvider();
        var expectedArray = new Object[]{1,2,3,4};
        var actualArray = provider.provideNumbers().toArray();
        assertArrayEquals(expectedArray, actualArray);
    }

}
