import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonH11Test {

    @Test
    void testIfHistoryCounterIsIncreasedAfterAddingAHistory() {

        PersonH11 person = new PersonH11("Steven");

        person.addHistory("Description of a history record.");

        assertEquals(1, person.getHistoryRecordCount());
    }
}