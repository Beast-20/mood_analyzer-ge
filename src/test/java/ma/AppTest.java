package ma;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {

    @BeforeAll
    public void beforeAll() {
        System.out.println("Executing this before all tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Executing this after all tests");
    }

    @Test
    public void check_happy_mood() throws MoodAnalysisException {
        MoodAnalyzer m1 = new MoodAnalyzer("I am in any Mood");
        assertEquals("HAPPY", m1.analyze());
    }

    @Test
    public void check_sad_mood() throws MoodAnalysisException {
        MoodAnalyzer m2 = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", m2.analyze());
    }

    @Test
    public void check_null_mood() throws MoodAnalysisException {
        MoodAnalyzer m3 = new MoodAnalyzer(null);
        try {
            m3.analyze();
            fail("Expected here an exception");
        } catch (MoodAnalysisException exception) {
            assertEquals(ErrorEnum.NULL, exception.getType());
        }
    }

    @Test
    public void check_empty_mood() throws MoodAnalysisException {
        MoodAnalyzer m4 = new MoodAnalyzer("");
        try {
            m4.analyze();
            fail("Expected here an exception");
        } catch (MoodAnalysisException exception) {
            assertEquals(ErrorEnum.EMPTY, exception.getType());
        }
    }
}
