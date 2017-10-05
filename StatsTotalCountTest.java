package statsgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatsTotalCountTest {
    
    public StatsTotalCountTest() {
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
     * Negative Test of performOperation method, of class StatsTotalCount.
     */
    @Test
    public void negativeTestPerformOperation() {
        CSVFileData.Set set = null;
        StatsTotalCount instance = new StatsTotalCount();
        Integer result = instance.performOperation(set);
        assertNull(result);      
    }
    
    /**
     * Positive Test of performOperation method, of class StatsTotalCount.
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
        
        StatsTotalCount instance = new StatsTotalCount();
        int expResult = 6;
        int result = instance.performOperation(set);
        assertEquals(expResult, result);    
    }
    
}
