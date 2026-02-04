import java.io.*;
import java.net.*;

public class Task1 {
    public static void main(String[] args) {
        URL myUrl;
        double sum = 0.0;
        int count = 0;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            String[] headers = null;
            int ulkoTaloIndex = -1;
            int dateIndex = -1;

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");

                if (headers == null) {
                    headers = columns;
                    for (int i = 0; i < headers.length; i++) {
                        if (headers[i].trim().equals("UlkoTalo")) {
                            ulkoTaloIndex = i;
                        }
                        if (headers[i].trim().equals("Aika")) {
                            dateIndex = i;
                        }
                    }
                } else {
                    if (dateIndex >= 0 && columns[dateIndex].contains("01.01.2023")) {
                        if (ulkoTaloIndex >= 0) {
                            String valueStr = columns[ulkoTaloIndex].trim().replace(",", ".");
                            double value = Double.parseDouble(valueStr);
                            sum += value;
                            count++;
                        }
                    }
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("Average temperature for Jan 1, 2023: %.2f °C", average);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}