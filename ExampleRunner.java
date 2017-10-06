package example;

import java.util.Set;
import statsgenerator.CSVFileData;
import statsgenerator.CSVFileReader;
import statsgenerator.StatsMeanFinder;
import statsgenerator.StatsMostCommon;
import statsgenerator.StatsMostPerLine;
import statsgenerator.StatsTotalCount;

/**
 * Example program for demonstrating basic library use
 */
public class ExampleRunner {

    public static void main(String[] args) {
        CSVFileReader fr = new CSVFileReader();
        CSVFileData data = null;
        Integer i;
        Double d;
        Set<Integer> iSet;

        try {
            data = fr.readFile("testfile1.csv");

            StatsMeanFinder mean = new StatsMeanFinder();
            StatsMostCommon mode = new StatsMostCommon();
            StatsMostPerLine most = new StatsMostPerLine();
            StatsTotalCount total = new StatsTotalCount();

            System.out.println("Results from: " + data.getFilePath());
            
            d = mean.performOperation(data.getSet());
            System.out.println("Mean Value: " + (d != null ? d : "Not available"));
            
            System.out.print("Most common integer(s): ");
            iSet = mode.performOperation(data.getSet());
            if (iSet != null) {
                for (Integer j : iSet) {
                    System.out.print(j + " ");
                }
                System.out.print("\n");
            } else {
                System.out.println("Not Available");
            }
            
            i = most.performOperation(data.getSet());
            System.out.println("Most elements per line: " + (i != null ? i : "Not available"));
            
            i = total.performOperation(data.getSet());
            System.out.println("Total elements in file: " + (i != null ? i : "Not available"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
