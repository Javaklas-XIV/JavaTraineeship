import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevenProofTest {

    @Test
    void checkIfDotsAreRemovedFromGivenAccountNumber() {
        assertEquals("123456789", ElevenProof.removeDots("12.34.56.789"));
    }

    @Test
    void checkIfAccountNumberThatIsShorterOrLongerThanNineNumbersThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ElevenProof.validateAccountNumber("1111"));
        assertThrows(IllegalArgumentException.class, () -> ElevenProof.validateAccountNumber("1111111111"));
    }

    @Test
    void checkIfIncorrectAccountNumberThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ElevenProof.validateAccountNumber("111111111"));
    }
}