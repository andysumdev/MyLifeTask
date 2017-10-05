package statsgenerator;

import java.util.ArrayList;

/**
 * A class for retrieving the total number of integers in a given data set.
 */
public class StatsTotalCount extends StatsGenerator {

    public StatsTotalCount(){
        super("Total");
    }
    
    /**
     * @param set CSVFileData.Set object from CSVFileReader
     * @return -  The total number of Integers in the data set as an Integer value or null if set is null.
     */
    public Integer performOperation(CSVFileData.Set set) {
        int count = 0;
        try {
            for (CSVFileData.Row row : set) {
                count += row.size();
            }
        } catch (NullPointerException npx) {
            return null;
        }
        return count;
    }
}
