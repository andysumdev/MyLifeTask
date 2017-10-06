package statsgenerator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class for reading data in CSV format into a CSVFileDataSet class.
 */
public class CSVFileReader {

    /**
     * @param filepath Path of file to be read. Reads integers from a file in
     * CSV format.
     * @return a CSVFileData object or null if file format is wrong or file
     * cannot be found.
     * @throws FileNotFoundException
     * @throws NumberFormatException
     * @throws IOException
     */
    public CSVFileData readFile(String filepath) throws FileNotFoundException, NumberFormatException, IOException {

        String line, splitCharacter = ",";
        String[] lineElements;
        int numberOfElements;
        CSVFileData.Set set = new CSVFileData.Set();
        CSVFileData.Row row;

        /* Read File */
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            while ((line = reader.readLine()) != null) {
                row = new CSVFileData.Row();

                /* Don't process blank lines */
                if (!line.trim().isEmpty()) {
                    lineElements = line.split(splitCharacter);
                    numberOfElements = lineElements.length;
                    for (int index = 0; index < numberOfElements; index++) {
                        row.add(Integer.valueOf(lineElements[index]));
                    }
                }
                set.add(row);
            }
            reader.close();

            CSVFileData dataSet = new CSVFileData(set, filepath);
            return dataSet;
        }
    }
}
