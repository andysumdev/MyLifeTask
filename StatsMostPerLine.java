package statsgenerator;

import java.util.ArrayList;

/**
 * A class for retrieving the highest number of integers in a single line in a given data set.
 */
public class StatsMostPerLine extends StatsGenerator {
    
    public StatsMostPerLine(){
        super("MostPerLine");
    }
    
    /**
     * @param set CSVFileData.Set object from CSVFileReader
     * @return - The greatest number of Integers found in a single line within the data set as an Integer value
     * or null if the given set is null.
     */
    public Integer performOperation(CSVFileData.Set set) {
        int currentMax = 0;
        try {
            for (CSVFileData.Row row : set) {
                if(row.size() > currentMax){
                    currentMax = row.size();
                }
            }
        } catch (NullPointerException npx) {
            return null;
        }
        return currentMax;
    }
}
