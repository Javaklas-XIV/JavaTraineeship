import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndroidTest {

    @BeforeEach()

    @Test
    void checkIfGivingTooHighNumberToChargeMethodThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Android().charge(Android.MAX_BATTERY_LEVEL + 1));
    }
}