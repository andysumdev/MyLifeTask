package statsgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({statsgenerator.CSVFileReaderTest.class, statsgenerator.StatsMostCommonTest.class, statsgenerator.StatsMostPerLineTest.class, statsgenerator.StatsMeanFinderTest.class, statsgenerator.StatsTotalCountTest.class})
public class StatsgeneratorSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
