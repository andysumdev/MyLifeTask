package statsgenerator;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * A class for retrieving the mean of a data set.
 */
public class StatsMeanFinder extends StatsGenerator {

    public StatsMeanFinder() {
        super("Mean");
    }

    /**
     * @param set CSVFileData.Set object from CSVFileReader
     * @return Double value of the mean for the given data set.
     */
    public Double performOperation(CSVFileData.Set set) {
        Integer sum = 0, count = 0;
        Double meanVal, sumAsDouble;
        String meanToThreePlaces;
        
        /* Answer to 3dp */
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        
        try {
            for (CSVFileData.Row row : set) {
                for (Integer i : row) {
                    sum += i;
                    count++;
                }
            }
        } catch (NullPointerException npx) {
            return null;
        }
        
        sumAsDouble = sum.doubleValue();
        if (count != 0) {
            meanVal = sumAsDouble / count;
            meanToThreePlaces = df.format(meanVal);
            return Double.valueOf(meanToThreePlaces);
        } else {
            return null;
        }
    }
}
