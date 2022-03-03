import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChallengeCapgeminiTest {
    @Test
    public void questionOne() {
        int[] values = {9, 2, 1, 4, 6};
        int[] valuesException = {9, 2, 1, 4};

        Assertions.assertEquals(4, ChallengeCapgemini.questionOne(values));

        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class, () -> ChallengeCapgemini.questionOne(valuesException)
        );

        Assertions.assertEquals("Input list size should be odd", exception.getMessage());
    }

    @Test
    public void questionTwo() {
        int[] values = {1, 5, 3, 4, 2};
        int difference = 2;

        Assertions.assertEquals(3, ChallengeCapgemini.questionTwo(values, difference));
    }

    @Test
    public void questionThree() {
        String value = "tenha um bom dia";
        String value2 = "ola mundo";

        Assertions.assertEquals("taoa eum nmd hbi", ChallengeCapgemini.questionThree(value));
        Assertions.assertEquals("omd luo an", ChallengeCapgemini.questionThree(value2));
    }
}
