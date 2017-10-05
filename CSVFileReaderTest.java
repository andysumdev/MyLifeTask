package statsgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CSVFileReaderTest {
    
    public CSVFileReaderTest() {
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
     * Positive test of readFile method, of class CSVFileReader.
     */
    @Test
    public void positiveTestReadFile() {
        String filepath = "testfile1.csv";
        CSVFileReader instance = new CSVFileReader();
        CSVFileData result = null;
        try{
            result = instance.readFile(filepath);
        }catch(Exception ex){}
        
        assertNotNull(result);
    }
    
    /**
     * Invalid test of readFile method, of class CSVFileReader.
     */
    @Test
    public void invalidTestReadFile() {
        String filepath = "ThisIsNotAValidFilepath££$$%%";
        CSVFileReader instance = new CSVFileReader();
        CSVFileData result = null;
        try{
            result = instance.readFile(filepath);
        }catch(Exception ex){}
        assertNull(result);
    }
}
