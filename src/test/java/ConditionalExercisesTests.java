import org.example.ConditionalExercises;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionalExercisesTests {
    @Test
    public void testLessThanFive() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertTrue(exercises.lessThanFive(4));
        assertFalse(exercises.lessThanFive(5));
        assertFalse(exercises.lessThanFive(6));
    }

    @Test
    public void testGetAgeGroup() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertEquals("child", exercises.getAgeGroup(12));
        assertEquals("teen", exercises.getAgeGroup(15));
        assertEquals("adult", exercises.getAgeGroup(20));
    }

    @Test
    public void testIsValidPassword() {
        ConditionalExercises exercises = new ConditionalExercises();
        assertFalse(exercises.isValidPassword("1234567"));
        assertTrue(exercises.isValidPassword("12345678"));
        assertTrue(exercises.isValidPassword("123456789"));
    }
}
