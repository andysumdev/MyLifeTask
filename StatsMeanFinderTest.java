package statsgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatsMeanFinderTest {
    
    public StatsMeanFinderTest() {
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
     * Positive test of performOperation method, of class StatsMeanFinder.
     */
    @Test
    public void positiveTestPerformOperation() {
        CSVFileData.Set set = new CSVFileData.Set();
        CSVFileData.Row row1 = new CSVFileData.Row();
        CSVFileData.Row row2 = new CSVFileData.Row();
        row1.add(2);
        row1.add(4);
        row1.add(6);
        row2.add(8);
        row2.add(10);
        set.add(row1);
        set.add(row2);
        
        StatsMeanFinder instance = new StatsMeanFinder();
        Double expResult = 6.0;
        Double result = instance.performOperation(set);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Null test of performOperation method, of class StatsMeanFinder.
     */
    @Test
    public void nullTestPerformOperation() {
        CSVFileData.Set set = null;
        StatsMeanFinder instance = new StatsMeanFinder();
        Double result = instance.performOperation(set);
        assertNull(result);       
    }
    
    /**
     * Empty set test of performOperation method, of class StatsMeanFinder.
     */
    @Test
    public void testPerformOperation() {
        CSVFileData.Set set = new CSVFileData.Set();
        CSVFileData.Row row1 = new CSVFileData.Row();
        CSVFileData.Row row2 = new CSVFileData.Row();
        set.add(row1);
        set.add(row2);
        
        StatsMeanFinder instance = new StatsMeanFinder();
        Double result = instance.performOperation(set);
        assertNull(result);
    }
}
