package lab;

import ListComparator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListComparatorTest {

    private ListComparator comparator;

    @BeforeEach
    public void setUp() {
        comparator = new ListComparator();
    }

    @Test
    public void testAddEvaluationLL() {
        double time = comparator.addEvaluationLL(1000);
        assertTrue(time >= 0, "Time should be non-negative");
    }

    @Test
    public void testAddEvaluationAL() {
        double time = comparator.addEvaluationAL(1000);
        assertTrue(time >= 0, "Time should be non-negative");
    }

    @Test
    public void testGetEvaluationLL() {
        comparator.addEvaluationLL(1000); 
        double time = comparator.getEvaluationLL();
        assertTrue(time >= 0, "Time should be non-negative");
    }

    @Test
    public void testGetEvaluationAL() {
        comparator.addEvaluationAL(1000);
        double time = comparator.getEvaluationAL();
        assertTrue(time >= 0, "Time should be non-negative");
    }

    @Test
    public void testRemoveEvaluationLL() {
        comparator.addEvaluationLL(1000);
        double time = comparator.removeEvaluationLL();
        assertTrue(time >= 0, "Time should be non-negative");
    }

    @Test
    public void testRemoveEvaluationAL() {
        comparator.addEvaluationAL(1000);
        double time = comparator.removeEvaluationAL();
        assertTrue(time >= 0, "Time should be non-negative");
    }
}