package statsgenerator;

import java.util.ArrayList;

/**
 * A class for storing data as a set of rows retrieved using a CSVFileReader
 * class.
 */
public class CSVFileData {

    /**
    * A class to store a row of Integers read from a CSV file.
    */
    public static class Row extends ArrayList<Integer> {
    }
    
    /**
    * A class to store a set of Rows read from a CSV file.
    */
    public static class Set extends ArrayList<Row> {
    }

    private Set set;
    private String filePath;

    public CSVFileData(Set s, String filePath) {
        this.set = s;
        this.filePath = filePath;
    }

    /**
     * @return The data set passed by a CSVFileReader on construction.
     */
    public Set getSet() {
        return set;
    }
    
    /**
     * @return The file path passed by a CSVFileReader on construction.
     */
    public String getFilePath() {
        return filePath;
    }
}
