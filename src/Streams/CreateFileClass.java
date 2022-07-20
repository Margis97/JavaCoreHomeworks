package Streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateFileClass {

    public static final String DELIMITER = ";";
    public static final String[] HEADERS = {"Id", "Value 1", "Value 2"};

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\User\\eclipse-workspace\\JavaCoreGB\\src\\Streams\\test.csv";

        AppData appDataToWrite = createSampleData();
        write(appDataToWrite, filePath);

        AppData appData = readFromFile(filePath);

        for (String header : appData.getHeader()) {
            System.out.print(header);
            System.out.print(" | ");
        }
        System.out.println();

        for (int[] row : appData.getData()) {
            for (int value : row) {
                System.out.print(value);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    private static AppData createSampleData() {
        int[][] data = new int[3][3];

        data[0][0] = 1; // Id
        data[0][1] = 101; // Value 1
        data[0][2] = 102; // Value 2

        data[1][0] = 2; // Id
        data[1][1] = 201; // Value 1
        data[1][2] = 202; // Value 2

        data[2][0] = 3; // Id
        data[2][1] = 301; // Value 1
        data[2][2] = 302; // Value 2

        AppData appData = new AppData();
        appData.setHeader(HEADERS);
        appData.setData(data);
        return appData;
    }

    private static void write(AppData appData, String filePath) throws IOException {

        try (FileWriter writer = new FileWriter(filePath)) {

            // writing header
            String header = createHeaderLineForCSV(appData.getHeader());
            writer.write(header);
            writer.write(System.lineSeparator());

            // writing data, line by line
            for (int[] singleRow : appData.getData()) {

                String rowAsString = createDataLineForCSV(singleRow);

                writer.write(rowAsString);
                writer.write(System.lineSeparator());
            }
        }
    }

    private static String createHeaderLineForCSV(String[] header) {
        return String.join(DELIMITER, header);
    }

    private static String createDataLineForCSV(int[] values) {
        String[] strings = new String[values.length];

        for (int i = 0; i < values.length; i++) {
            strings[i] = String.valueOf(values[i]);
        }

        return String.join(DELIMITER, strings);
    }

    private static AppData readFromFile(String filePath) throws IOException {
        AppData appData = new AppData();

        // create extendable storage for all rows
        List<String[]> dataRows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // read first line - it is a header
            String currentLine = br.readLine();

            appData.setHeader(currentLine.split(DELIMITER));

            // read data rows line by line while new line presents in the file
            while ((currentLine = br.readLine()) != null) {
                String[] values = currentLine.split(DELIMITER);

                // store each row in prepared data storage
                dataRows.add(values);
            }
        }

        // convert to int matrix
        int headerColumnsCount = appData.getHeader().length;
        int rowsCount = dataRows.size();

        int[][] data = new int[rowsCount][headerColumnsCount];

        // iterating row by row
        for (int i = 0; i < rowsCount; i++) {

            // iterating by columns in a current row
            String[] currentRow = dataRows.get(i);
            int currentRowColumnsCount = currentRow.length; 

            // get minimum column count in case of malformed CSV (which could contain more or less values in a row)
            int minimalColumnsCount = Math.min(headerColumnsCount, currentRowColumnsCount);

            // write each column from a row to the data[][]
            for (int j = 0; j < minimalColumnsCount; j++) {
                data[i][j] = Integer.parseInt(currentRow[j]);
            }
        }

        appData.setData(data);

        return appData;
    }
}
