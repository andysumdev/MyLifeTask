package statsgenerator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A class for retrieving the mode value of a given data set.
 */
public class StatsMostCommon extends StatsGenerator {

    public StatsMostCommon() {
        super("Mode");
    }

    /**
     * @param set CSVFileData.Set object from CSVFileReader
     * @return - A set of most common values for the given data set or null if
     * no valid set is present.
     */
    public Set<Integer> performOperation(CSVFileData.Set set) {

        HashMap<Integer, Integer> elementMap = new HashMap<>();
        int maxInstances = 0;
        Set<Integer> mostCommonSet = new HashSet<>();

        try {
            for (CSVFileData.Row row : set) {
                for (Integer i : row) {
                    if (elementMap.containsKey(i)) {
                        elementMap.put(i, elementMap.get(i) + 1);
                    } else {
                        elementMap.put(i, 1);
                    }
                }
            }
        } catch (NullPointerException npx) {
            return null;
        }

        Set<Map.Entry<Integer, Integer>> frequencySet = elementMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : frequencySet) {
            if (entry.getValue() > maxInstances) {
                mostCommonSet.clear();
                maxInstances = entry.getValue();
                mostCommonSet.add(entry.getKey());
            } else if (entry.getValue() == maxInstances) {
                mostCommonSet.add(entry.getKey());
            }
        }

        return !mostCommonSet.isEmpty() ? mostCommonSet : null;
    }
}
