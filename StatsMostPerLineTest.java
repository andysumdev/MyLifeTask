package statsgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatsMostPerLineTest {
    
    public StatsMostPerLineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Positive test of performOperation method, of class StatsMostPerLine.
     */
    @Test
    public void positiveTestPerformOperation() {
        CSVFileData.Set set = new CSVFileData.Set();
        CSVFileData.Row row1 = new CSVFileData.Row();
        CSVFileData.Row row2 = new CSVFileData.Row();
        row1.add(2);
        row1.add(2);
        row1.add(428);
        row2.add(8);
        row2.add(-60);
        row2.add(360);
        set.add(row1);
        set.add(row2);
        
        StatsMostPerLine instance = new StatsMostPerLine();
        int result = instance.performOperation(set);
        assertTrue(result > 0);
    }
    
    /**
     * Negative test of performOperation method, of class StatsMostPerLine.
     */
    @Test
    public void negativeTestPerformOperation() {
        CSVFileData.Set set = null;
        StatsMostPerLine instance = new StatsMostPerLine();
        Integer result = instance.performOperation(set);
        assertNull(result);
    }
    
}
