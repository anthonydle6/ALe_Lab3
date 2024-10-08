import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTester 
{
    private GradeBook g1;
    private GradeBook g2;

    @BeforeEach
    public void setUp() throws Exception 
    {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(11);
        g1.addScore(44);
        g2.addScore(66);
        g2.addScore(99);
    }

    @AfterEach
    public void tearDown() throws Exception 
    {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        assertTrue(g1.toString().equals("11.0 44.0"));
        assertTrue(g2.toString().equals("66.0 99.0"));
        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(55.0, g1.sum(), 0.001);
        assertEquals(165.0, g2.sum(), 0.001);
    }

    @Test
    public void testMinimum() 
    {
        assertEquals(11.0, g1.minimum(), 0.001);
        assertEquals(66.0, g2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() 
    {
        assertEquals(44.0, g1.finalScore(), 0.001);
        assertEquals(99.0, g2.finalScore(), 0.001);
    }

    @Test
    public void testGetScoreSize() 
    {
        assertEquals(2, g1.getScoreSize());
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    public void testToString() 
    {
        assertEquals("11.0 44.0", g1.toString());
        assertEquals("66.0 99.0", g2.toString());
    }
}
